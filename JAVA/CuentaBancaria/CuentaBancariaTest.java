package CuentaBancaria;

import java.util.Random;

public class CuentaBancariaTest {

    public static void main(String[] args) {
        
        CuentaBancaria Usuario = new CuentaBancaria();
        CuentaBancaria Janko = new CuentaBancaria();

        Usuario.depositarDinero(250.30, "Ahorros");
        Janko.depositarDinero(350.0, "Corriente");

        Usuario.verDineroTotal("Ahorros");
        Usuario.verDineroTotal("Corriente");

        Janko.retirarDinero(60.50, "Corriente");

       
        Usuario.verDineroTotal("Ahorros");

        System.out.println(CuentaBancaria.getCantidadCuentas());
        System.out.println(CuentaBancaria.getCantidadTotalDinero());
        System.out.println(Usuario.getNumeroCuenta());
        System.out.println(Janko.getNumeroCuenta());
        

    }
    
}
