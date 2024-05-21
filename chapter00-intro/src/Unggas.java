public class Unggas {
    public String nama;
    public String warna;

    public void display(){
        System.out.println(this.nama);
        System.out.println(this.warna);
    }
}

class Pinguin extends Unggas{

    public void swim()
    {
        System.out.println("berenang");
    }
}

class Elang extends Unggas{

    public void fly(){

        System.out.println("terbang");
    }
}
