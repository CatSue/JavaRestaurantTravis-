package fr.epsi.poe.hardis;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

/**
 * HotelTest : OK
 * Created by T'Chi on 28/02/2017.
 * Classe de test
 */

public class HotelTest {

    //public String why;

    public static final String NUM_TELEPHONE1 = "+33605020305";
    public static final String NUM_TELEPHONE2 = "0605020305";

    //Constructeur qui permet de lancer les TU
    public HotelTest() {
    }

    //vérification qu'un hotel est ouvert par defaut
    @Test
    public void testThatHotelIsOpenByDefault() {
        Hotel hotel = new Hotel();

        /**
         * Act
         * action sur l'objet, on va vérifier que le hotel est ouvert
         */
        boolean etat = hotel.isOuverture();

        /**
         * Assert
         */
        Assert.assertTrue("Error", etat); //vérifie que l'état est bien vrai
    }

    //vérification quand on set n° de téléphone si le n° commence par +33 sauvegarde
    @Test
    public void testThatSaveTheValidNumber() {
        // Arrange
        Hotel hotel = new Hotel();
        // Act
        hotel.setTelephone(NUM_TELEPHONE1);
        // Assert
        Assert.assertEquals("Error", NUM_TELEPHONE1, hotel.getTelephone());
    }

    //vérification quand on set n° de téléphone si le n° ne commence par +33 pas de sauvegarde
    @Test
    public void testThatNotSaveTheInvalidNumber() {
        // Arrange
        Hotel hotel = new Hotel();
        // Act
        hotel.setTelephone(NUM_TELEPHONE2);
        // Assert
        Assert.assertNotEquals("Error", NUM_TELEPHONE2, hotel.getTelephone());
    }

    //vérification qu'il est possible de stocker des départements corses (cas limite)
    @Test
    public void testThatCorseIsOk() {
    }
}