package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String text = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of " +
                "the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
        char[] charsInString = text.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char i : charsInString) {
            if (characterCount.containsKey(i)) {
               characterCount.put(i, characterCount.get(i) + 1);
            } else {
                characterCount.put(i, 1);
            }
        }
        for (Character i : characterCount.keySet()) {
            System.out.println(i + ": " + characterCount.get(i));
        }
    }
}
