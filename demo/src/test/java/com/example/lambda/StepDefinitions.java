package com.example.lambda;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private String input;
    private int duplicateCount;

    @Given("the input string is {string}")
    public void the_input_string_is(String str) {
        input = str;
    }

    @When("I count duplicate characters")
    public void i_count_duplicate_characters() {
        duplicateCount = countDuplicates(input);
    }

    @Then("the duplicate count should be {int}")
    public void the_duplicate_count_should_be(int expected) {
        assertEquals(expected, duplicateCount);
    }

    private int countDuplicates(String str) {
        str = str.toLowerCase();
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

