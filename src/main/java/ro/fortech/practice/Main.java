package ro.fortech.practice;

public class Main {
    public static void main(String[] args) {
        String personName = "John Doe";
        GreetingMessageGenerator generator = new GreetingMessageGenerator();
        String message = generator.generateGreetingMessage(personName);
        System.out.println(message);
    }
}