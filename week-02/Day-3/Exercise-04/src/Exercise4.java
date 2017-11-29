public class Exercise4 {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention
        System.out.println("original: " + todoText);
        // Expected outpt:
        String part1 = "My " + (char)27 + "[33mtodo:\n" + (char)27 + "[0m";
        String part2 = " - Download games\n";
        String part3 = "\t- Diablo";
        todoText = part1.concat(todoText).concat(part2).concat(part3);
        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println("revised: \n" + todoText);
    }
}
