package com.amakaj.mbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.amakaj.mbapi.repository") //test comment
public class MessageBoardApiApplication {
    private final Environment env;

    public MessageBoardApiApplication(Environment env)
    {
        this.env = env;
    }

    @Bean
    public DataSource dataSource() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));

        return dataSource;
    }

    // Main method
    public static void main(String[] args) {
        SpringApplication.run(MessageBoardApiApplication.class, args);
    }
}
