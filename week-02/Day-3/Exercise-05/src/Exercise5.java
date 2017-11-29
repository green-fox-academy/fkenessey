import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        System.out.println("original: " + reversed);
        int size = reversed.length();
        String reversed1 = reverse(reversed, size);
        System.out.println("reversed - type A: " + reversed1);
        String reversed2 = reverse2(reversed, size);
        System.out.println("reversed - type B: " + reversed2);
    }
    public static String reverse(String input, int bigness) {
        char memory;
        StringBuilder answer = new StringBuilder(input);
        for (int i = 0; i <bigness ; i++) {
            memory = input.charAt(i);
            answer.setCharAt(i,input.charAt(bigness-1));
            answer.setCharAt(bigness-1,memory);
            bigness--;
        }
        input = answer.toString();
        return input;
    }
    public static String reverse2(String input2, int bigness2) {
        String[] answer2 = new String[--bigness2];
        int till = bigness2;
        for (int j = 0; j <bigness2-1 ; j++) {
            answer2[j] = input2.substring(till-1,till);
            answer2[till-1]= input2.substring(j,j+1);
            till--;
        }
        input2 = "";
        for (int h = 0; h <bigness2; h++) {
            input2 = input2.concat(answer2[h]);
        }
        return input2;
    }
}
