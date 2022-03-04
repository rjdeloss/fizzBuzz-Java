package fizzBuzz.Java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;


public class FizzBuzzTest {

    private ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
    private PrintStream outputStream = new PrintStream(newConsole);

    private void setInput(String value) {
        InputStream in = new ByteArrayInputStream(value.getBytes());
        System.setIn(in);
    }

    @Before
    public  void setup() {
        System.setOut(outputStream);
    }

    @Test
    public void if_3_replace_with_fizz() {
        String three = "3";
        setInput(three);

        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.doFizzBuzz();

        Assert.assertEquals("1\n2\nFizz\n", newConsole.toString());
        Assert.assertTrue(newConsole.toString().contains("1"));
        Assert.assertTrue(newConsole.toString().contains("2"));
        Assert.assertTrue(newConsole.toString().contains("Fizz"));
    }

    @Test
    public void if_5_replace_with_fizz() {
        String five = "5";
        setInput(five);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.doFizzBuzz();
        Assert.assertEquals("1\n2\nFizz\n4\nBuzz\n", newConsole.toString());
    }

    @Test
    public void if_15_replace_with_fizzbuzz() {
        String fifteen = "15";
        setInput(fifteen);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.doFizzBuzz();
        Assert.assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", newConsole.toString());
    }

    @Test
    public void if_0_ask_again() {
        String fifteen = "0 1";
        setInput(fifteen);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.doFizzBuzz();
        Assert.assertTrue(newConsole.toString().contains("please enter a number between 1 and 100"));
    }

    @Test
    public void if_101_ask_again() {
        String hundred = "101 1";
        setInput(hundred);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.doFizzBuzz();
        Assert.assertTrue(newConsole.toString().contains("please enter a number between 1 and 100"));
    }
}
