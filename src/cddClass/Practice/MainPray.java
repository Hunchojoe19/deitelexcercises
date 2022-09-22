package cddClass.Practice;

public class MainPray {
    public static void main(String[] args) {
        Pray1 pray1 = new Pray1();
        Walk walk = new Walk();
        PapaNosa nosa = new PapaNosa(pray1, walk);

        nosa.pray();
        nosa.walk();
        System.out.println();
        Pray2 pray2 = new Pray2();
        PapaNosa sandra = new PapaNosa(pray2, walk);
        sandra.pray();
        sandra.walk();
        System.out.println();
        Pray1 adura = new Pray1();
        Walk waka = new Walk();
        PapaNosa ernest = new PapaNosa(adura, waka);
        ernest.pray();
        ernest.walk();

    }
}
