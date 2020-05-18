package demenagementPack;

import java.util.Scanner;

public class TestDem {

	public static void main(String[] args) {
	
		System.out.println("Bienvenue");
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle est la capacité du camion ?");
		int inputCapacity = sc.nextInt();
		
		System.out.println("Combien de cartons souhaitez-vous déménager ?");
		int inputBoxes = sc.nextInt();
		
		Demenagement dem = new Demenagement("Entreprise Bretonne", inputCapacity);
		dem.auTravail(inputBoxes);
	}

}
