package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getFamilyShouldReturnFelineFamily() {
        Feline feline = new Feline();

        String actualFamily = feline.getFamily();

        assertEquals("Кошачьи", actualFamily);
    }

    @Test
    public void eatMeatShouldReturnPredatorFood()
            throws Exception {

        Feline feline = new Feline();

        List<String> actualFood = feline.eatMeat();

        assertEquals(
                Arrays.asList(
                        "Животные",
                        "Птицы",
                        "Рыба"
                ),
                actualFood
        );
    }

    @Test
    public void getKittensWithoutArgumentShouldReturnOne() {
        Feline feline = new Feline();

        int actualKittens = feline.getKittens();

        assertEquals(1, actualKittens);
    }

    @Test
    public void getKittensWithArgumentShouldReturnGivenNumber() {
        Feline feline = new Feline();

        int actualKittens = feline.getKittens(5);

        assertEquals(5, actualKittens);
    }
}