package com.nhan.orm.initial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@ComponentScan("com.nhan.orm.controllers")
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        dataSource.setDriverClassname("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql//localhost:3306/orm?useSSL=fasle");
        dataSource.setUsername("root");
        dataSource.setPassword("qweqwe1993");
        return dataSource;
    }
}
