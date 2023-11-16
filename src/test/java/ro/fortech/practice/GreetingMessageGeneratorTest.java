package ro.fortech.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingMessageGeneratorTest {

    @Test
    void generateGreetingMessageForStranger() {
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage();
        assertEquals("Good evening, stranger!", message);
    }

    @Test
    void generateGreetingMessageForJohnDoe() {
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage("John Doe");
        assertEquals("Good evening, John Doe!", message);
    }
}