import  java.util.*;

public class Exercise15 {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Rezso");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Gerzson");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Aurel");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Zsombor");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "Teodor");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candies

        //Finding more than 4 candies
        String candymonsters = "";
        Object op = null;
        Object on = null;
        Object oa = null;
        String name = "";
        int a = 0;
        float age = 0;
        for (int i = 0; i < map.size(); i++) {
            op = map.get(i).get("candies");
            a = Integer.parseInt(op.toString());
            if (a > 4) {
                on = map.get(i).get("name");
                name = on.toString();
                candymonsters = candymonsters.concat(" - " + name + " - ");
            }
        }
        System.out.println("Entries with more than 4 candies: " + candymonsters);

        //Sum of the ages
        a = 0;
        for (int j = 0; j < map.size(); j++) {
            op = map.get(j).get("candies");
            a = Integer.parseInt(op.toString());
            if (a < 5) {
                oa = map.get(j).get("age");
                //age = age + Integer.parseInt(oa.toString());
                age = age + Float.parseFloat(oa.toString());
            }
        }
             System.out.println("Sum of ages of entries with less than 5 candies: " + age);
    }
}
