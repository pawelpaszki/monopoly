import java.util.ArrayList;
import java.util.Random;

public class DeckOfChanceAndCommunityChestCards {

	private ArrayList<ChanceCard> chanceCards;
	private ArrayList<ChanceCard> dealtChanceCards;
	private ChanceCard getOutOfJailChance;
	private ArrayList<CommunityChestCard> communityCards;
	private ArrayList<CommunityChestCard> dealtCommunityCards;
	private CommunityChestCard getOutOfJailCommunity;
	private Random random;

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

	public int dealChanceCard() {
		if (chanceCards.size() == 0) {
			chanceCards = dealtChanceCards;
			dealtChanceCards = new ArrayList<ChanceCard>();
		}
		int position = random.nextInt(chanceCards.size());
		int id = chanceCards.get(position).getId();
		if (id == 6) {
			getOutOfJailChance = chanceCards.get(position);
		} else {
			setGetOutOfJailChance(chanceCards.get(position));
		}
		dealtChanceCards.add(chanceCards.get(position));
		chanceCards.remove(position);
		return id;
	}
	
	public int dealCommunityChestCard() {
		if (communityCards.size() == 0) {
			communityCards = dealtCommunityCards;
			dealtCommunityCards = new ArrayList<CommunityChestCard>();
		}
		int position = random.nextInt(communityCards.size());
		int id = communityCards.get(position).getId();
		if (id == 3) {
			getOutOfJailCommunity = communityCards.get(position);
		} else {
			setGetOutOfJailCommunity(communityCards.get(position));
		}
		dealtCommunityCards.add(communityCards.get(position));
		communityCards.remove(position);
		return id;
	}
	
	public void returnOutOfJailCardChance() {
		dealtChanceCards.add(getOutOfJailChance);
		setGetOutOfJailChance(null);
	}

	public ChanceCard getGetOutOfJailChance() {
		return getOutOfJailChance;
	}

	public void setGetOutOfJailChance(ChanceCard getOutOfJailChance) {
		this.getOutOfJailChance = getOutOfJailChance;
	}
	
	public ChanceCard getChanceCard(int id) {
		for (ChanceCard card: chanceCards) {
			if (card.getId() == id) {
				return card;
			}
		}
		return null;
	}
	
	public void returnOutOfJailCardCommunity() {
		dealtCommunityCards.add(getOutOfJailCommunity);
		setGetOutOfJailCommunity(null);
	}

	public CommunityChestCard getGetOutOfJailCommunity() {
		return getOutOfJailCommunity;
	}

	public void setGetOutOfJailCommunity(CommunityChestCard getOutOfJailCommunity) {
		this.getOutOfJailCommunity = getOutOfJailCommunity;
	}
	
	public CommunityChestCard getCommunityCard(int id) {
		for (CommunityChestCard card: communityCards) {
			if (card.getId() == id) {
				return card;
			}
		}
		return null;
	}
}
