package com.example.productStore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

//@SpringBootTest
public class RandomTest {
    @Test
    public void checkIfOutputLessThan10(){
        Random random = new Random();
        int result = random.nextInt();

        assert(result<10);
    }
}
