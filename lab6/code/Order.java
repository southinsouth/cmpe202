import java.util.*;

public class Order implements Component{

  private int orderNumber;
  private double receivedMon;
  private List<Component> components;
  private double price = 0.00;
  static double taxRate = 0.09;
  private double tax = 0.00;
  private int pattyNumber;
  //private PrintStrategy receiptStrategy;


  public Order(int orderNumber, double receivedMon) {
    this.orderNumber = orderNumber;
    this.receivedMon = receivedMon;
    this.components = new LinkedList<>();
  }

  public double getPrice(){
    this.price = 0.0;
    for (Component c : components ){
      this.price += c.getPrice() ;
    }
    return price;
  }

  public int getPattyNumber(){
    pattyNumber = 0;
    for (Component c : components ){
      if (c instanceof Burger){
        pattyNumber += 1;
      }
    }
    return pattyNumber;
  }

  public double getTax(){
    this.tax = 0.0;
    for (Component c : components ){
      this.tax += c.getPrice() * taxRate;
    }
    return tax;
  }

  public String getDescription(String pattern) {

    String value = "";

    if (pattern.equals("receipt")) {

      value += "          FIVE GUYS\n";
      value += "      BURGERS AND FRIES\n";
      value += "       STORE # CA-1294\n";
      value += "    5353 ALMADEN EXPY N60\n";
      value += "      SAN JOSE, CA 95118\n";
      value += "       (P) 408-264-9300\n\n\n";
      value += "    12/1/2016    1:46:54 PM\n\n";
      value += "           FIVE GUYS\n";
      value += "Order Number:   ";
      value += this.orderNumber;
      value += "\n";

      for (Component c : components ){
        value = value + c.getDescription(pattern) + "\n" ;
      }

      value += "\nSub. Total:";
      value += "               $";
      value += String.format ("%.2f", this.getPrice());

      value += "\nTax:";
      value += "                      $";
      value += String.format ("%.2f", this.getTax());

      value += "\nTotal:";
      value += "                    $";
      value += String.format("%.2f",this.getPrice() + this.getTax());

      value += "\n\nCash $";
      value += String.format("%.1f",this.receivedMon);
      value += "               $";
      value += String.format("%.2f",this.receivedMon);

      value += "\nChange";
      value += "                   $";
      value += String.format("%.2f",this.receivedMon - this.getPrice() - this.getTax());

      value += "\nRegister:1   Tran Seq No: 57845 \n";
      value += "Cashier:Sakda* S.\n";
      value += "  ***************************\n";
      value += "Don't throw away your receipt!!!\n\n";
      value += "Help Five Guys and you could win!";
    }
    else {
      value += ("Patties - " + this.getPattyNumber() + "\n\n");
      value += "\nOrder Number:   ";
      value += this.orderNumber;
      value += "\n";
      value += "    12/1/2016    1:46:54 PM\n\n";
      value += "           FIVE GUYS\n";
      value += ("Sandwich# " + this.getPattyNumber() + "\n");
      for (Component c : components ){
        value = value + c.getDescription(pattern) + "\n" ;
      }
      value += "\nRegister:1   Tran Seq No: 57845 \n";
      value += "Cashier:Sakda* S.\n";
    }
    return value;

  }

  public void addComponent(Component c){
    this.components.add(c);
  }

  public void removeComponent(Component c){
    this.components.remove(c);
  }

  public List<Component> getComponents(){
    return this.components;
  }

  public int getPosition() {
    return 99;
  }
}
