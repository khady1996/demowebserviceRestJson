package eu.ensup.demowebservicerestjackson.domaine;

public class Employe {
	private String nom; // Propriété 'nom'
	private String prenom;

	public Employe() {
		super();
	}

	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() { // Getter pour propriété 'nom'
		return nom;
	}

	public String getPrenom() { // Getter pour propriété 'prenom'
		return prenom;
	}

	public void setNom(String nom) { // Setter pour propriété 'nom'
		this.nom = nom;
	}

	public void setPrenom(String prenom) { // Setter pour propriété 'prenom'
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
