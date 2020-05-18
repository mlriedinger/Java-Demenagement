package demenagementPack;

import java.util.Scanner;

public class TestDem {

	public static void main(String[] args) {
	
		System.out.println("Bienvenue");
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quelle est l'entreprise que vous avez choisi ? ");
		String inputCompany = sc.nextLine();
		
		System.out.printf("Quelle est la capacité du camion ? ");
		int inputCapacity = sc.nextInt();
		
		System.out.print("Combien de cartons souhaitez-vous déménager ? ");
		int inputBoxes = sc.nextInt();
		sc.close();
		
		
		Demenagement dem = new Demenagement(inputCompany, inputCapacity);
		dem.auTravail(inputBoxes);
	}

}
