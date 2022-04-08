public abstract class Faculty extends Dictionary {
    protected boolean status = true;
    public Faculty(String name) {
        super(name);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void voice() {

        System.out.println(getName());
    }
    public void accreditation() {

        if (status == true) {System.out.println("Учимся дальше юху");}
        else {System.out.println("Идем плакать");}

    }

}
