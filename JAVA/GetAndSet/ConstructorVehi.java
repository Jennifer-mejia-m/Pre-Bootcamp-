package GetAndSet;

public class ConstructorVehi {
    
    private int numberWheels;
    private String color;
    private int doors;
    private String combustible;
    private boolean automático;


    public ConstructorVehi(int numberWheels, String color, int doors, String combustible, boolean automático) {
        this.numberWheels = numberWheels;
        this.color = color;
        this.doors = doors;
        this.combustible = combustible;
        this.automático = automático;  
    }


    public ConstructorVehi(int numberWheels, String color) {
        this.numberWheels = numberWheels;
        this.color = color;
    }

    

}
