public class Main {
  public static void main(String[] args) {
    Farm animalfarm = new Farm();
    System.out.println(animalfarm);
    animalfarm.breed(0);
    animalfarm.breed(2);
    animalfarm.breed(4);
    System.out.println(animalfarm);
    animalfarm.slaughter();
    System.out.println(animalfarm);
  }
}
