package GuardianaZoo;

public class Murcielago extends Mamifero {


   public Murcielago() {
        this.setNivelEnergia(300);
   } 

    public void volar() {
        int energia = getNivelEnergia()-50;
        setNivelEnergia(energia);
        System.out.println("El murciélago voló y redujo su energía a "+ energia);
    }

    public void comerHumanos() {
        int energia = getNivelEnergia()+25;
        setNivelEnergia(energia);
        System.out.println("El murciélago comió un humano y aumentó su energía a "+ energia);
    }

    public void atacarPueblos() {
        int energia = getNivelEnergia()-100;
        setNivelEnergia(energia);
        System.out.println("El murciélago incendió un pueblo y redujo su energía a "+ energia);
    }

    
}
