package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void bmiTest(){
       Person person = new Person(65.4f, 1.5f);
       Assertions.assertEquals(65.4f/(1.5f*1.5f), person.bmi());
    }
}
