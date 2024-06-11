package LogicaCafe;

import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {

    public static void main(String[] args) {
      
    CafeUtil starCafeteria = new CafeUtil();    

    /* 
      Necesitarás agregar 1 línea a este archivo para crear una instancia
      de la clase CafeUtil.
      Sugerencia: deberás corresponder con el nombre de la variable que se usa a continuación.
    */
    	
        /* ============ Casos de prueba de la App ============= */
    
        System.out.println("\n----- Prueba Meta café -----");
        System.out.printf("Compras necesarias para la semana 10: %s \n\n", starCafeteria.getStreakGoal(10));
    
        System.out.println("----- Prueba Total Orden -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Total orden: %s \n\n", starCafeteria.getOrderTotal(lineItems));
        
        System.out.println("----- Prueba Mostrar Menú-----");
        
       ArrayList<String> menu = new ArrayList<String>();
        menu.add("café de goteo");
        menu.add("capuchino");
        menu.add("latte");
        menu.add("moka");
        starCafeteria.displayMenu(menu);
    
        System.out.println("\n----- Prueba agregar cliente-----");
        ArrayList<String> customers = new ArrayList<String>();
        // // --- Probar 4 veces ---
         for (int i = 0; i < 4; i++) {
             starCafeteria.addCustomer(customers);
          System.out.println("\n");
        }
    }
}
