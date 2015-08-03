
/**
 * @author Pawel Paszki
 * This is an abstract class defining Cards used in the game>
 * There are two children classes extending this class, which
 * must be distinguished, when dealing with "get out of jail 
 * free cards".
 * It only has one field - id, which is used to identify the card
 */
public abstract class Card {

	int id;
	
	/**
	 * Constructor for the Card class
	 * @param id used to set id field
	 */
	public Card(int id) {
		this.id = id;
	}
	/**
	 * getter for the id field
	 */
	public int getId() {
		return id;
	}

	/**
	 * setter for the id field
	 * @param id to replace current state.
	 * Method added as a convention. Not used in the app
	 */
	public void setId(int id) {
		this.id = id;
	}
}
