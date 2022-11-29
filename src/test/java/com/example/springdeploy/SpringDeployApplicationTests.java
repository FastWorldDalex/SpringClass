package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;

@SpringBootTest
class SpringDeployApplicationTests {

    @Test
    void contextLoads() {

        System.getenv().forEach(
                (Key, value) -> System.out.println(Key + value)
        );
    }

}
