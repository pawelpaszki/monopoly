package gamePackage;

import java.util.ArrayList;

public class Property {

	private String name;
	private String group;
	private int cost;
	private ArrayList<Double> rentValues;
	private int position;
	private boolean mortgaged;
	
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
}
