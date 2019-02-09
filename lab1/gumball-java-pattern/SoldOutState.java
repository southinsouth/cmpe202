

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertPenny() {
		System.out.println("You can't insert a coin, the machine is sold out");
	}

	public void insertNickel() {
		System.out.println("You can't insert a coin, the machine is sold out");
	}

	public void insertDime() {
		System.out.println("You can't insert a coin, the machine is sold out");
	}

	public void insertQuarter() {
		System.out.println("You can't insert a coin, the machine is sold out");
	}
 
	public void ejectCoins() {
		System.out.println("You can't eject, you haven't inserted a coin yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
