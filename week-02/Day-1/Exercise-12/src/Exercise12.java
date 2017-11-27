public class Exercise12 {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        int a = 2;
        int b = 3;
        int c = 4;
        int surface = 0;
        int volume = 0;
        surface = 2 * ((a * b) + (a * c) + (b * c));
        volume = a * b * c;
        System.out.println("side a: " + a);
        System.out.println("side b: " + b);
        System.out.println("side c: " + c);
        System.out.println("Surface: " + surface);
        System.out.println("Volume: " + volume);
    }
}
