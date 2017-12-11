public class Main {
  public static void main(String[] args) {
    Car porsche = new Car();
    Station shell = new Station();

    int carGasAmount = porsche.getGasAmount();
    int carCapacity  = porsche.getCapacity();

    System.out.println(porsche);
    System.out.println(shell);
    shell.refill(porsche);
    System.out.println(porsche);
    System.out.println(shell);
  }
}
