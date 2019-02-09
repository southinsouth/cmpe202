

import java.util.Random;

public class HasEnoughCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasEnoughCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
 
	public void insertPenny() {
		System.out.println("You can't insert more coins");
	}

	public void insertNickel() {
		System.out.println("You can't insert more coins");
	}

	public void insertDime() {
		System.out.println("You can't insert more coins");
	}

	public void insertQuarter() {
		System.out.println("You can't insert more coins");
	}
 
	public void ejectCoins() {
		System.out.println( gumballMachine.getCoin() + "Coins Returned");
		gumballMachine.coin = 0;
		gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
