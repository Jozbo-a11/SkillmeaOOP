import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random nahCislo = new Random();

        RodinnyDom domNovakov = new RodinnyDom();
        domNovakov.pocetPoschodi = 4;
        domNovakov.rozloha = 457f;
        domNovakov.material = "mramor";
        domNovakov.vypocetCenyDomu(300, "Novakovi");


        RodinnyDom domZajacov = new RodinnyDom();
        domZajacov.rozloha = 646f;
        domZajacov.pocetPoschodi = 3;
        domZajacov.vypocetCenyDomu(250, "Zajacovi");



    }
}