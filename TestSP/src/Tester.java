public class Tester implements Angajat {

    private String name;

    private int salar;

    public Tester(String name, int salar) {
        this.name = name;
        this.salar = salar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }
}
