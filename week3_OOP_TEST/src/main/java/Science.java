public class Science extends Faculty implements learn {

    public Science(String name) {
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
