package ro.fortech.practice;

public class Main {
    public static void main(String[] args) {
        String personName = "John Doe";
        Clock clock = new Clock();
        GreetingMessageGenerator generator = new GreetingMessageGenerator(clock);
        String message = generator.generateGreetingMessage(personName);
        System.out.println(message);
    }
}