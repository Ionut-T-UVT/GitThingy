public class Main {
    public static void main(String[] args) {
        Firma a = new Firma("Conti");
        Departament d = new Departament("5G");
        d.add(new Manager("Dorel", 5000));
        d.add(new Programator("Dorel Senior", 5001));
        d.add(new Programator("Dorel Junior", 5002));
        a.add(d);
    }
}