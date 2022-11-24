import java.util.ArrayList;

public class Departament {

    private String name;

    private ArrayList<Angajat> angajati;

    public Departament(String name) {
        this.name = name;
        this.angajati = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void add(Angajat a){
        angajati.add(a);
    }
}
