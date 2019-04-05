/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
    private String number = "" ;
    private static final int NUM_LEN = 16;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	public String display() {
      return number;
	}

  public void key(String ch, int cnt) {
    if ( cnt <= 16 )
      if(ch.equals("X")) {
        if(cnt < 16) {
          number = number.substring(0,number.length()-1);
        }else if ( nextHandler != null ) {
          nextHandler.key(ch, cnt);
        }
      }else {
        number += ch;
      }
    else if ( nextHandler != null ) {
      nextHandler.key(ch, cnt);
    }
  }

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}