public class Station {
  private int gasAmount;

  public Station() {
    this.gasAmount = 1000;
  }
  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int refill(Car auto) {
    int change = auto.getCapacity() - auto.getGasAmount();
    this.gasAmount -= change;
    return auto.addGasAmount(change);
  }

  @Override
  public String toString() {
    return "station:\n" + gasAmount;
  }
}
