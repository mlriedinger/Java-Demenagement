package demenagementPack;

public class Demenagement {
	private String nom;
	private int capCamion;
	private int noVoyage = 0;
	private int emport;
	
	public Demenagement(String nom, int capCamion) {
		this.nom = nom;
		this.capCamion = capCamion;
		}
	public void auTravail(int nbCartons) {
		System.out.println(nom + " possède un camion de capacité : " + capCamion);
		System.out.println("Début du déménagement ...");
		System.out.println("noVoyage \t" + "nbCartons \t" + "emport \t" + "capCamion \t");
		while(nbCartons > 0) {
			
			if (nbCartons > capCamion) {
				emport = capCamion;
			}
			else emport = nbCartons;
			noVoyage++;
			System.out.println(noVoyage + "\t \t" + nbCartons + "\t \t" + emport + "\t \t" + capCamion);
			nbCartons = nbCartons - emport; 
		}
		System.out.println("Fin du déménagement.");
		}
}

