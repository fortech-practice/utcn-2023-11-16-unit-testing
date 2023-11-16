package ro.fortech.practice;

import java.util.Calendar;

public class GreetingMessageGenerator {
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
        int hourOfDay = getHourOfDay();
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

    private int getHourOfDay() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }
}