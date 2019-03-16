import java.util.List;


public interface Component {

  public void addComponent(Component c);

  public void removeComponent(Component c);

  public String getDescription(String pattern);

  public double getPrice();

  public int getPosition();

  public List<Component> getComponents();

}
