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
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundShouldReturnMeow() {
        Cat cat = new Cat(feline);

        String actualSound = cat.getSound();

        assertEquals("Мяу", actualSound);
    }

    @Test
    public void getFoodShouldReturnFoodFromPredator()
            throws Exception {

        List<String> expectedFood =
                Arrays.asList(
                        "Животные",
                        "Птицы",
                        "Рыба"
                );

        when(feline.eatMeat())
                .thenReturn(expectedFood);

        Cat cat = new Cat(feline);

        List<String> actualFood = cat.getFood();

        assertEquals(expectedFood, actualFood);
    }
}