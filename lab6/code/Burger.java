import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class Burger implements Component{


  private List<Component> toppings;
  private double price;
  private String burgerType;
  private int quantity = 1;

  public Burger(String burgerType) {

    this.toppings = new LinkedList<>();
    this.burgerType = burgerType;

    switch (burgerType) {

      case "BB":
        this.price = 7.19 * this.quantity;
        this.addComponent(new Topping("BACON"));
        break;
      case "BC":
        this.price = 7.79 * this.quantity;
        this.addComponent(new Topping("CHEESE"));
        break;
      case "LBC":
        this.price = 5.29 * this.quantity;
        this.addComponent(new Topping("CHEESE"));
        break;
      case "LBB":
        this.price = 5.59 * this.quantity;
        this.addComponent(new Topping("BACON"));
        break;
    }
  }


  public int getQuantity(){
    return this.quantity;
  }

  public void setQuantity( int quantity ){
    this.quantity = quantity;
  }

  public double getPrice() {
    return this.price;
  }

  public int getPosition() {
    return 99;
  }


  public String getDescription(String pattern){

    String value = "";
    if (pattern.equals("receipt") ) {
      value += (this.quantity + "  " + this.burgerType + "                     " + String.format("%.2f",this.price) + "\n");
      for (Component t : toppings ){
        value = value + t.getDescription(pattern) + "\n" ;
      }
    }
    else {
      value += (this.quantity + "    " + this.burgerType + "\n");

      toppings.sort(new Comparator<Component>() {
        @Override
        public int compare(Component o1, Component o2) {
          return o1.getPosition() < o2.getPosition() ? 1 : -1;
        }
      });

      for (Component t :  toppings){
        value = value + t.getDescription(pattern) + "\n" ;
      }
    }

    return value;

  }
  public void addComponent(Component c) {this.toppings.add(c);}

  public void removeComponent(Component c) {this.toppings.remove(c);}

  public List<Component> getComponents() {return null;}

}
