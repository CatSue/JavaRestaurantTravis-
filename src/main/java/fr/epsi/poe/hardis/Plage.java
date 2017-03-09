package fr.epsi.poe.hardis;

/**
 * Plage : classe pour tester la branche feature
 * @version : 1.0
 * @author : Marie PÉTROD
 */

public class Plage {
    //Nom de la plage
    private String nom;

    //Nombre de parasols
    private int nbParasol;

    //Température de l'eau
    private int temp;

    //Nombre de grains de sable
    private long grains;

    //********************CONSTRUCTEURS********************//
    public Plage(String pNom, int pNbParasol, int pTemp) {
        nom = pNom;
        nbParasol = pNbParasol;
        temp = pTemp;
    }
}
