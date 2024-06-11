package PEDIDOS;

import java.util.ArrayList;


public class Pedidos {

        private String nombre;
        private boolean listo;
        private ArrayList<Item> items = new ArrayList<Item>();
       
       
       
        public Pedidos() {
                this.nombre ="invitado";
                this.listo = false;
        }

        public Pedidos(String nombre) {
                this.nombre = nombre;
                this.listo = false;
        }

        public void addArticulo(Item Articulos) {
         this.items.add(Articulos);
        }
        
        public void getStatusMessage() {
        if(this.listo == true) {
        System.out.println("Tu pedido está listo"); }
        else {
        System.out.println("Gracias por esperar. Tu pedido estará listo pronto");
                }
        }

        public void display() {
        System.out.println("nombre: "+getNombre());
        for(Item i: this.items) {
                System.out.println(i.getNombre()+" : "+i.getPrecio());
        }
        System.out.println("Total: "+getOrderTotal());
        }

        public double getOrderTotal() {
        double total = 0.00;
        for(Item i: this.items) {
        total += i.getPrecio();
        }
        return total;
        }

        //getters and setters

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public boolean isListo() {
                return listo;
        }

        public void setListo(boolean listo) {
                this.listo = listo;
        }

        public ArrayList<Item> getItems() {
                return items;
        }

        public void setItems(ArrayList<Item> items) {
                this.items = items;
        }


       /*  public double getOrderTotal() {
        double total = 0.00;
        for(int i = 0; i<items.size(); i++); {
        this.total += Articulos;
        }
        return total;
        } */

      
       
   
        
        
}

