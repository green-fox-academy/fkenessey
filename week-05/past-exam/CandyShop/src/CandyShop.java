public class CandyShop {

  private int sugarInStore;
  private int moneyInStore;
  private int candyInStore;
  private int lollipopInStore;
  private int raisePercent;
  static Candy CANDY = new Candy();
  static Lollipop LOLLIPOP = new Lollipop();

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

  public int getMoneyInStore() {
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

  public int getRaisePercent() {
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
      moneyInStore += candy.getPriceInDollar();
      candyInStore--;
    } else if (type instanceof Lollipop) {
      Lollipop lolly = new Lollipop();
      moneyInStore += lolly.getPriceInDollar();
      lollipopInStore--;
    }else {
      System.out.println("Sorry, but that is not available in the Candy Shop");
    }
  }

  @Override
  public String toString() {
    return "Invetory: " + this.candyInStore + " candies, " + this.lollipopInStore + " lollipops, Income: "
            + this.moneyInStore + "$, Sugar: " + this.sugarInStore + "gr";
  }
}
