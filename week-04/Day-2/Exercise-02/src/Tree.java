public class Tree extends Plant {

  public Tree(String name) {
    this.setWaterAmount(0);
    this.setNeedsWater(true);
    this.setLevel(10);
    this.setSoak(0.4);
    this.setName(name);
  }

  public Tree(int waterAmount, boolean needsWater, int level, double soak, String name) {
    super(waterAmount, needsWater, level, soak, name);
  }
}
