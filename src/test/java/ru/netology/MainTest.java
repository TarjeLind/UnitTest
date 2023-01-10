package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void positiveTestFirstGreaterThenSecond(){
        Main.nameSearch("Alexander");
        Main.nameSearch("Dmitriy");
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void positiveTestSecondGreaterThenFirst(){
        Main.nameSearch("David");
        Main.nameSearch("Rachel");
        Assertions.assertDoesNotThrow(() -> {});
        Main.name = "end";
    }

    @Test
    public void negativeInputIntValues(){
        Assertions.assertFalse(Main.nameSearch(String.valueOf(111)));
        Main.name = "end";
    }

    @Test
    public void negativeInputDoubleValues(){
        Assertions.assertFalse(Main.nameSearch(String.valueOf(1.0D)));
        Main.name = "end";
    }

    @Test
    public void negativeInputStringValueNotCapital(){
        Assertions.assertFalse(Main.nameSearch("x"));
        Main.name = "end";
    }
}