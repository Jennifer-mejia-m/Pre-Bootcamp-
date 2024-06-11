package PEDIDOS;

import java.util.ArrayList;

public class PedidosTest {

    public static void main(String[] args) {
        
        Pedidos CafeJava = new Pedidos();

        // Elementos del menú

        Item articulo1 = new Item("moka", 10.50);
        Item articulo2 = new Item("latte", 11.5);
        Item articulo3 = new Item("cafe de goteo", 9.00);
        Item articulo4 = new Item("capuchino", 13.20);

            
        //Ordenar variables -- orden1, orden2, etc.

        Pedidos pedido1 = new Pedidos();
        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);
        pedido1.display();

        Pedidos pedido2 = new Pedidos();
        pedido2.addArticulo(articulo4);
        pedido2.addArticulo(articulo1);
        pedido2.setListo(true);
        pedido2.display();
        pedido2.getStatusMessage();

        Pedidos pedido3 = new Pedidos("Carlos");
        pedido3.addArticulo(articulo2);
        pedido3.addArticulo(articulo4);
        pedido3.setListo(false);
        pedido3.display();
        pedido3.getStatusMessage();

        Pedidos pedido4 = new Pedidos("Rebeca");
        pedido4.addArticulo(articulo3);
        pedido4.addArticulo(articulo1);
        pedido4.display();

        Pedidos pedido5 = new Pedidos("Janko");
        pedido5.addArticulo(articulo2);
        pedido5.addArticulo(articulo3);
        pedido5.display();



        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        //System.out.printf("Nombre: %s\n", pedido1.nombre);
        //System.out.printf("Total: %s\n", pedido1.total);
        //System.out.printf("Listo: %s\n", pedido1.listo);

       
    }
}




    

