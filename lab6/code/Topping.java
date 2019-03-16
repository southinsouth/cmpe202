
import java.util.List;



public class Topping implements Component {

  private String toppingName;
  private int position;

  public Topping(String toppingName) {
    this.toppingName = toppingName;
    switch (toppingName) {
      case "BACON":
        this.position = -1;
        break;
      case "G ONION":
        this.position = 0;
        break;
      case "JALA Grilled":
        this.position = 0;
        break;
      default:
        this.position = 1;
        break;
    }
  }

  public int getPosition(){
    return this.position;
  }

  public double getPrice() {return 0;}

  public String getDescription(String pattern){
      String value = "";
    switch (position) {

      case -1:
        value += ("{{{{ " + toppingName + " }}}}");
        break;
      case 0:
        value += ("->|" + toppingName);
        break;
        case 1:
          value += toppingName;
          break;


    }
      return "   " + value;
  }



  public void addComponent(Component c) {}

  public void removeComponent(Component c) {}

  public List<Component> getComponents() {return null;}
}
