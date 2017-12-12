public class Plant {
  private int waterAmount;
  private boolean needsWater;
  private int level;
  private double soak;
  private String name;

  public Plant() {
    this.waterAmount = 0;
    this.needsWater = true;
  }

  public Plant(int waterAmount, boolean needsWater, int level, double soak, String name) {
    this.waterAmount = waterAmount;
    this.needsWater = needsWater;
    this.level = level;
    this.soak = soak;
    this.name = name;
  }

  public int getWaterAmount() {
    return waterAmount;
  }

  public boolean isNeedsWater() {
    return needsWater;
  }

  public int getLevel() {
    return level;
  }

  public double getSoak() {
    return soak;
  }

  public String getName() {
    return name;
  }

  public void setWaterAmount(int waterAmount) {

    this.waterAmount = waterAmount;
  }

  public void setNeedsWater(boolean needsWater) {
    this.needsWater = needsWater;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setSoak(double soak) {
    this.soak = soak;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void checkIfNeedsWater() {
    if (this.waterAmount < this.level) {
      setNeedsWater(true);
    } else {
      setNeedsWater(false);
    }
  }

  public void setWater(int amount) {
    this.waterAmount += amount * soak;
    checkIfNeedsWater();
  }

}
