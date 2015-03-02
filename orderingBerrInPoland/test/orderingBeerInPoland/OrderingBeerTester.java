package orderingBeerInPoland;

import static org.junit.Assert.*;
import org.junit.Test;

public class OrderingBeerTester {

	@Test (expected=Exception.class) public void 
	shouldReturnExceptionNegativeNumber() {
		Translator.orderingBeers(-1);
	}
	
	@Test public void 
	shouldReturnWodaWhenOrdering0Beer() {
		assertEquals("Shall ask for mineral water when no beers are ordered :", "Woda mineralna poprosze", Translator.orderingBeers(0));
	}

	@Test public void 
	shouldReturnJednoPiwoWhenOrdering1Beer() {
		assertEquals("One is like an adjective, so should be written acording to the gender : Jedno", "Jedno piwo poprosze", Translator.orderingBeers(1));
	}
	
	@Test public void 
	shouldReturnDwaPiwaWhenOrdering2Beers() {
		assertEquals("Dwa piwa poprosze", Translator.orderingBeers(2));
	}
	
	@Test public void 
	shouldReturnTrzyPiwaWhenOrdering3Beers() {
		assertEquals("Trzy piwa poprosze", Translator.orderingBeers(3));
	}
	
	@Test public void 
	shouldReturnCzteryPiwaWhenOrdering4Beers() {
		assertEquals("Cztery piwa poprosze", Translator.orderingBeers(4));
	}
	
	@Test public void 
	shouldReturnPiecPiwWhenOrdering5Beers() {
		assertEquals("Piec piw poprosze", Translator.orderingBeers(5));
	}
	
	@Test public void 
	shouldReturnOsiemPiwWhenOrdering8Beers() {
		assertEquals("Osiem piw poprosze", Translator.orderingBeers(8));
	}

	@Test public void 
	shouldReturnOsiemPiwWhenOrdering10Beers() {
		assertEquals("Dziesiec piw poprosze", Translator.orderingBeers(10));
	}
	
	@Test public void 
	shouldReturnJedenasciePiwWhenOrdering11Beers() {
		assertEquals("Jedenascie piw poprosze", Translator.orderingBeers(11));
	}
	
	@Test public void 
	shouldReturnDwanasciePiwWhenOrdering12Beers() {
		assertEquals("Dwanascie piw poprosze", Translator.orderingBeers(12));
	}
	
	@Test public void 
	shouldReturnTrzynasciePiwWhenOrdering13Beers() {
		assertEquals("Trzynascie piw poprosze", Translator.orderingBeers(13));
	}
	
	@Test public void 
	shouldReturnCzternasciePiwWhenOrdering14Beers() {
		assertEquals("Czternascie piw poprosze", Translator.orderingBeers(14));
	}
	
	@Test public void 
	shouldReturnPietnasciePiwWhenOrdering13Beers() {
		assertEquals("Pietnascie piw poprosze", Translator.orderingBeers(15));
	}
	
	@Test public void 
	shouldReturnSzesnasciePiwWhenOrdering13Beers() {
		assertEquals("Szesnascie piw poprosze", Translator.orderingBeers(16));
	}
	
	@Test public void 
	shouldReturndwadziesciaPiwWhenOrdering20Beers() {
		assertEquals("Dwadziescia piw poprosze", Translator.orderingBeers(20));
	}
	
	@Test public void 
	shouldReturndwadziesciaJedenPiwWhenOrdering21Beers() {
		assertEquals("Dwadziescia jeden piw poprosze", Translator.orderingBeers(21));
	}

	@Test public void 
	shouldReturndwadziesciaDwaPiwaWhenOrdering22Beers() {
		assertEquals("Dwadziescia dwa piwa poprosze", Translator.orderingBeers(22));
	}

	@Test public void 
	shouldReturndwadziesciaOsiemPiwWhenOrdering28Beers() {
		assertEquals("Dwadziescia osiem piw poprosze", Translator.orderingBeers(28));
	}
	
	@Test public void
	shouldReturnTrzydziesciTrzyPiwaWhenOrdering33Beers() {
		assertEquals("Trzydziesci trzy piwa poprosze", Translator.orderingBeers(33));
	}
	
	@Test public void
	shouldReturnCzterdziesciCzteryPiwaWhenOrdering44Beers() {
		assertEquals("Czterdziesci cztery piwa poprosze", Translator.orderingBeers(44));
	}
	
	@Test public void
	shouldReturnPiecdziesiatPiecPiwaWhenOrdering55Beers() {
		assertEquals("Piecdziesiat piec piw poprosze", Translator.orderingBeers(55));
	}
	
	@Test public void
	shouldReturnDziewiecdziesiatOsiemPiwWhenOrdering98Beers() {
		assertEquals("Dziewiecdziesiat osiem piw poprosze", Translator.orderingBeers(98));
	}

	@Test public void
	shouldReturnDziewiecdziesiatDziewiecPiwWhenOrdering99Beers() {
		assertEquals("Dziewiecdziesiat dziewiec piw poprosze", Translator.orderingBeers(99));
	}
	
	@Test(expected=RuntimeException.class) public void
	shouldshouldThrowExceptionWhenMoreThanOneHundredBeers() {
		Translator.orderingBeers(100);
	}
}
