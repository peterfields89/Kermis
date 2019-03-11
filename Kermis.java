import java.util.Scanner;

public class Kermis {
	public static void main(String[] args) {
		System.out.println("Welkom bij de kermis!");
		Starten start = new Starten();
		start.starten();

	}
}

class Starten {
	void starten() {
		Attractie atr = new Attractie();
		Attractie botsautos = new Botsautos();
		botsautos.naam = "Botsautos";
		Attractie spin = new Spin();
		spin.naam = "Spin";
		Attractie spiegel = new Spiegelpaleis();
		spiegel.naam = "Spiegelpaleis";
		Attractie spook = new Spookhuis();
		spook.naam = "Spookhuis";
		Attractie hawaii = new Hawaii();
		hawaii.naam = "Hawaii";
		Attractie ladder = new Ladderklimmen();
		ladder.naam = "Ladder klimmen";
		OmzetBerekenen omzet = new OmzetBerekenen();
		Kaartjes kaartje = new Kaartjes();
		BelastingInspecteur inspecteur = new BelastingInspecteur();
		System.out.println("Voer 1 in om de Botsautos te starten");
		System.out.println("Voer 2 in om de Spin te starten");
		System.out.println("Voer 3 in om het Spiegelpaleis te starten");
		System.out.println("Voer 4 in om het Spookhuis te starten");
		System.out.println("Voer 5 in om Hawaii te starten");
		System.out.println("Voer 6 in om het Ladderklimmen te starten");
		System.out.println("Voer letter 'o' in om de omzet te bekijken");
		System.out.println("Voer uw getal of letter in:");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 1000; i++) {
			String ingegevene = scan.nextLine();
			switch (ingegevene) {
			case "1":
				botsautos.starten();
				omzet.omzet += 2.50;
				kaartje.kaartje += 1;
				break;
			case "2":
				spin.starten();
				omzet.omzet += 2.25;
				kaartje.kaartje += 1;
				break;
			case "3":
				spiegel.starten();
				omzet.omzet += 2.75;
				kaartje.kaartje += 1;
				break;
			case "4":
				spook.starten();
				omzet.omzet += 3.20;
				kaartje.kaartje += 1;
				break;
			case "5":
				if (kaartje.kaartje < 5) {
					hawaii.starten();
					omzet.omzet += 2.90;
					kaartje.kaartje += 1;
					break;
				} else {
					System.out.println("Helaas, de attractie moet sluiten voor onderhoud");
				}
				break;
			case "6":
				if (kaartje.kaartje < 10) {
					ladder.starten();
					omzet.omzet += 5.00;
					inspecteur.kansSpelBelastingBetalen(omzet.omzet);
					kaartje.kaartje += 1;
					break;
				} else {
					System.out.println("Helaas, de attractie moet sluiten voor onderhoud");
				}
				break;
			case "o":
				System.out.println("De totale omzet is: " + omzet.omzet + " euro, en er zijn " + kaartje.kaartje
						+ " kaartjes verkocht!");
				break;
			default:
				System.out.println("Helaas hebben we niet meer dan 6 attracties :(");
				break;
			}
		}
	}
}

class Attractie {
	double omzet;
	int kaartje;
	String naam;

	void starten() {
		System.out.println("Attractie is gestart");
	}
}

class Botsautos extends Attractie {
	void starten() {
		System.out.println(naam + " is gestart");
	}
}

class Spin extends Attractie {
	void starten() {
		System.out.println(naam + " is gestart");
	}
}

class Spiegelpaleis extends Attractie {
	void starten() {
		System.out.println(naam + " is gestart");
	}
}

class Spookhuis extends Attractie {
	void starten() {
		System.out.println(naam + " is gestart");
	}
}

class Hawaii extends Attractie {
	void starten() {
		System.out.println(naam + " is gestart");
	}
}

class Ladderklimmen extends Attractie {
	void starten() {
		System.out.println(naam + " is gestart");
	}
}

class OmzetBerekenen {
	double omzet;

	public void alleomzet(double o) {
		omzet += o;
	}
}

class Kaartjes {
	int kaartje;

	void allekaartjes(int k) {
		kaartje += k;
	}
}
class BelastingInspecteur{
	double omzet;
	void kansSpelBelastingBetalen(double b) {
		omzet =- 1.5;
	}
	
}