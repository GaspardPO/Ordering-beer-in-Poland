package orderingBeerInPoland;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccentOrderingBeerTester {

	@Test (expected=Exception.class) public void 
	shouldReturnExceptionNegativeNumber() {
		AccentTranslator.orderingBeer(-1);
	}
	
	@Test public void 
	shouldReturnWodaWhenOrdering0Beer() {
		assertEquals("Woda mineralna poproszę", AccentTranslator.orderingBeer(0));
	}

	@Test public void 
	shouldReturnJednoPiwoWhenOrdering1Beer() {
		assertEquals("Jedno piwo poproszę", AccentTranslator.orderingBeer(1));
	}
	
	@Test public void 
	shouldReturnDwaPiwaWhenOrdering2Beers() {
		assertEquals("Dwa piwa poproszę", AccentTranslator.orderingBeer(2));
	}
	
	@Test public void 
	shouldReturnTrzyPiwaWhenOrdering3Beers() {
		assertEquals("Trzy piwa poproszę", AccentTranslator.orderingBeer(3));
	}
	
	@Test public void 
	shouldReturnCzteryPiwaWhenOrdering4Beers() {
		assertEquals("Cztery piwa poproszę", AccentTranslator.orderingBeer(4));
	}
	
	@Test public void 
	shouldReturnPiecPiwWhenOrdering5Beers() {
		assertEquals("Pięć piw poproszę", AccentTranslator.orderingBeer(5));
	}
	
	@Test public void 
	shouldReturnOsiemPiwWhenOrdering8Beers() {
		assertEquals("Osiem piw poproszę", AccentTranslator.orderingBeer(8));
	}
	
	@Test public void 
	shouldReturndwadzieściaPiwWhenOrdering20Beers() {
		assertEquals("Dwadzieścia piw poproszę", AccentTranslator.orderingBeer(20));
	}
	
	@Test public void 
	shouldReturndwadzieściaJedenPiwWhenOrdering21Beers() {
		assertEquals("Dwadzieścia jeden piw poproszę", AccentTranslator.orderingBeer(21));
	}

	@Test public void 
	shouldReturndwadzieściaDwaPiwaWhenOrdering22Beers() {
		assertEquals("Dwadzieścia dwa piwa poproszę", AccentTranslator.orderingBeer(22));
	}

	@Test public void 
	shouldReturndwadzieściaOsiemPiwWhenOrdering28Beers() {
		assertEquals("Dwadzieścia osiem piw poproszę", AccentTranslator.orderingBeer(28));
	}
	
	@Test public void
	shouldReturnDziewięćdziesiątOsiemPiwWhenOrdering98Beers() {
		assertEquals("Dziewięćdziesiąt osiem piw poproszę", AccentTranslator.orderingBeer(98));
	}

	@Test public void
	shouldReturnDziewięćdziesiątDziewiecPiwWhenOrdering99Beers() {
		assertEquals("Dziewięćdziesiąt dziewięć piw poproszę", AccentTranslator.orderingBeer(99));
	}
	
	@Test(expected=RuntimeException.class) public void
	shouldshouldThrowExceptionWhenMoreThanOneHundredBeers() {
		AccentTranslator.orderingBeer(100);
	}
}
