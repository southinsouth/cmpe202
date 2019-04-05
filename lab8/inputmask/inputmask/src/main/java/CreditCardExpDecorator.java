public class CreditCardExpDecorator extends CreditCardExp{
  private CreditCardExp creditCardExp;

  public CreditCardExpDecorator(CreditCardExp creditCardExp) {
    this.creditCardExp = creditCardExp;
  }

  @Override
  public String display() {
    StringBuilder sb = new StringBuilder();
    sb.append("[" + this.creditCardExp.display());
    int num = sb.length()-1;
    if(num <= 2) {
      while(num < 2) {
        sb.append("M");
        num++;
      }
      sb.append("/");
    }else {
      sb.insert(3,"/");
    }
    while(num < 4) {
      sb.append("Y");
      num++;
    }
    sb.append("]  ");
    return sb.toString();
  }

  @Override
  public void setNext(IKeyEventHandler next) {
    this.creditCardExp.setNext(next);
  }

  @Override
  public void key(String ch, int cnt) {
    this.creditCardExp.key(ch, cnt);
  }

  @Override
  public void addSubComponent(IDisplayComponent c) {
    this.creditCardExp.addSubComponent(c);
  }
}