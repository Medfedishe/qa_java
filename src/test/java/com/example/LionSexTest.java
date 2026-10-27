package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String sex;
    private final boolean expectedMane;

    public LionSexTest(
            String sex,
            boolean expectedMane
    ) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters(name = "Пол: {0}")
    public static Collection<Object[]> getSexData() {
        return Arrays.asList(
                new Object[][]{
                        {"Самец", true},
                        {"Самка", false}
                }
        );
    }

    @Test
    public void doesHaveManeShouldReturnExpectedValue()
            throws Exception {

        Lion lion = new Lion(
                sex,
                new Feline()
        );

        assertEquals(
                expectedMane,
                lion.doesHaveMane()
        );
    }
}