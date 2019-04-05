public class CreditCardNumDecorator extends CreditCardNum {
  private CreditCardNum cardNum;

  public CreditCardNumDecorator( CreditCardNum cardNum) {
    this.cardNum = cardNum;
  }

  @Override
  public String display() {
    StringBuilder sb = new StringBuilder();
    sb.append( "["+ this.cardNum.display());
    int num = sb.length()-1;
    int total = 1;
    int i = 1; // cur slot
    while(total <= 16) {
      if(total > num) {
        sb.append("_");
      }
      if( total % 4 == 0 && total < 16 ) {
        sb.insert(i+1, " ");
        i++;
      }
      i++;
      total++;
    }
    sb.append("]  ");
    return sb.toString();
  }

  @Override
  public void setNext(IKeyEventHandler next) {
    this.cardNum.setNext(next);
  }

  @Override
  public void key(String ch, int cnt) {
    this.cardNum.key(ch, cnt);
  }

  @Override
  public void addSubComponent(IDisplayComponent c) {
    this.cardNum.addSubComponent(c);
  }
}