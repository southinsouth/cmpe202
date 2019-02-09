

public class NoEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
 	// for model 1 & 2, other coins not accepted
	public void insertPenny() {
		if (gumballMachine.model != 3) {
			System.out.println("Only quarter accepted!");
		}
		else {
			System.out.println("You inserted a penny");
			gumballMachine.coin += 1;
			if (gumballMachine.getCoin() >= 50)
				gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
			else
				gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
		}
	}

	public void insertNickel() {
		if (gumballMachine.model != 3) {
			System.out.println("Only quarter accepted!");
		}
		else {
			System.out.println("You inserted a nickel");
			gumballMachine.coin += 5;
			if (gumballMachine.getCoin() >= 50)
				gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
			else
				gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
		}
	}

	public void insertDime() {
		if (gumballMachine.model != 3) {
			System.out.println("Only quarter accepted!");
		}
		else {
			System.out.println("You inserted a dime");
			gumballMachine.coin += 10;
			if (gumballMachine.getCoin() >= 50)
				gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
			else
				gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
		}
	}


	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		if (gumballMachine.model == 1) {
			gumballMachine.coin += 25;
			gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
		} else {
			gumballMachine.coin += 25;
			if (gumballMachine.getCoin() >= 50)
				gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
			else
				gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
		}
	}
 
	public void ejectCoins() {
		if (gumballMachine.getCoin() == 0) {
			System.out.println("You haven't inserted enough coins");
		} else {
			System.out.println(gumballMachine.getCoin() + " coins returned!");
			gumballMachine.coin = 0;		
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no enough coin");
		System.out.println("Coin inserted: " + gumballMachine.getCoin());
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for " + (gumballMachine.model == 3 ? "coins" : "quarter");
	}
}
