import javax.print.attribute.standard.JobKOctets;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RodinnyDom domNovakov = new RodinnyDom(4, "mramor", 457f);
        float cenaPrvehoDomu = domNovakov.vypocetCenyDomu(300, "Novakovi");

        RodinnyDom domZajacov = new RodinnyDom(3, "drevo", 646f);
        float cenaDruhehoDomu = domZajacov.vypocetCenyDomu(250, "Zajacovi");

        System.out.println(cenaPrvehoDomu + cenaDruhehoDomu);

        Obchod kaufland = new Obchod(2600f, 2, 25);
        kaufland.vypocetCenyObchodu();

        //Miesto pre Zverimex
        Pes alik = new Pes(4, "labrador", 15, 2);
        alik.urobZvuk();

        Macka micka = new Macka(4, "perzska", 8, 20);
        micka.urobZvuk();

    }
}