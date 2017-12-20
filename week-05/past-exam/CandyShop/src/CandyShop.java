public class CandyShop {

  private int sugarInStore;
  private double moneyInStore;
  private int candyInStore;
  private int lollipopInStore;
  private double raisePercent;
  static final Candy CANDY = new Candy();
  static final Lollipop LOLLIPOP = new Lollipop();

  public CandyShop(int sugarToGet) {
    this.sugarInStore = sugarToGet;
    this.moneyInStore = 0;
    this.candyInStore = 0;
    this.lollipopInStore = 0;
    this.raisePercent = 0;
  }

  public int getSugarInStore() {
    return sugarInStore;
  }

  public void setSugarInStore(int sugarInStore) {
    this.sugarInStore = sugarInStore;
  }

  public double getMoneyInStore() {
    return moneyInStore;
  }

  public void setMoneyInStore(int moneyInStore) {
    this.moneyInStore = moneyInStore;
  }

  public int getCandyInStore() {
    return candyInStore;
  }

  public void setCandyInStore(int candyInStore) {
    this.candyInStore = candyInStore;
  }

  public int getLollipopInStore() {
    return lollipopInStore;
  }

  public void setLollipopInStore(int lollipopInStore) {
    this.lollipopInStore = lollipopInStore;
  }

  public double getRaisePercent() {
    return raisePercent;
  }

  public void setRaisePercent(int raisePercent) {
    this.raisePercent = raisePercent;
  }

  public void createSweets(Sweets type) {
    if (type instanceof Candy) {
      Candy candy = new Candy();
      sugarInStore -= candy.getSugarNeededGr();
      candyInStore++;
    } else if (type instanceof Lollipop) {
      Lollipop lolly = new Lollipop();
      sugarInStore -= lolly.getSugarNeededGr();
      lollipopInStore++;
    } else {
      System.out.println("Sorry, but that is not available in the Candy Shop");
    }
  }

  public void sell(Sweets type, int amount) {
    if (type instanceof Candy) {
      Candy candy = new Candy();
      moneyInStore += ((candy.getPriceInDollar()) * (1 + (raisePercent / 100)));
      candyInStore--;
    } else if (type instanceof Lollipop) {
      Lollipop lolly = new Lollipop();
      moneyInStore += (lolly.getPriceInDollar()) * (1 + (raisePercent / 100));
      lollipopInStore--;
    }else {
      System.out.println("Sorry, but that is not available in the Candy Shop");
    }
  }

  public void raise(int percent) {
    raisePercent += percent;
  }

  public void buySugar(int sugarBought) {
    sugarInStore += sugarBought;
    moneyInStore -= (sugarBought / 100) * 10;
  }

  @Override
  public String toString() {
    return "Invetory: " + this.candyInStore + " candies, " + this.lollipopInStore + " lollipops, Income: "
            + this.moneyInStore + "$, Sugar: " + this.sugarInStore + "gr";
  }
}
