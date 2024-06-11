package CafeJava;

public class CafeJava {

    public static void main (String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        String cliente0 = "Janko";
        String textC = saludoGeneral.concat(cliente0);
        System.out.println(textC);

        int largoText = mensajeListo.length();
        System.out.println(largoText);

        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double cafeFiltro = 5.6;
        double cafeLeche = 4.2;
        double capuchino = 9.8;
    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = false;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //

        System.out.println(estaListoOrden1 ? mensajeListo : mensajePendiente);
        

        System.out.println(saludoGeneral + cliente4);
        
        if (estaListoOrden4) {
            System.out.println(mensajeListo +" " + mensajeMostrarTotal + capuchino);
        } else {
            System.out.println(mensajePendiente);
        }
      
        System.out.println(saludoGeneral + cliente2);
        
        if (estaListoOrden2) {
            System.out.println(mensajeListo);
        } else {
            System.out.println(mensajePendiente);
        }

        System.out.println(saludoGeneral + cliente3);
        
        System.out.println(mensajeMostrarTotal +(cafeFiltro - cafeLeche));
        
      
    }
}

