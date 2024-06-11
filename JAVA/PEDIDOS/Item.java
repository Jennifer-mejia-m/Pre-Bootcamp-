package PEDIDOS;

public class Item {
    
    private String nombre;
    private double precio;


    //constructor
    public Item(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
