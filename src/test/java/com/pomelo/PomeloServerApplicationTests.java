package com.pomelo;

import com.pomelo.util.RandomStringGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PomeloServerApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testRandomStringGenerator() {
        String randomStr = RandomStringGenerator.generate();
        System.out.println(randomStr);
        System.out.println(randomStr.length());
    }
}
