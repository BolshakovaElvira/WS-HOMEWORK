
public class Main {
    public static void main(String[] args) {

        Economy facE = new Economy("Экономичсекий факультет");
        Science facS = new Science("Факультет фундаментальных наук");
        Student st1 = new Student("Экономичсекий факультет","Дуброва И.И");
        Student st2 = new Student("Факультет фундаментальных наук","Иванов А.Д");

        st1.voice();
        st1.setScholarship(3500);
        st1.scholarship();
        System.out.println(st1.TotalScholarship());
        st1.TotalScholarship();
        st2.voice();
        st2.setScholarship(150);
        st2.scholarship();
        System.out.println(st2.TotalScholarship());

        facE.voice();
        facE.accreditation();
        facE.learnEnglish();
        facS.voice();
        facS.accreditation();
        facS.setStatus(false);
        facS.accreditation();
        facS.learnMath();

    }
}
