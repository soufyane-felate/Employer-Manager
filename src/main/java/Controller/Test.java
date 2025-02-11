package Controller;

public class Test  {
	String nom,prenom,email,post;
	double salaire;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Test(String nom, String prenom, String email, String post, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.post = post;
		this.salaire = salaire;
	}
	

}
