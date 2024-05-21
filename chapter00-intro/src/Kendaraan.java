public interface Kendaraan {
    public void bergerak();
    public void berhenti();
}

class Sepeda implements Kendaraan{
    @Override
    public void bergerak() {
        System.out.println("Dikayuh");
    }

    @Override
    public void berhenti() {
        System.out.println("Rem Tangan");
    }
}

class Motor implements Kendaraan{
    @Override
    public void bergerak() {
        System.out.println("Pakai mesin/Digas");
    }

    @Override
    public void berhenti() {
        System.out.println("Rem Tangan/Rem Kaki");
    }
}

class Mobil implements Kendaraan{
    @Override
    public void bergerak() {
        System.out.println("Pakai mesin/Gas kaki");
    }

    @Override
    public void berhenti() {
        System.out.println("Rem tangan/Rem kaki");
    }
}
