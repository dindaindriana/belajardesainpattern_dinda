
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Dinda Indriana";
        mhs1.nim = "2022573010088";
        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println("");

        Dosen dsn1 = new Dosen();
        dsn1.nama = "Sri Mutia";
        dsn1.nidn = "234567890";
        System.out.println(dsn1.nama);
        System.out.println(dsn1.nidn);
        System.out.println("");

        Pinguin pgn1 = new Pinguin();
        pgn1.nama = "Pinguin";
        pgn1.warna = "Hitam";
        pgn1.display();
        pgn1.swim();
        System.out.println("");

        Elang elg1 = new Elang();
        elg1.nama = "Elang";
        elg1.warna = "Coklat";
        elg1.display();
        elg1.fly();
        System.out.println("");

        Sepeda sepeda1 = new Sepeda();
        sepeda1.bergerak();
        sepeda1.berhenti();
        System.out.println("");

        Motor motor1 = new Motor();
        motor1.bergerak();
        motor1.berhenti();
        System.out.println("");

        Mobil mobil1 = new Mobil();
        mobil1.bergerak();
        mobil1.berhenti();
    }
}