package entities.model;

public class Wallet {

	private Double money;
	private String id;
	
	public Wallet(Double initialMoney, String id) {
		this.money = initialMoney;
		this.id = id;
	}

	public Double getMoney() {
		return money;
	}

	public String getName() {
		return id;
	}

	public void addMoney(Double value) {
		this.money = this.money + value;
	}
	
	public void removeMoney(Double value) {
		this.money = this.money - value;
	}
	
	public boolean enoughMoney(Double value) {
		if(this.money < value) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Wallet [money=" + money + ", id=" + id + "]";
	}
	
	
	
	
	
}
