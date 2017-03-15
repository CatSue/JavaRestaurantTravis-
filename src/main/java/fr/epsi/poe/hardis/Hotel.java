package fr.epsi.poe.hardis;

/**
 * Created by Olivier on 09/03/2017.
 */
public class Hotel {
    private String nom;

    //Adresse de l'hotel
    private String adresse;

    //Code postal l'hotel
    private String codePostal;

    /* N° de téléphone l'hotel */
    private String telephone;

    //Ouverture ou fermeture l'hotel
    private boolean ouverture = true;

    public Hotel(){

    }

    public Hotel(String nom, String adresse, String codePostal, String telephone, boolean ouverture) {
        this.nom = nom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.telephone = telephone;
        this.ouverture = ouverture;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getTelephone() {
        return telephone;
    }

    public boolean isOuverture() {
        return ouverture;
    }

    public void setTelephone(String pTelephone) {
        //vérifier si le téléphone n'est pas nul, n'est pas vide et commence bien par +33
        if (pTelephone != null && !"".equals(pTelephone) && pTelephone.startsWith("+33")) {
            telephone = pTelephone;
        }
    }

}
