import junit.framework.TestCase;

//
public class LommeregnerTest extends TestCase {

    //Definerer testen på klassen 'Lommeregner' - navngiver den 'lommeregnertest'
    Lommeregner lommeregnertest = new Lommeregner(); //deklarerer 'lommeregnertest'

    /* skriv 'test' foran metodenavnet på den metode du vil teste, derefter assertEquals,
       og i parantesen forventet resultatat af metoden, på baggrund af de indsatte variabler.
     */
    public void testAddering() {
        assertEquals(6, lommeregnertest.addering(2,4));
    }

    public void testSubstraction() {
        assertEquals(10, lommeregnertest.substraction(30, 20));
    }

    public void testMultiplikation() {
        assertEquals(80, lommeregnertest.multiplikation(8,10));
    }

    public void testDele() {
        assertEquals(7.0, lommeregnertest.dele(49.0,7));
    }

    public void testSecret() {
        assertEquals(2.5, lommeregnertest.secret(5,2));
    }
}