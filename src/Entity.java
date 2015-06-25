

import java.util.ArrayList;

public class Entity {

	private String name;
	private String group;
	private int cost;
	private ArrayList<Double> rentValues;
	private int position;
	private boolean mortgaged;
	private Player owner;
	private boolean canBePurchased;
	private int numberOfHouses;
	private int numberOfHotels;
	private boolean buldingPurchasedInCurrentTurn;
	
	public Entity(String name, String group, int cost, ArrayList<Double> rentValues, int position, boolean canBePurchased) {
		this.name = name;
		this.group = group;
		this.cost = cost;
		this.rentValues = rentValues;
		this.position = position;
		this.canBePurchased = canBePurchased;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public ArrayList<Double> getRentValues() {
		return rentValues;
	}
	public void setRentValues(ArrayList<Double> rentValues) {
		this.rentValues = rentValues;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public boolean isMortgaged() {
		return mortgaged;
	}
	public void setMortgaged(boolean mortgaged) {
		this.mortgaged = mortgaged;
	}
	
	public String toString() {
		String rent = "\nRentValues: ";
		for (Double rentValue: rentValues) {
			rent += rentValue + " ";
		}
		return "\nName: " + name + "\nGroup: " + group + 
		"\nCost: " + cost + "\nPosition: " + position + 
		"\nMortgaged: " + mortgaged + rent;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public boolean canBePurchased() {
		return canBePurchased;
	}

	public void setCanBePurchased(boolean canBePurchased) {
		this.canBePurchased = canBePurchased;
	}

	public int getNumberOfHouses() {
		return numberOfHouses;
	}

	public void setNumberOfHouses(int numberOfHouses) {
		this.numberOfHouses += numberOfHouses;
	}

	public int getNumberOfHotels() {
		return numberOfHotels;
	}

	public void setNumberOfHotels(int numberOfHotels) {
		this.numberOfHotels += numberOfHotels;
	}

	public boolean isBuldingPurchasedInCurrentTurn() {
		return buldingPurchasedInCurrentTurn;
	}

	public void setBuldingPurchasedInCurrentTurn(
			boolean buldingPurchasedInCurrentTurn) {
		this.buldingPurchasedInCurrentTurn = buldingPurchasedInCurrentTurn;
	}
}
