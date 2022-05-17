package com.anitameri.fizzbuzz;

import org.junit.jupiter.api.Test;




public class FizzbuzzAppTestActual {

    @Test
    public void outputTheHundredFizzBuzz(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i=1; i<=100; i++)
        System.out.println(fizzBuzz.convert(i));

    }
}