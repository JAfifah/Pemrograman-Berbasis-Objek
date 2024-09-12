public class Fish {
    public String spesies;
    public double ukuran; 
    public int umur;  
    public String habitat;

    public void berenang() {
        System.out.println(spesies + " sedang berenang di habitat " + habitat);
    }

    public void makan() {
        System.out.println(spesies + " sedang makan.");
    }

    public boolean berkembangbiak() {
        if (umur >= 2) {
            System.out.println(spesies + " bisa berkembang biak.");
            return true;
        } else {
            System.out.println(spesies + " belum bisa berkembang biak.");
            return false;
        }
    }
}
