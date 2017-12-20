public class Sweets {
  private int sugarNeededGr;
  private double priceInDollar;

  public Sweets() {
  }

  public Sweets(int sugarNeeded, int price) {
    this.sugarNeededGr = sugarNeeded;
    this.priceInDollar = price;
  }

  public int getSugarNeededGr() {
    return sugarNeededGr;
  }

  public double getPriceInDollar() {
    return priceInDollar;
  }

  public void setSugarNeededGr(int sugarNeededGr) {
    this.sugarNeededGr = sugarNeededGr;
  }

  public void setPriceInDollar(double priceInDollar) {
    this.priceInDollar = priceInDollar;
  }
}
