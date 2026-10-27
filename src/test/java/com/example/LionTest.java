package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensShouldReturnValueFromFeline()
            throws Exception {

        when(feline.getKittens())
                .thenReturn(3);

        Lion lion = new Lion(
                "Самец",
                feline
        );

        int actualKittens = lion.getKittens();

        assertEquals(3, actualKittens);
    }

    @Test
    public void getFoodShouldReturnValueFromFeline()
            throws Exception {

        List<String> expectedFood =
                Arrays.asList(
                        "Животные",
                        "Птицы",
                        "Рыба"
                );

        when(feline.getFood("Хищник"))
                .thenReturn(expectedFood);

        Lion lion = new Lion(
                "Самец",
                feline
        );

        List<String> actualFood =
                lion.getFood();

        assertEquals(
                expectedFood,
                actualFood
        );
    }

    @Test(expected = Exception.class)
    public void constructorShouldThrowExceptionForInvalidSex()
            throws Exception {

        new Lion(
                "Неизвестный пол",
                feline
        );
    }
}