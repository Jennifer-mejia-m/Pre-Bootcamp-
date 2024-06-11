package GetAndSet;

public class VehiculoTest {
    
    public static void main(String[] args) {
        
    
        
        Vehiculo bicicleta = new Vehiculo();
        Vehiculo auto = new Vehiculo();

        bicicleta.setNumeroDeRuedas(2);
        bicicleta.setColor("rojo");

        int bicletaRuedas = bicicleta.getNumeroDeRuedas();
        String bicicletaColor = bicicleta.getColor();

        auto.setNumeroDeRuedas(4);
        auto.setColor("negro");

        int autoRuedas = auto.getNumeroDeRuedas();
        String autoColor = auto.getColor();

        System.out.println("Bicicleta object - Ruedas: "+ bicletaRuedas + ", color: " + bicicletaColor);
        System.out.println("Auto object - Ruedas: "+ autoRuedas + ", color: " + autoColor);

    }

}
