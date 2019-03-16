import java.util.List;


public class Fries implements Component{

  private String size;
  private String style = "";
  private double price;
  private int quantity = 1;

  public Fries(String size) {
    this.size = size;
    switch (size) {
      case "LTL":
        this.price = 2.79 * this.quantity;
        break;
      case "Reg":
        this.price = 3.39 * this.quantity;
        break;
      case "LRG":
        this.price = 5.59 * this.quantity;
        break;
    }
  }

  public Fries(String size, String style) {
    this.size = size;
    this.style = style;
    switch (size) {
      case "LTL":
        this.price = 2.79 * this.quantity;
        break;
      case "Reg":
        this.price = 3.39 * this.quantity;
        break;
      case "LRG":
        this.price = 5.59 * this.quantity;
        break;
    }
  }

  public Fries(String size, String style, int quantity) {
    this.size = size;
    this.style = style;
    this.quantity = quantity;
    switch (size) {
      case "LTL":
        this.price = 2.79 * this.quantity;
        break;
      case "Reg":
        this.price = 3.39 * this.quantity;
        break;
      case "LRG":
        this.price = 5.59 * this.quantity;
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


  public String getDescription(String pattern){
    String value = "";
    if (pattern.equals("receipt")) {
    value = this.quantity + "  " + this.size + " " + this.style + "                 " + String.format ("%.2f", this.getPrice());
    }
    else {
      value =  this.quantity + "  "  + this.size + " " + this.style;
    }
    return value;
  }


  public void addComponent(Component c) {}

  public void removeComponent(Component c) {}

  public List<Component> getComponents() {return null;}

  public int getPosition() {
    return 99;
  }
}
