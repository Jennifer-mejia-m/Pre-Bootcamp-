package firstw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        System.out.println("hola a todos");

        int edad = 40;

        if (edad < 35 && edad > 2 ){
            System.out.println("Bienvenido");
        }
        else if (edad > 40) {
            System.out.println("No puede ingresar");
        } else {
            System.out.println("estas viejo");
        }

        boolean isRaining = true; //si son 2 variables distintas, xq solo imprime isRaining?//
        boolean isCold = true;
            
        if(isRaining) {
            System.out.println("Lleva paraguas.");
        }
        else if(isCold) {
            System.out.println("Ponte un abrigo.");
        }
        else {
            System.out.println("¡Diviértete!");
        }

        int day = 6;

        switch (day) {
            case 1:
            System.out.println("monday");
                break;
            case 2:
            System.out.println("tuesday");
                break;
            case 3:
            System.out.println("wednesday");
                break;      
            case 4:
            System.out.println("thursday");
                break;
            case 5:
            System.out.println("friday");
                break;  
            case 6:
            System.out.println("saturday");
                break;                
        }

        boolean isSnowing = true;

        System.out.println( isSnowing ? "no salgas" : "partyseo");

        int hospis = 5;

        System.err.println(hospis > 10? "efectivo" : "construir");

        String janko = "  Soy un niño feliz y amado   ";
        System.out.println(janko);

        int a = janko.indexOf("niño");
        int b = janko.indexOf("y");
        int c = janko.indexOf("un");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int suma = a + b + c;
        System.out.println(suma);

        System.out.println(janko.trim());

        String min = "COMO ESTAS";
        String may = "el pato cua cua";

        System.out.println(min.toLowerCase());
        System.out.println(may.toUpperCase());

        String ab = new String( "Dojo" );
        System.out.println( ab == "Dojo" );
        // sorprendentemente esto imprimirá `false`

        System.out.println( ab.equals("Dojo") );

        int[] numbers = {2, 4, 12, 7, 23, 44, 5, 9, 7, 11, 10, 3};
        int temp = numbers[1];
        numbers [4] = temp;

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("---------");
        System.out.println(numbers[0] + numbers[3]);
        
        ArrayList<Integer> things = new ArrayList<>();
        things.add(5);
        things.add(11);
        things.add(8);
        things.add(-9);
        things.add(1,4);
        /* things.clear(); */

        System.out.println(things);

        int[] numbers1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i=0; i<numbers1.length; i++) {
            if(i%2 !=0 ){
            System.out.println(numbers1[i]);
        }
    }

    System.out.println("-----hashmap-----");

    HashMap<String, String> countryCapitals = new HashMap<String, String>();
    countryCapitals.put("lima", "capital del perú y queda en sudamérica");
    countryCapitals.put("Madrid", "capital de españa está europa");
    countryCapitals.put("ciudad de panamá", "capital de Panamá y está en centroamérica");
    countryCapitals.put("washington", "capital de USA y queda en norteamérica");
    countryCapitals.put("tokyo", "capital de japón y queda en asia");

    Set<String> keys = countryCapitals.keySet();
    for (String key : keys) {
        System.out.println(key);
        System.out.println(countryCapitals.remove("lima","lima"));
    }

    /* System.out.println(countryCapitals); */

   /*  double[] jenn = {9.5, 1.2};
    int jenn1 = (int) jenn;

    System.out.println(jenn1); */
    

    String prueba = "¡Alexis! Toca algunos beats low-fi.";

    System.out.println(prueba.indexOf("low"));

}
 
}
        // Add five countries and capitals to the 'countryCapitals' map
        // Print all keys from the map
        // Print two countries and their capitals ('The capital of Oman is Muscat.')

