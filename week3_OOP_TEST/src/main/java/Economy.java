import java.util.ArrayList;
//I M HERE HER
public class Economy extends Faculty implements learn {

    public Economy(String name) {
        super(name);
    }


    @Override
    public void learnLaw() {
        System.out.println("Учим экономику.");
    }

    @Override
    public void learnMath() {
        System.out.println("Учим математику.");
    }

    @Override
    public void learnEnglish() {
        System.out.println("Учим английский.");
    }

    @Override
    public void learnPhilosophy() {
        System.out.println("Учим философию.");
    }
}
