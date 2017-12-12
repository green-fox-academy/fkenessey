public class Flower extends Plant{

  public Flower(String name) {
    this.setWaterAmount(0);
    this.setNeedsWater(true);
    this.setLevel(5);
    this.setSoak(0.75);
    this.setName(name);
  }

  public Flower(int waterAmount, boolean needsWater, int level, double soak, String name) {
    super(waterAmount, needsWater, level, soak, name);
  }
}
