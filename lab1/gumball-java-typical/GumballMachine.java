
public class GumballMachine
{

    private int num_gumballs;
    private int type;
    private int coins;
    private boolean has_enough_coin;

    // get the rest number of gumballs, just for validation during test
    public int getNumGumballs() {
        return num_gumballs;
    }

    public GumballMachine( int size , int type) // 3 types of machines
    {
        // initialise instance variables
        this.num_gumballs = size ;
        this.type = type ;
        this.coins = 0 ;
        System.out.println( "New Type " + type + " Gumball Machine with " + size + " balls! Please insert " + (this.type  == 3 ? "coins" : "quarters")) ;
    }

    public void insertCoin(int coin)
    {
        if (this.type == 1){ // type 1 machine only accepts 1 quarter, price: 25, no change/return
            if (this.has_enough_coin == true) { // can't insert quarter if there is one
                System.out.println( "Slot Full!") ;
            }
            else {  
                if (coin == 25) {
                    this.coins += coin ;
                    this.has_enough_coin = true;
                    System.out.println( coin + " accepted, total coins: " + this.coins) ;
                }
                else {
                    System.out.println( coin + " not accepted! Only accept quarter!") ;
                }
            }
        }

        else if (this.type == 2){ // type 2 machine only accepts 2 quarters in total, price: 50, no change/return
            if (this.has_enough_coin == true) {
                System.out.println( "Slot Full!") ;
            }
            else {
                if (coin == 25) {
                    this.coins += 25 ;
                    System.out.println( coin + " accepted, total coins: " + this.coins) ;
                    if (this.coins == 50) {
                        this.has_enough_coin = true;
                    }
                }
                else
                    System.out.println( coin + " not accepted! Only accept quarter!") ;
            }
        }

        else { // type 3 machine accepts all coins, price: 50, no change/return
            if (this.has_enough_coin == true) {
                System.out.println( "Slot Full!") ;
            }
            else {
                if (coin == 1 || coin == 5 || coin == 10 || coin == 25) {
                    this.coins += coin;
                    System.out.println( coin + " accepted, total coins: " + this.coins) ;
                    if (this.coins >= 50) {
                        this.has_enough_coin = true;
                    }
                }
                else
                    System.out.println( coin + " not accepted! Only accept coins!") ;
            }
        }
    }
    
    public void turnCrank()
    {   
    	if ( this.has_enough_coin == true )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs -- ;
    			this.has_enough_coin = false  ;
                this.coins -= (this.type == 1 ? 25 : 50) ;
    			System.out.println( "Thanks for your coin.  Gumball Ejected!" ) ;
                System.out.println( "Remaining gumballs:  " + this.getNumGumballs()) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( this.type  == 3 ? "Please insert coins" : "Please insert quarter") ;
    	}        
    }
}
