package org.sparta.hh_lv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HhLv2Application {

    public static void main(String[] args) {
        SpringApplication.run(HhLv2Application.class, args);
    }

}
