public class Sweets {
  private int sugarNeededGr;
  private int priceInDollar;

  public Sweets() {
  }

  public Sweets(int sugarNeeded, int price) {
    this.sugarNeededGr = sugarNeeded;
    this.priceInDollar = price;
  }

  public int getSugarNeededGr() {
    return sugarNeededGr;
  }

  public int getPriceInDollar() {
    return priceInDollar;
  }

  public void setSugarNeededGr(int sugarNeededGr) {
    this.sugarNeededGr = sugarNeededGr;
  }

  public void setPriceInDollar(int priceInDollar) {
    this.priceInDollar = priceInDollar;
  }
}
