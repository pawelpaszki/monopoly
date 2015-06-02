package gamePackage;

import java.util.ArrayList;

public class Player {

	private String name;
	private double moneyHeld;
	private int positionOnGameBoard;
	private ArrayList <Property> ownedProperties;
	private boolean holdsGetOutOfJail;
	
	public Player(String name) {
		this.name = name;
		this.moneyHeld = 1500;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoneyHeld() {
		return moneyHeld;
	}
	public void setMoneyHeld(double update) {
		this.moneyHeld += update;
	}
	public int getPositionOnGameBoard() {
		return positionOnGameBoard;
	}
	public void setPositionOnGameBoard(int positionOnGameBoard) {
		this.positionOnGameBoard = positionOnGameBoard;
	}
	public ArrayList<Property> getOwnedProperties() {
		return ownedProperties;
	}
	public void setOwnedProperties(ArrayList<Property> ownedProperties) {
		this.ownedProperties = ownedProperties;
	}
	public boolean getHoldsGetOutOfJail() {
		return holdsGetOutOfJail;
	}
	public void setHoldsGetOutOfJail(boolean holdsGetOutOfJail) {
		this.holdsGetOutOfJail = holdsGetOutOfJail;
	}
	
}
