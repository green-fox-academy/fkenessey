import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        // Add "a" to every string in the far list.
        System.out.println("original: " + far);

        for (int i = 0; i <far.size() ; i++) {
            String content = "";
            content = far.get(i);
            far.set(i,content + "a");
        }

        System.out.println("revised: " + far);
    }
}
