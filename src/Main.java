import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Random nahCislo = new Random();

        RodinnyDom domNovakov = new RodinnyDom(4, "mramor", 457f);
        float cenaPrvehoDomu = domNovakov.vypocetCenyDomu(300, "Novakovi");


        RodinnyDom domZajacov = new RodinnyDom(3, "drevo", 646f);
        float cenaDruhehoDomu = domZajacov.vypocetCenyDomu(250, "Zajacovi");




        System.out.println(cenaPrvehoDomu + cenaDruhehoDomu);


    }
}