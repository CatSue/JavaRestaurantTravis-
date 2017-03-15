package fr.epsi.poe.hardis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

/**
 * HotelTest : OK
 * Created by T'Chi on 28/02/2017.
 * Classe de test
 */

public class RestaurantTest {

    //public String why;

    public static final String NUM_TELEPHONE1 = "+33605020305";
    public static final String NUM_TELEPHONE2 = "0605020305";

    //Constructeur qui permet de lancer les TU
    public RestaurantTest() {
    }

    //vérification qu'un restaurant est ouvert par defaut
    @Test
    public void testThatRestaurantIsOpenByDefault() {
        Restaurant restaurant = new Restaurant();

        /**
         * Act
         * action sur l'objet, on va vérifier que le restaurant est ouvert
         */
        boolean etat = restaurant.isOuverture();

        /**
         * Assert
         */
        Assert.assertTrue("Error", etat); //vérifie que l'état est bien vrai
    }

    //vérification quand on set n° de téléphone si le n° commence par +33 sauvegarde
    @Test
    public void testThatSaveTheValidNumber() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        restaurant.setTelephone(NUM_TELEPHONE1);
        // Assert
        Assert.assertEquals("Error", NUM_TELEPHONE1, restaurant.getTelephone());
    }

    //vérification quand on set n° de téléphone si le n° ne commence par +33 pas de sauvegarde
    @Test
    public void testThatNotSaveTheInvalidNumber() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        restaurant.setTelephone(NUM_TELEPHONE2);
        // Assert
        Assert.assertNotEquals("Error", NUM_TELEPHONE2, restaurant.getTelephone());
    }

    //vérification qu'il est possible de stocker des départements corses (cas limite)
    @Test
    public void testThatCorseIsOk() {
    }
}