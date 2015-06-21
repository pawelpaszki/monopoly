package gamePackage;

import java.util.ArrayList;

public class Player {

	private String name;
	private double moneyHeld;
	private int positionOnGameBoard;
	private ArrayList <Entity> ownedProperties;
	private int numberOfGetOutOfJailCards;
	private boolean inJail;
	private boolean passedGo;
	private int turnsInJail;
	
	public Player(String name) {
		this.name = name;
		this.moneyHeld = 1500;
		ownedProperties = new ArrayList<Entity>();
		numberOfGetOutOfJailCards = 1;
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
		this.positionOnGameBoard += positionOnGameBoard;
		if (this.positionOnGameBoard >= 40) {
			setMoneyHeld(200);
			setPassedGo(true);
		}
		this.positionOnGameBoard = this.positionOnGameBoard % 40;
	}
	public ArrayList<Entity> getOwnedProperties() {
		return ownedProperties;
	}
	public void setOwnedProperties(ArrayList<Entity> ownedProperties) {
		this.ownedProperties = ownedProperties;
	}

	public int getNumberOfGetOutOfJailCards() {
		return numberOfGetOutOfJailCards;
	}
	public void setNumberOfGetOutOfJailCards(int change) {
		this.numberOfGetOutOfJailCards += change;
	}
	public boolean isInJail() {
		return inJail;
	}
	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}
	public boolean didPassGo() {
		return passedGo;
	}
	public void setPassedGo(boolean passedGo) {
		this.passedGo = passedGo;
	}
	public int getTurnsInJail() {
		return turnsInJail;
	}
	public void setTurnsInJail(int turnsInJail) {
		this.turnsInJail = turnsInJail;
	}
	
}
