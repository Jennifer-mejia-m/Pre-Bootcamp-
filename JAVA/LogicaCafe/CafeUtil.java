package LogicaCafe;

import java.util.ArrayList;

public class CafeUtil {
    
   
    public int getStreakGoal(int numWeeks) {
        
        int suma = 0;

        for (int i = 0; i <= numWeeks; i++) {
        suma += i;
    }    
        return suma;    
    }

    public double getOrderTotal(double[] prices) {

            double sum1 = 0;

            for (int i = 0; i < prices.length; i++) {
                sum1 = sum1 + prices[i];
                }

                return sum1;
            } 
  

    void displayMenu(ArrayList<String> menuItems) {
    
        for(int i = 0; i < menuItems.size(); i++) { 
             System.out.println((i) + " " + (menuItems.get(i))); 
            }   

        }        

    void addCustomer(ArrayList<String> customers) {
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println("¡Hola, " + userName + "!");
        System.out.println("Hay "+ customers.size() + " frente a ti." );
        customers.add(userName);
        
    }

}

   


