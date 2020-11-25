package com.djc8.java.play.playpgsql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@MapperScan("com.djc8.java.play.playpgsql.mapper")
public class PlaypgsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaypgsqlApplication.class, args);
    }

}
