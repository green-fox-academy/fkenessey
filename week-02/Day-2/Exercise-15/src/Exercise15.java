public class Exercise15 {
    public static void main(String[] args) {
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`
        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange red", "red", "tomato"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};
        String[][] colors = new String[3][5];
        for (int i = 0; i <green.length; i++) {
            colors[0][i] = green[i];
        }
        for (int j = 0; j <red.length; j++) {
            colors[1][j] = red[j];
        }
        for (int h = 0; h <pink.length; h++) {
            colors[2][h] = pink[h];
        }
        for (int g = 0; g <3; g++) {
            for (int f = 0; f <5-1; f++) {
                System.out.print("\"" + colors[g][f] + "\"");
            }
            System.out.println("\"" + colors[g][5-1] + "\"");
        }
    }
}
