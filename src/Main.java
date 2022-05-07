import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * For a given string, execute the following rules:
         *      - Delete all vowels.
         *      - Insert the character "." before each consonant.
         *      - Replace all uppercase consonants with lowercase ones.
         */

        // Vowels and consonants are still vowels and consonants regardless of their case.
        // This means it's safe to normalize inputs with to lower case right off the bat.
        // After all vowels are deleted, ALL letters will be consonants. This means that all letters will be separated by ".".

        final String vowels = "aeiouy";

        Scanner s = new Scanner(System.in);
        String input = s.nextLine().toLowerCase();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if(!vowels.contains(String.valueOf(c)))
                output.append(".").append(c);
        }
        System.out.println(output);


    }
}