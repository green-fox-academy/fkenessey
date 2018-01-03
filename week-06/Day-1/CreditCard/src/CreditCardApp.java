import com.greenfox.bx.*;

public class CreditCardApp {
  public static void main(String[] args) {

    CreditCard creditCard = new CreditCard();
    System.out.println("Name=" + creditCard.getNameCardholder() + " CC#=" + creditCard.getCodeAccount() + " CVV=" + creditCard.getSumCVV());
  }
}
