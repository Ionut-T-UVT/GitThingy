import java.util.ArrayList;
public class Firma {

    private String nume;
    private ArrayList<Departament> departamente;

    public Firma(String nume) {
        this.nume = nume;
        departamente = new ArrayList<Departament>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<Departament> getDepartamente() {
        return departamente;
    }

    public void setDepartamente(ArrayList<Departament> departamente) {
        this.departamente = departamente;
    }

    public void add(Departament d) {
        departamente.add(d);
    }


}