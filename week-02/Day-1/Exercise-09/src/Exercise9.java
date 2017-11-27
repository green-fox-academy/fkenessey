public class Exercise9 {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bmi = 0;
        bmi = ((massInKg / heightInM) / heightInM);

        // Print the Body mass index (BMI) based on these values
        System.out.println("Body mass index (BMI) based on these values: " + bmi);

        bmi = 0;
        bmi = (massInKg / heightInM / heightInM);
        System.out.println("Body mass index (BMI) based on these values: " + bmi);

    }
}
