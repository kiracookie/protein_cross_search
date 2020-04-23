package org.kiracookie.seau.protein_cross_search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.kiracookie.seau.protein_cross_search.dao")
public class ProteinCrossSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProteinCrossSearchApplication.class, args);
    }

}
