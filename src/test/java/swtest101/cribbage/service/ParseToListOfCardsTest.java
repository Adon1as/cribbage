package swtest101.cribbage.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import swtest101.cribbage.entity.Card;
import swtest101.cribbage.entity.Suit;

//@RunWith(Parameterized.class)
public class ParseToListOfCardsTest {

	//@Parameter(0)
	public String input;

	
	@Test
	public void testSize() {
		input = "JH5C4SQDAH"; 
		final List<Card> cards = ParseStringService.parseToListOfCards(input);
		
	
		assertThat(cards.size(), is(equalTo(5)));
		
		
		assertThat(cards.get(0).getRank(), is(equalTo(11)));
		assertThat(cards.get(0).getSuit(), is(equalTo(Suit.HEARTS)));
		
		assertThat(cards.get(1).getRank(), is(equalTo(5)));
		assertThat(cards.get(1).getSuit(), is(equalTo(Suit.CLUBS)));
		
		assertThat(cards.get(2).getRank(), is(equalTo(4)));
		assertThat(cards.get(2).getSuit(), is(equalTo(Suit.SPADES)));
		
		assertThat(cards.get(3).getRank(), is(equalTo(12)));
		assertThat(cards.get(3).getSuit(), is(equalTo(Suit.DIAMONDS)));
		
		assertThat(cards.get(4).getRank(), is(equalTo(1)));
		assertThat(cards.get(4).getSuit(), is(equalTo(Suit.HEARTS)));
		
				
	}
	

}
