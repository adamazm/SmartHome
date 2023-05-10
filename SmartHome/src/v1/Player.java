package v1;

public class Player {
	//attributes
	private int money;

	
	//constructor
	public Player() {
		this.money = 1000;
	}
	
	public int getMoney() {
		
		return this.money;
	}
	
	public void decreaseMoney(int diff) {
		this.money = this.money - diff;
	}
	
	public void addMoney()
	{
		this.money=money+500;
	}

}
