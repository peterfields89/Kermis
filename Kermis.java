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
		Attractie spin = new Spin();
		Attractie spiegel = new Spiegelpaleis();
		Attractie spook = new Spookhuis();
		Attractie hawaii = new Hawaii();
		Attractie ladder = new Ladderklimmen();
		System.out.println("Voer 1 in om de Botsautos te starten");
		System.out.println("Voer 2 in om de Spin te starten");
		System.out.println("Voer 3 in om het Spiegelpaleis te starten");
		System.out.println("Voer 4 in om het Spookhuis te starten");
		System.out.println("Voer 5 in om Hawaii te starten");
		System.out.println("Voer 6 in om het Ladderklimmen te starten");
		Scanner scan = new Scanner(System.in);
		String ingegevene = scan.nextLine();
		if (ingegevene.equals("1")) {
			botsautos.starten();
		}
		if (ingegevene.equals("2")) {
			spin.starten();
		}
		if (ingegevene.equals("3")) {
			spiegel.starten();
		}
		if (ingegevene.equals("4")) {
			spook.starten();
		}
		if (ingegevene.equals("5")) {
			hawaii.starten();
		}
		if (ingegevene.equals("6")) {
			ladder.starten();
		} else {
			// System.out.println("Helaas, we hebben maar 6 attracties");
		}
	}
}

class Attractie {
	double prijs;

	void starten() {
		System.out.println("Attractie is gestart");
	}
}

class Botsautos extends Attractie {
	double prijs = 2.5;

	void starten() {
		System.out.println("Botsauto's is gestart");
	}
}

class Spin extends Attractie {
	double prijs = 2.25;

	void starten() {
		System.out.println("Spin is gestart");
	}
}

class Spiegelpaleis extends Attractie {
	double prijs = 2.75;

	void starten() {
		System.out.println("Spiegelpaleis is gestart");
	}
}

class Spookhuis extends Attractie {
	double prijs = 3.20;

	void starten() {
		System.out.println("Spookhuis is gestart");
	}
}

class Hawaii extends Attractie {
	double prijs = 2.90;

	void starten() {
		System.out.println("Hawaii is gestart");
	}
}

class Ladderklimmen extends Attractie {
	double prijs = 5.00;

	void starten() {
		System.out.println("Ladderklimmen is gestart");
	}
}