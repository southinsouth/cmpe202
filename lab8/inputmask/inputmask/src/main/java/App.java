/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        screen.addSubComponent( new CreditCardNumDecorator (num) );
        screen.addSubComponent( new CreditCardExpDecorator (exp) );
        screen.addSubComponent( new CreditCardCVCDecorator (cvc) );

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if(ch.equals("X")) {
            if(count == 0 ) {   return;}
            count--;
            screen.key(ch, count);
        }else if(ch.length() == 1 && Character.isDigit(ch.toCharArray()[0])) {
            if(count == 23) {   return;}
            count++;
            screen.key(ch, count);
        }
    }

}

