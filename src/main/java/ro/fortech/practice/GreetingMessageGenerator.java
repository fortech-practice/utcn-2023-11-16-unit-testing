package ro.fortech.practice;

public class GreetingMessageGenerator {
    private final Clock clock;

    public GreetingMessageGenerator(Clock clock) {
        this.clock = clock;
    }

    public String generateGreetingMessage() {
        return generateGreetingMessage(null);
    }

    public String generateGreetingMessage(String personName) {
        String momentOfDay = getMomentOfDay();
        if (personName == null) {
            return "Good " + momentOfDay + ", stranger!";
        }
        return "Good " + momentOfDay + ", " + personName + "!";
    }

    private String getMomentOfDay() {
        int hourOfDay = clock.getHourOfDay();
        if ((4 <= hourOfDay) && (hourOfDay < 12)) {
            return "morning";
        }
        if ((12 <= hourOfDay) && (hourOfDay < 18)) {
            return "afternoon";
        }
        if ((18 <= hourOfDay) && (hourOfDay < 23)) {
            return "evening";
        }
        return "night";
    }
}