package ro.fortech.practice;

public class GreetingMessageGenerator {
    public String generateGreetingMessage() {
        return generateGreetingMessage(null);
    }

    public String generateGreetingMessage(String personName) {
        if (personName == null) {
            return "Hello, stranger!";
        }
        return "Hello, " + personName + "!";
    }
}
