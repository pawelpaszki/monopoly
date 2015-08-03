
import java.util.ArrayList;

/**
 * @author Pawel Paszki This class is used to represent every single entity in
 *         the game and all its attributes It consists of the following fields:
 *         name of the entity group of the entity (colour groups for entities,
 *         which can have hotels or houses, utilities group, railroad group or
 *         null, if the entity cannot be purchased) cost of the purchasable
 *         entity rentValues ArrayList of entities available to rent position on
 *         the board (0-39) mortgaged field - true or false owner - field of
 *         type Player canBePurchased - true or false numberOfHouses on the
 *         property numberOfHotels on the property buldingPurchasedInCurrentTurn
 *         - true or false buildingIndex - 0-21
 */
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
	private int buildingIndex;

	/**
	 * Constructor of Entity class, initialises all fields, which need to be
	 * initialised, when created which are assigned with passed parameters values: 
	 * 
	 * @param name
	 * @param group
	 * @param cost
	 * @param rentValues
	 * @param position
	 * @param canBePurchased
	 * @param buildingIndex
	 */
	public Entity(String name, String group, int cost,
			ArrayList<Double> rentValues, int position, boolean canBePurchased,
			int buildingIndex) {
		this.name = name;
		this.group = group;
		this.cost = cost;
		this.rentValues = rentValues;
		this.position = position;
		this.canBePurchased = canBePurchased;
		this.buildingIndex = buildingIndex;
	}

	/**
	 * @return name of the Entity
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
	 * @return group of the entity
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * group setter (for convention purposes). not used
	 * @param group passed
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * @return cost of the entity
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * cost setter (for convention purposes). not used
	 * @param cost passed
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return collection of rentValues of the entity
	 */
	public ArrayList<Double> getRentValues() {
		return rentValues;
	}

	/**
	 * rentValues setter (for convention purposes). not used
	 * @param rentValues passed
	 */
	public void setRentValues(ArrayList<Double> rentValues) {
		this.rentValues = rentValues;
	}

	/**
	 * @return position of the entity on the board (0-39 inclusive)
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * position setter (for convention purposes). not used
	 * @param position passed
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * @return true, if entity is on mortgage, false otherwise
	 */
	public boolean isMortgaged() {
		return mortgaged;
	}

	/**
	 * mortgaged setter
	 * @param mortgaged passed
	 */
	public void setMortgaged(boolean mortgaged) {
		this.mortgaged = mortgaged;
	}

	/**
	 * @return String representation of the Entity class.
	 */
	public String toString() {
		String rent = "\nRentValues: ";
		for (Double rentValue : rentValues) {
			rent += rentValue + " ";
		}
		return "\nName: " + name + "\nGroup: " + group + "\nCost: " + cost
				+ "\nPosition: " + position + "\nMortgaged: " + mortgaged
				+ rent;
	}

	/**
	 * @return owner of the entity
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * owner setter
	 * @param owner passed
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	/**
	 * @return true, if entity can be purchased, false otherwise
	 */
	public boolean canBePurchased() {
		return canBePurchased;
	}

	/**
	 * canBePurchased setter (for convention purposes). not used
	 * @param canBePurchased passed
	 */
	public void setCanBePurchased(boolean canBePurchased) {
		this.canBePurchased = canBePurchased;
	}

	/**
	 * @return number of houses build on the entity
	 */
	public int getNumberOfHouses() {
		return numberOfHouses;
	}
	
	/**
	 * numberOfHouses setter
	 * @param numberOfHouses passed
	 */
	public void setNumberOfHouses(int numberOfHouses) {
		this.numberOfHouses += numberOfHouses;
	}

	/**
	 * @return number of hotels build on the entity (0 or 1)
	 */
	public int getNumberOfHotels() {
		return numberOfHotels;
	}

	/**
	 * numberOfHouses setter
	 * @param numberOfHotels passed
	 */
	public void setNumberOfHotels(int numberOfHotels) {
		this.numberOfHotels += numberOfHotels;
	}

	/**
	 * @return true, if building was purchased in current
	 * turn, false otherwise
	 */
	public boolean isBuldingPurchasedInCurrentTurn() {
		return buldingPurchasedInCurrentTurn;
	}

	/**
	 * setter for buldingPurchasedInCurrentTurn
	 * @param buldingPurchasedInCurrentTurn passed
	 */
	public void setBuldingPurchasedInCurrentTurn(
			boolean buldingPurchasedInCurrentTurn) {
		this.buldingPurchasedInCurrentTurn = buldingPurchasedInCurrentTurn;
	}

	/**
	 * @return buildingIndex of an entity (0-21 inclusive)
	 */
	public int getBuildingIndex() {
		return buildingIndex;
	}

	/**
	 * setter for buildingIndex (not used)
	 * @param buildingIndex passed
	 */
	public void setBuildingIndex(int buildingIndex) {
		this.buildingIndex = buildingIndex;
	}
}
