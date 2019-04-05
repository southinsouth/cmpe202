/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	public String display() {
    	return date;
	}

	public void key(String ch, int cnt) {
		if ( cnt >= 16 && cnt <= 20  ) {
			if(!ch.equals("X")) {
				date = date + ch;
			}else {
				if(cnt < 20 ) {
					date = date.substring(0,date.length()-1);
				}else if ( nextHandler != null ) {
					nextHandler.key(ch, cnt) ;
				}
			}
		}else if ( nextHandler != null ) {
			nextHandler.key(ch, cnt);
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}