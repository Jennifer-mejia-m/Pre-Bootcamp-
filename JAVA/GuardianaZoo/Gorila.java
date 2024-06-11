package GuardianaZoo;

public class Gorila extends Mamifero {
    
    public void lanzarAlgo() {
        int energia = getNivelEnergia()-5;
        setNivelEnergia(energia);
        System.out.println("El gorila lanzó algo y redujo su energía a "+ energia);
    }

    public void comerBananas() {
        int energia = getNivelEnergia()+10;
        setNivelEnergia(energia);
        System.out.println("El gorila comió bananas y aumentó su energía a "+ energia);
    }

    public void trepar() {
        int energia = getNivelEnergia()-10;
        setNivelEnergia(energia);
        System.out.println("El gorila trepó y redujo su energía a "+ energia);
    }

}
