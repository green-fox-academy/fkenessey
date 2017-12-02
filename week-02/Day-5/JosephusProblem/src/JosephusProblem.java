import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = scanner.nextInt();
        Boolean[] group = new Boolean[n];
        for (int j = 0; j <n; j++) {
            group[j] = true;
        }
        int i = 0;
        int count = 0;
        while (count < n-1) {
            while (group[i] != true) {
                if (i != n-1) {
                    i++;
                } else {
                    i = 0;
                }
            }
            if (i != n-1) {
                i++;
            } else {
                i = 0;
            }
            while (group[i] != true) {
                if (i != n-1) {
                    i++;
                } else {
                    i = 0;
                }
            }
            group[i] = false;
            count++;
        }
        System.out.println("The last position: " + (Arrays.asList(group).indexOf(true) + 1));
        System.out.println(Arrays.toString(group));
    }
}