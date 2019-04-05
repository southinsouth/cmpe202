
public class CreditCardCVCDecorator extends CreditCardCVC {
  private CreditCardCVC creditCardCVC;

  public CreditCardCVCDecorator(CreditCardCVC creditCardCVC) {
    this.creditCardCVC = creditCardCVC;
  }

  @Override
  public String display() {
    StringBuilder sb = new StringBuilder();
    sb.append("[" + this.creditCardCVC.display());
    int num = 3 - sb.length() + 1;
    while(num > 0) {
      sb.append("_");
      num--;
    }
    sb.append("]");
    return sb.toString();
  }

  @Override
  public void setNext(IKeyEventHandler next) {
    this.creditCardCVC.setNext(next);
  }

  @Override
  public void key(String ch, int cnt) {
    this.creditCardCVC.key(ch, cnt);
  }

  @Override
  public void addSubComponent(IDisplayComponent c) {
    this.creditCardCVC.addSubComponent(c);
  }
}