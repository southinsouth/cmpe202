

public class GumballMachine {
 
	State soldOutState;
	State noEnoughCoinState;
	State hasEnoughCoinState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int coin = 0;
	int model = 1;
 	
 	// support 3 models
	public GumballMachine(int numberGumballs, int model) {
		soldOutState = new SoldOutState(this);
		noEnoughCoinState = new NoEnoughCoinState(this);
		hasEnoughCoinState = new HasEnoughCoinState(this);
		soldState = new SoldState(this);

		this.model = model;
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noEnoughCoinState;
		} 
	}
 	
 	public void insertPenny() {
		state.insertPenny();
	}

	public void insertNickel() {
		state.insertNickel();
	}

	public void insertDime() {
		state.insertDime();
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectCoins() {
		state.ejectCoins();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
			coin -= (model == 1 ? 25 : 50);
		}
	}
 
	int getCount() {
		return count;
	}

	int getCoin() {
		return coin;
	}
 
	void refill(int count) {
		this.count = count;
		state = noEnoughCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoEnoughCoinState() {
        return noEnoughCoinState;
    }

    public State getHasEnoughCoinState() {
        return hasEnoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #200" + model);
		result.append("\nBall price: " + (model == 1 ? 25 : 50));
		result.append(", accept " + (model == 3 ? "all coins": "only quarters"));
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
