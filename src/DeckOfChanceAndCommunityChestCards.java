import java.util.ArrayList;
import java.util.Random;

/**
 * @author Pawel Paszki
 * this class is used to deal community chest and chance cards, when necessary
 * and fetching and returning "get out of jail free" cards, when needed.
 * It has following fields:
 * chanceCards - collection of chance cards available
 * dealtChanceCards - collection of dealt cards - to be returned to the deck, 
 * 					  when chanceCards size equals 0
 * getOutOfJailChance field of type ChanceCard
 * communityCards - collection of community chest cards available
 * dealtCommunityCards - collection of dealt cards - to be returned to the deck, 
 * 					  when communityCards size equals 0
 * getOutOfJailCommunity field of type CommunityChestCard
 * random - used to randomly generate cards
 */
public class DeckOfChanceAndCommunityChestCards {

	private ArrayList<ChanceCard> chanceCards;
	private ArrayList<ChanceCard> dealtChanceCards;
	private ChanceCard getOutOfJailChance;
	private ArrayList<CommunityChestCard> communityCards;
	private ArrayList<CommunityChestCard> dealtCommunityCards;
	private CommunityChestCard getOutOfJailCommunity;
	private Random random;

	/**
	 * constructor of DeckOfChanceAndCommunityChestCards class
	 * all fields except getOutOfJail are initialised and decks of 
	 * chance and community cards are created
	 */
	public DeckOfChanceAndCommunityChestCards() {
		chanceCards = new ArrayList<ChanceCard>();
		dealtChanceCards = new ArrayList<ChanceCard>();
		random = new Random();
		communityCards = new ArrayList<CommunityChestCard>();
		dealtCommunityCards = new ArrayList<CommunityChestCard>();
		chanceCards.add(new ChanceCard(0));
		chanceCards.add(new ChanceCard(1));
		chanceCards.add(new ChanceCard(2));
		chanceCards.add(new ChanceCard(3));
		chanceCards.add(new ChanceCard(4));
		chanceCards.add(new ChanceCard(5));
		chanceCards.add(new ChanceCard(6));
		chanceCards.add(new ChanceCard(7));
		chanceCards.add(new ChanceCard(8));
		chanceCards.add(new ChanceCard(9));
		chanceCards.add(new ChanceCard(10));
		chanceCards.add(new ChanceCard(11));
		chanceCards.add(new ChanceCard(12));
		chanceCards.add(new ChanceCard(13));
		chanceCards.add(new ChanceCard(14));
		chanceCards.add(new ChanceCard(15));
		
		communityCards.add(new CommunityChestCard(0));
		communityCards.add(new CommunityChestCard(1));
		communityCards.add(new CommunityChestCard(2));
		communityCards.add(new CommunityChestCard(3));
		communityCards.add(new CommunityChestCard(4));
		communityCards.add(new CommunityChestCard(5));
		communityCards.add(new CommunityChestCard(6));
		communityCards.add(new CommunityChestCard(7));
		communityCards.add(new CommunityChestCard(8));
		communityCards.add(new CommunityChestCard(9));
		communityCards.add(new CommunityChestCard(10));
		communityCards.add(new CommunityChestCard(11));
		communityCards.add(new CommunityChestCard(12));
		communityCards.add(new CommunityChestCard(13));
		communityCards.add(new CommunityChestCard(14));
		communityCards.add(new CommunityChestCard(15));
		communityCards.add(new CommunityChestCard(16));
	}

	/**
	 * @return id of dealt chance card. if the card id is 6 then 
	 * getOutOfJailChance is initialised
	 */
	public int dealChanceCard() {
		if (chanceCards.size() == 0) {
			chanceCards = dealtChanceCards;
			dealtChanceCards = new ArrayList<ChanceCard>();
		}
		int position = random.nextInt(chanceCards.size());
		int id = chanceCards.get(position).getId();
		if (id == 6) {
			setGetOutOfJailChance(chanceCards.get(position));
		} else {
			dealtChanceCards.add(chanceCards.get(position));
		}
		
		chanceCards.remove(position);
		return id;
	}
	
	/**
	 * @return id of dealt community chest card. if the card id is 6 then 
	 * getOutOfJailChance is initialised
	 */
	public int dealCommunityChestCard() {
		if (communityCards.size() == 0) {
			communityCards = dealtCommunityCards;
			dealtCommunityCards = new ArrayList<CommunityChestCard>();
		}
		int position = random.nextInt(communityCards.size());
		int id = communityCards.get(position).getId();
		if (id == 3) {
			setGetOutOfJailCommunity(communityCards.get(position));
		} else {
			dealtCommunityCards.add(communityCards.get(position));
		}
		communityCards.remove(position);
		return id;
	}
	
	/**
	 * if player decides to use held getOutOfJailChance card, this method
	 * returns it to the deck of dealt cards and getOutOfJailChance is 
	 * set to null
	 */
	public void returnOutOfJailCardChance() {
		dealtChanceCards.add(getOutOfJailChance);
		setGetOutOfJailChance(null);
	}

	/**
	 * @return getOutOfJailChance card
	 */
	public ChanceCard getGetOutOfJailChance() {
		return getOutOfJailChance;
	}

	/**
	 * @param getOutOfJailChance is used to set getOutOfJailChance card
	 */
	public void setGetOutOfJailChance(ChanceCard getOutOfJailChance) {
		this.getOutOfJailChance = getOutOfJailChance;
	}
	
	/**
	 * @param id is passed to determine which Chance card to return
	 * @return chanceCards with specified id, null otherwise(not expected
	 * to be returned)
	 */
	public ChanceCard getChanceCard(int id) {
		for (ChanceCard card: chanceCards) {
			if (card.getId() == id) {
				return card;
			}
		}
		return null;
	}
	
	/**
	 * if player decides to use held getOutOfJailCommunity card, this method
	 * returns it to the deck of dealt cards and getOutOfJailCommunity is 
	 * set to null
	 */
	public void returnOutOfJailCardCommunity() {
		dealtCommunityCards.add(getOutOfJailCommunity);
		setGetOutOfJailCommunity(null);
	}

	/**
	 * @return getOutOfJailCommunity card
	 */
	public CommunityChestCard getGetOutOfJailCommunity() {
		return getOutOfJailCommunity;
	}

	/**
	 * @param getOutOfJailCommunity is used to set getOutOfJailCommunity card
	 */
	public void setGetOutOfJailCommunity(CommunityChestCard getOutOfJailCommunity) {
		this.getOutOfJailCommunity = getOutOfJailCommunity;
	}
	
	/**
	 * @param id is passed to determine which community chest card to return
	 * @return communityCards with specified id, null otherwise(not expected
	 * to be returned)
	 */
	public CommunityChestCard getCommunityCard(int id) {
		for (CommunityChestCard card: communityCards) {
			if (card.getId() == id) {
				return card;
			}
		}
		return null;
	}
}
