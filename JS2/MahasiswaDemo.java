public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatra Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Devita Hwat";
        m2.alamat = "Tarik, Darjo";
        m2.kelas = "2F";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Farhan Pentol";
        m3.alamat = "Sukun, Malang";
        m3.kelas = "2F";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();

    }
}