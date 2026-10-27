package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFoodShouldReturnPlantsForHerbivore()
            throws Exception {

        Animal animal = new Animal();

        List<String> actualFood =
                animal.getFood("Травоядное");

        assertEquals(
                Arrays.asList(
                        "Трава",
                        "Различные растения"
                ),
                actualFood
        );
    }

    @Test
    public void getFoodShouldReturnMeatForPredator()
            throws Exception {

        Animal animal = new Animal();

        List<String> actualFood =
                animal.getFood("Хищник");

        assertEquals(
                Arrays.asList(
                        "Животные",
                        "Птицы",
                        "Рыба"
                ),
                actualFood
        );
    }

    @Test(expected = Exception.class)
    public void getFoodShouldThrowExceptionForUnknownAnimal()
            throws Exception {

        Animal animal = new Animal();

        animal.getFood("Неизвестное животное");
    }

    @Test
    public void getFamilyShouldReturnAnimalFamilies() {

        Animal animal = new Animal();

        String actualFamily =
                animal.getFamily();

        assertEquals(
                "Существует несколько семейств: "
                        + "заячьи, беличьи, мышиные, кошачьи, "
                        + "псовые, медвежьи, куньи",
                actualFamily
        );
    }
}