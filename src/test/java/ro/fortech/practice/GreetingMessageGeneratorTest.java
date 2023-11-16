package ro.fortech.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingMessageGeneratorTest {

    @Test
    void generateGreetingMessage() {
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage();
        assertEquals("Hello, stranger!", message);
    }

    @Test
    void generateGreetingMessageForJohnDoe() {
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage("John Doe");
        assertEquals("Hello, John Doe!", message);
    }
}