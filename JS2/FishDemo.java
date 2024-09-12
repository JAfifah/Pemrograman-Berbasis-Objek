public class FishDemo {
    public static void main(String[] args) {
        Fish ikan1 = new Fish();
        ikan1.spesies = "Ikan Hiu";
        ikan1.ukuran = 300.5;
        ikan1.umur = 5;
        ikan1.habitat = "Laut";

        Fish ikan2 = new Fish();
        ikan2.spesies = "Ikan Koi";
        ikan2.ukuran = 40.2;
        ikan2.umur = 1;
        ikan2.habitat = "Kolam";

        System.out.println("Spesies: " + ikan1.spesies);
        System.out.println("Ukuran : " + ikan1.ukuran + " cm");
        System.out.println("Umur   : " + ikan1.umur + " tahun");
        System.out.println("Habitat: " + ikan1.habitat);
        ikan1.berenang();
        ikan1.makan();
        ikan1.berkembangbiak();

        System.out.println("\nUpdate atribut objek ikan2...");
        ikan2.umur = 2;
        ikan2.habitat = "Akuarium"; 

        System.out.println("Spesies: " + ikan2.spesies);
        System.out.println("Ukuran : " + ikan2.ukuran + " cm");
        System.out.println("Umur   : " + ikan2.umur + " tahun");
        System.out.println("Habitat: " + ikan2.habitat);
        ikan2.berenang();
        ikan2.makan();
        ikan2.berkembangbiak();
    }
}
