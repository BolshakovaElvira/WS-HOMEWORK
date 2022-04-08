public class Student extends Dictionary {

    private String name;
    private String fio;
    private int age;
    private int scholarship = 3000;
    private int minscolarship = 500;
    private double index = 1.4;

    public Student(String name,String fio) {

        super(name);
        this.fio=fio;

    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public int getScholarship() {
        return scholarship;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void scholarship()
    {
        if (getScholarship()<minscolarship) {System.out.println("Голодаю...");}
        else {System.out.println("Ем дошик.");}

    }
    public void voice() {
        System.out.println(getFio());
    }
    public double TotalScholarship(){
        double newscholarship=0;
        if (getScholarship()>minscolarship || getScholarship()==minscolarship) {
            newscholarship = scholarship*index;}
        else {newscholarship=getScholarship();}

        return newscholarship;

    }

}
