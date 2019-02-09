

public class Main {

	public static void main(String[] args) {

		System.out.println( "\n******************************************************") ;
		GumballMachine gumballMachine_1 = new GumballMachine(3,1);

		gumballMachine_1.insertCoin( 25 );
		gumballMachine_1.insertCoin( 25 );
		gumballMachine_1.turnCrank();


		gumballMachine_1.insertCoin( 50 );
		gumballMachine_1.turnCrank();

		gumballMachine_1.insertCoin( 25 );
		gumballMachine_1.turnCrank();

		gumballMachine_1.insertCoin( 25 );
		gumballMachine_1.turnCrank();

		gumballMachine_1.insertCoin( 25 );
		gumballMachine_1.turnCrank();

		System.out.println( "\n******************************************************") ;
		GumballMachine gumballMachine_2 = new GumballMachine(10,2);

		gumballMachine_2.insertCoin( 25 );
		gumballMachine_2.turnCrank();


		gumballMachine_2.insertCoin( 25 );
		gumballMachine_2.turnCrank();


		System.out.println( "\n******************************************************") ;
		GumballMachine gumballMachine_3 = new GumballMachine(20,3);

		gumballMachine_3.insertCoin( 25 );
		gumballMachine_3.insertCoin( 10 );
		gumballMachine_3.insertCoin( 5 );
		gumballMachine_3.insertCoin( 25 );
		gumballMachine_3.turnCrank();
		gumballMachine_3.turnCrank();
	}
}
