package ATM;
//
public class Cliens {


    private String nom;
    private String prenom;
    private String adresse;
    private  String ville;
    private  int codePostal;
    private  int code;

    private int sold;




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
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {

        this.adresse = adresse;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {

        this.ville = ville;
    }


    public int getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(int codePostal) {

        this.codePostal = codePostal;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getSold() {
        return sold;
    }
    public void setSold(int sold) {

        this.sold = sold;
    }


}
