public class Exercise3 {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        System.out.println("Original: " + quote);
        //quote = quote.replace("It", "It always takes longer than");

        String part1 = quote.substring(0, 20);
        String part2 = quote.substring(20);
        //System.out.println(part1);
        //System.out.println(part2);
        quote = part1 + " always takes longer than" + part2;



        System.out.println("Revised: " + quote);
    }
}

