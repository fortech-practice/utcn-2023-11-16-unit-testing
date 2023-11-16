package ro.fortech.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingMessageGeneratorTest {

    @Test
    void generateGreetingMessageForStranger() {
        Clock clock = new Clock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);
        String message = generator.generateGreetingMessage();
        assertEquals("Good evening, stranger!", message);
    }

    @Test
    void generateGreetingMessageForJohnDoe() {
        Clock clock = new Clock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);
        String message = generator.generateGreetingMessage("John Doe");
        assertEquals("Good evening, John Doe!", message);
    }
}