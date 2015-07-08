import java.util.ArrayList;
import java.util.Random;

public class DeckOfChanceCards {

	private ArrayList<ChanceCard> chanceCards;
	private ArrayList<ChanceCard> dealtChanceCards;
	private ChanceCard getOutOfJail;
	private Random random;

	public DeckOfChanceCards() {
		chanceCards = new ArrayList<ChanceCard>();
		dealtChanceCards = new ArrayList<ChanceCard>();
		random = new Random();
		chanceCards.add(new ChanceCard(0, 0));
		chanceCards.add(new ChanceCard(1, 0));
		chanceCards.add(new ChanceCard(2, 0));
		chanceCards.add(new ChanceCard(3, 0));
		chanceCards.add(new ChanceCard(4, 50));
		chanceCards.add(new ChanceCard(5, 0));
		chanceCards.add(new ChanceCard(6, 0));
		chanceCards.add(new ChanceCard(7, 0));
		chanceCards.add(new ChanceCard(8, 0));
		chanceCards.add(new ChanceCard(9, 0));
		chanceCards.add(new ChanceCard(10, -15));
		chanceCards.add(new ChanceCard(11, 0));
		chanceCards.add(new ChanceCard(12, 0));
		chanceCards.add(new ChanceCard(13, 50));
		chanceCards.add(new ChanceCard(14, 150));
		chanceCards.add(new ChanceCard(15, 100));
	}

	public int dealChanceCard() {
		if (chanceCards.size() == 0) {
			chanceCards = dealtChanceCards;
			dealtChanceCards= new ArrayList<ChanceCard>();
		}
		int position = random.nextInt(chanceCards.size());
		int id = chanceCards.get(position).getId();
		if (id == 6) {
			getOutOfJail = chanceCards.get(position);
		} else {
			setGetOutOfJail(chanceCards.get(position));
		}
		chanceCards.remove(position);
		return id;
	}
	
	public void returnOutOfJailCard() {
		dealtChanceCards.add(getOutOfJail);
		setGetOutOfJail(null);
	}

	public ChanceCard getGetOutOfJail() {
		return getOutOfJail;
	}

	public void setGetOutOfJail(ChanceCard getOutOfJail) {
		this.getOutOfJail = getOutOfJail;
	}
	
	public ChanceCard getCard(int id) {
		for (ChanceCard card: chanceCards) {
			if (card.getId() == id) {
				return card;
			}
		}
		return null;
	}
}
