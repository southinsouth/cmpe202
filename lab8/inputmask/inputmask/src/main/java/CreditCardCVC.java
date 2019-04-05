/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
    private String cvc = "" ;
    private static final int NUM_LEN = 3;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	public String display() {
    	return cvc;

	}

	public void key(String ch, int cnt) {
		if (cnt >= 20) {
			if (!ch.equals("X")) {
				cvc += ch;
			} else {
				cvc = cvc.substring(0,cvc.length()-1);
			}
		} else if (nextHandler != null) {
			nextHandler.key(ch, cnt);
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}