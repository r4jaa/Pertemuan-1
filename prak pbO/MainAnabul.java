public class MainAnabul {
    public static void main(String[] args) {
        anabul kucing = new kucing("puspus");
        anabul anjing = new anjing("Doggiee");
        anabul burung = new burung("Berd");

        kucing.gerak();
        kucing.bersuara();
        System.out.println("\n");
        anjing.gerak();
        anjing.bersuara();
        System.out.println("\n");
        burung.gerak();
        burung.bersuara();
    }
}