package org.example;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;


public class TestFaker {
    @Test
    public void testFake(){
        Faker faker = new Faker ();
        String name = faker.name().fullName();
        String firstName =faker.name().firstName();
        System.out.println(name);
        System.out.println(firstName);
    }
}
