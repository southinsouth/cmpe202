

public class Main {

	public static void main(String[] args) {

		// Model 1 Test
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		GumballMachine gumballMachine_1 = new GumballMachine(1, 1);

		System.out.println(gumballMachine_1);

		gumballMachine_1.insertDime();
		gumballMachine_1.insertNickel();

		gumballMachine_1.insertQuarter();
		gumballMachine_1.turnCrank();

		System.out.println(gumballMachine_1);

		gumballMachine_1.insertQuarter();
		gumballMachine_1.turnCrank();


		System.out.println(gumballMachine_1);

		// Model 2 Test
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		GumballMachine gumballMachine_2 = new GumballMachine(5, 2);

		System.out.println(gumballMachine_2);

		gumballMachine_2.insertQuarter();
		gumballMachine_2.turnCrank();

		System.out.println(gumballMachine_2);

		gumballMachine_2.insertQuarter();
		gumballMachine_2.turnCrank();
		gumballMachine_2.insertQuarter();
		gumballMachine_2.turnCrank();


		gumballMachine_2.insertDime();
		gumballMachine_2.insertPenny();
		System.out.println(gumballMachine_2);

		// Model 3 Test
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		GumballMachine gumballMachine_3 = new GumballMachine(10, 3);

		System.out.println(gumballMachine_3);

		gumballMachine_3.insertQuarter(); 
		gumballMachine_3.insertDime(); 
		gumballMachine_3.insertNickel();
		gumballMachine_3.insertPenny();

		gumballMachine_3.turnCrank();

		System.out.println(gumballMachine_3);

		gumballMachine_3.insertQuarter();
		gumballMachine_3.turnCrank();
		gumballMachine_3.insertQuarter();
		gumballMachine_3.turnCrank();

		System.out.println(gumballMachine_3);


	}
}
