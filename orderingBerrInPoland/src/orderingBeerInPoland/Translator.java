package orderingBeerInPoland;


public class Translator {

	private static final String[] numbers = {" ", "jeden", "dwa", "trzy", "cztery", "piec", "szesc" , "siedem", "osiem", "dziewiec", "dziesiec", "jedenascie", "dwanascie", "trzynascie", "czternascie", "pietnascie", "szesnascie", "siedemnascie", "osiemnascie", "dziewietnascie"};
	private static final String[] tenth = {"", " ", "dwadziescia", "trzydziesci", "czterdziesci", "piecdziesiat", "szescdziesiat", "siedemdziesiat", "osiemdziesiat", "dziewiecdziesiat"};
	private static final String please = " poprosze";
	private static final String beer = " piw";

	public static String orderingBeers(int nbOfBeers) {

		if (0 == nbOfBeers){
			return "Woda mineralna" + please;
		}

		if (1 == nbOfBeers){
			return "Jedno" + beer + "o" + please;
		}
		
		String number ="";		
		if(nbOfBeers > 19){
			number =  tenth[nbOfBeers / 10] + " ";
			nbOfBeers %= 10;
		}
		number += numbers[nbOfBeers];

		return cleanString(number) + beer + getEnding(nbOfBeers) + please; 
	}


	private static String cleanString(String number) {
		return  number.substring(0, 1).toUpperCase() + number.trim().substring(1);
	}


	private static String getEnding(int nbOfBeers) {
		if (1 < nbOfBeers && nbOfBeers < 5){
			return "a";
		}
		return "";
	}

}
