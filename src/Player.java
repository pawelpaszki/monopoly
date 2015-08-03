

import java.util.ArrayList;

/**
 * @author Pawel Paszki
 * Player class represents Player objects and their fields used
 * in the game:
 * name of the Player (limited in the main class to be unique and 3-10 characters long)
 * moneyHeld - player's current balance
 * current positionOnTheGameBoard
 * collection of owned properties
 * inJail - true or false
 * passedGo - true or false
 * turnsInJail, used when in Jail
 * collection of outOfJailCards
 * isBankrupt - true or false
 */
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
	
	/**
	 * Constructor of Player class
	 * @param name passed to be assigned as a player's name
	 * moneyHeld set to 1500
	 * ownedProperties and outOfJailCards instantiated.
	 * all other fields have default values at the start of the game
	 */
	public Player(String name) {
		this.name = name;
		this.moneyHeld = 1500;
		ownedProperties = new ArrayList<Entity>();
		outOfJailCards = new ArrayList<>();
	}
	
	/**
	 * @return name of the Player
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * name setter (for convention purposes). not used
	 * @param name passed
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return current player's balance
	 */
	public double getMoneyHeld() {
		return moneyHeld;
	}

	/**
	 * moneyHeld setter
	 * @param update is added to the current balance
	 */
	public void setMoneyHeld(double update) {
		this.moneyHeld += update;
	}
	
	/**
	 * @return player's current position on the game board
	 */
	public int getPositionOnGameBoard() {
		return positionOnGameBoard;
	}
	
	/**
	 * sets player's current position on the game board
	 * @param positionOnGameBoard is passed and added to 
	 * positionOnGameBoard field. If >= 40 then passedGo
	 * field is set to true 
	 */
	public void setPositionOnGameBoard(int positionOnGameBoard) {
		this.positionOnGameBoard += positionOnGameBoard;
		if (this.positionOnGameBoard >= 40) {
			setMoneyHeld(200);
			setPassedGo(true);
			this.positionOnGameBoard = this.positionOnGameBoard % 40;
		}
	}
	/**
	 * @return collection of owned properties
	 */
	public ArrayList<Entity> getOwnedProperties() {
		return ownedProperties;
	}
	
	/**
	 * ownedProperties setter (for convention purposes). not used
	 * @param ownedProperties passed
	 */
	public void setOwnedProperties(ArrayList<Entity> ownedProperties) {
		this.ownedProperties = ownedProperties;
	}

	/**
	 * @return size of outOfJailCards - number of get out of jail cards
	 */
	public int getNumberOfGetOutOfJailCards() {
		return outOfJailCards.size();
	}
	
	/**
	 * @param card passed to be added to collection of outOfJailCards
	 */
	public void addGetOutOfJailCard(Card card) {
		outOfJailCards.add(card);
	}
	
	/**
	 * @return collection of outOfJailCards
	 */
	public ArrayList<Card> getOutOfJailCards() {
		return outOfJailCards;
	}
	
	/**
	 * @return true, if player is in jail, false otherwise
	 */
	public boolean isInJail() {
		return inJail;
	}
	
	/**
	 * @param inJail passed and inJail field to be set as the parameter
	 */
	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}
	
	/**
	 * @return true, if player just passed go, false otherwise
	 */
	public boolean didPassGo() {
		return passedGo;
	}
	
	/**
	 * @param passedGo passed and passedGo field to be set as the parameter
	 */
	public void setPassedGo(boolean passedGo) {
		this.passedGo = passedGo;
	}
	
	/**
	 * @return turns spent in jail
	 */
	public int getTurnsInJail() {
		return turnsInJail;
	}
	
	/**
	 * @param turnsInJail passed to be assigned to the turnsInJail field
	 */
	public void setTurnsInJail(int turnsInJail) {
		this.turnsInJail = turnsInJail;
	}
	
	/**
	 * @return true, if player is bankrupt, false otherwise
	 */
	public boolean isBankrupt() {
		return isBankrupt;
	}
	
	/**
	 * @param isBankrupt is passed (true), if the Player is to be bankrupt
	 */
	public void setBankrupt(boolean isBankrupt) {
		this.isBankrupt = isBankrupt;
	}
	
}