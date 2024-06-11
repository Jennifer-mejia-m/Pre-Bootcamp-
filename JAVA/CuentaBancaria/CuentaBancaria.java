package CuentaBancaria;

public class CuentaBancaria {

    private double saldoCorriente;
    private double saldoAhorros;
    private static int cantidadCuentas=0;
    private static double cantidadTotalDinero=0;

    private String numeroCuenta;
    
   
    public CuentaBancaria() {
        this.numeroCuenta = generarCuenta();
        cantidadCuentas+=1;
    }

    //BONUS NINJA

    private static String generarCuenta() {
        String cuenta= "";
        for (int i=0; i<10; i++) {
            int aleatorio =((int) (Math.random()*10))+48;
            char num = (char) aleatorio;
           cuenta+=num;
        }
        return cuenta; 
    }

    //metodos

    public double depositarDinero(double monto, String cuenta){
        if (cuenta == "Ahorros") {
           this.saldoAhorros+=monto; 
        }
        else{
            this.saldoCorriente+=monto;
        }
        CuentaBancaria.cantidadTotalDinero+=monto;
        System.out.println("Monto depositado "+monto);
        return cantidadTotalDinero;
    }

    public double retirarDinero(double monto, String cuenta){
        if (cuenta == "Ahorros" && getSaldoAhorros()> monto) {
            this.saldoAhorros-=monto;
        }
        else if (cuenta == "Corriente" && getSaldoCorriente()>monto) {
            this.saldoCorriente-=monto;
        }
        else {
            System.out.println("No jodas");
        }
        
        return cantidadTotalDinero=saldoAhorros+saldoCorriente;

    }

    public void verDineroTotal(String cuenta) {
        switch (cuenta) {
            case "Ahorros":
                System.out.println("Saldo en la cuenta de ahorros "+getSaldoAhorros());
                break;
            case "Corriente":
                System.out.println("Saldo de la cuenta corriente "+getSaldoCorriente());
                break;
        }
    }

    //getters and setters
    public double getSaldoCorriente() {
        return saldoCorriente;
    }
    public void setSaldoCorriente(double saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }
    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }


    public static int getCantidadCuentas() {
        return cantidadCuentas;
    }
    public static void setCantidadCuentas(int cantidadCuentas) {
        CuentaBancaria.cantidadCuentas = cantidadCuentas;
    }


    public static double getCantidadTotalDinero() {
        return cantidadTotalDinero;
    }
    public static void setCantidadTotalDinero(double cantidadTotalDinero) {
        CuentaBancaria.cantidadTotalDinero = cantidadTotalDinero;
    }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

   
    
    
}
