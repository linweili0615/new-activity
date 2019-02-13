package com.activity.test.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Configuration
@MapperScan(basePackages = "com.activity.test.dao")  //扫描dao
public class MybatisConfig {

    @Bean("deploy")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.deploy")
    public DataSource deploy(){
        return DataSourceBuilder.create().build();
    }

    @Bean("sms")
    @ConfigurationProperties(prefix = "spring.datasource.sms")
    public DataSource sms(){
        return DataSourceBuilder.create().build();
    }

    @Bean("dynamicDataSource")
    public DataSource dynamicDataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put("deploy",deploy());
        dataSourceMap.put("sms",sms());
        // 将 deploy 数据源作为默认指定的数据源
        dynamicDataSource.setDefaultDataSource(deploy());
        // 将 deploy 和 sms 数据源作为指定的数据源
        dynamicDataSource.setDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        // 配置数据源，此处配置为关键配置，如果没有将 dynamicDataSource作为数据源则不能实现切换
        sessionFactoryBean.setDataSource(dynamicDataSource());
        //扫描dto
        sessionFactoryBean.setTypeAliasesPackage("com.activity.test.dto");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        // 扫描映射文件
        sessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:**/mappers/*.xml"));
        return sessionFactoryBean;
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        // 配置事务管理, 使用事务时在方法头部添加@Transactional注解即可
        return new DataSourceTransactionManager(dynamicDataSource());
    }












}
