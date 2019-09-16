public class MainStart {

    public static void main(String[] args) {

        System.out.println("Lommeregneren regner:");

    //for at aktivere programmet
        Lommeregner lommeregner = new Lommeregner();

        //ADDERINGSREGNESTYKKER
        System.out.print("Hvad mon 2 + 3 er? ");
        System.out.println(lommeregner.addering(2, 3));

        System.out.print("Hvad mon 235 + 234 er? ");
        System.out.println(lommeregner.addering(235, 234));

        System.out.print("Hvad mon 100 + 300 er? ") ;
        System.out.println(lommeregner.addering(100, 300));
        System.out.println(" ");

        //SUBSTRAKTIONSREGNESTYKKER
        System.out.print("Hvad mon 2 - 3 er? ");
        System.out.println(lommeregner.substraction(2, 3));

        System.out.print("Hvad mon 235 - 234 er? ");
        System.out.println(lommeregner.substraction(235, 234));

        System.out.print("Hvad mon 100 - 300 er? ") ;
        System.out.println(lommeregner.substraction(100, 300));
        System.out.println(" ");

        //MULTIPLIKAITON
        System.out.print("Hvad mon 2 * 3 er? ");
        System.out.println(lommeregner.multiplikation(2, 3));

        System.out.print("Hvad mon 235 * -234 er? ");
        System.out.println(lommeregner.multiplikation(235, 234));

        System.out.print("Hvad mon 100 * 300 er? ") ;
        System.out.println(lommeregner.multiplikation(100, 300));
        System.out.println(" ");

        //DELE
        System.out.print("Hvad mon 2.0 / 3 er? ");
        System.out.println(lommeregner.dele(2, 3));

        System.out.print("Hvad mon 235.0/ -234 er? ");
        System.out.println(lommeregner.dele(235, 234));

        System.out.print("Hvad mon 100.0 / 300 er? ") ;
        System.out.println(lommeregner.dele(100, 300));
        System.out.println(" ");


        //SECRET REGNESTYKKE
        System.out.print("Hvad mon (2 * 3) / (3 + 2.0) er? ");
        System.out.println(lommeregner.secret(2, 3));

        System.out.print("Hvad mon (a * b) / (b + 2.0) er? ");
        System.out.println(lommeregner.secret(235, 234));

        System.out.print("Hvad mon (a * b) / (b + 2.0) er? ");
        System.out.println(lommeregner.secret(100, 300));
        System.out.println(" ");
    }

}
