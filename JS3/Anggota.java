public class Anggota {
    private String ktp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String ktp, String nama, int limitPinjaman) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (nominal + jumlahPinjaman > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
            System.out.println("Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }

    public void angsur(int nominal) {
        int minimalAngsuran = (int) (jumlahPinjaman * 0.1);
        
        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= nominal;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
            System.out.println("Jumlah pinjaman saat ini: " + jumlahPinjaman);
        }
    }
}
//afifah14