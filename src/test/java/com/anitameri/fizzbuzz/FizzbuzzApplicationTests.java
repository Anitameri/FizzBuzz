package com.anitameri.fizzbuzz;



import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class FizzbuzzApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void fizzBuzzconverterLeavesNormalNumberAlone(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals( "1", fizzBuzz.convert(1));
        Assert.assertEquals( "2", fizzBuzz.convert(2));

    }

    @Test
    public void multipleThreeAndFive () {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));

    }

    @Test
    public void multipleThree () {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    public void multipleFive () {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Buzz", fizzBuzz.convert(5));

    }

}
