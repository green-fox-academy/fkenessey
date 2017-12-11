public class Car {
  private int gasAmount;

  private int capacity;

  public Car() {
    this.gasAmount = 0;
    this.capacity = 100;
  }

  public Car(int gasAmount, int capacity) {
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int getGasAmount() {
    return this.gasAmount;
  }

  public int addGasAmount(int fillGasAmount) {
    return gasAmount += fillGasAmount;
  }

  @Override
  public String toString() {
    return "car: \n" + gasAmount + " " + capacity;
  }
}
