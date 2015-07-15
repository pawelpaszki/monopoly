

import java.util.ArrayList;

public class Player {

	private String name;
	private double moneyHeld;
	private int positionOnGameBoard;
	private ArrayList <Entity> ownedProperties;
	private boolean inJail;
	private boolean passedGo;
	private int turnsInJail;
	private ArrayList<Card> outOfJailCards;
	private boolean isBankrupt;
	
	public Player(String name) {
		this.name = name;
		this.moneyHeld = 1500;
		ownedProperties = new ArrayList<Entity>();
		outOfJailCards = new ArrayList<>();
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
		return outOfJailCards.size();
	}
	
	public void addGetOutOfJailCard(Card card) {
		outOfJailCards.add(card);
	}
	
	public ArrayList<Card> getOutOfJailCards() {
		return outOfJailCards;
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
	public boolean isBankrupt() {
		return isBankrupt;
	}
	public void setBankrupt(boolean isBankrupt) {
		this.isBankrupt = isBankrupt;
	}
	
}
