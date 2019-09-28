package swtest101.cribbage.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ScoringServiceTest {

	@Test
	public void test() {
		final String handOfCards = "JH5D5S5C5H";
		final Integer score = ScoringService.calculateScore(handOfCards);

		assertThat(score, is(equalTo(29)));
	}
	
	@Test
	public void pairCalcTest() {
		final String handOfCards = "JH5D5S5C5H";
		final Integer score = ScoringService.calculateScore(handOfCards);
		
		assertThat(score, is(equalTo(3*2)));


	}

	@Test
	public void straightCalcTest() {
	}

	@Test
	public void flushCalcTest() {
	}

	@Test
	public void nobCalcTest() {
	}

	@Test
	public void fifteenCalcTest() {
	}

}
