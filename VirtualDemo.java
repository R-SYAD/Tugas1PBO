class Pegawai {
    private String name;
    private String address;
    private int number;
    public Pegawai(String name, String address, int number){
        System.out.println("Meyusun Pegawai");
        this.name = name;
        this.address = address;
        this.number = number;

    }
    public void mailCheck(){
        System.out.println("Memerikasa surat untuk "+ this.name+" "+ address);

    }
    public String toString(){
        return name + " " + address + " " + number;
    }
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
}

class Gaji extends Pegawai{
    private double salary;
    public Gaji(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Memeriksa gaji dalam surat");
        System.out.println("Surat tertuju untuk "+ getName()+ " dengan gaji "+salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary=newSalary;
        }
    }
    public double computePay(){
        System.out.println("Menghitung pembayaran gaji untuk "+getName());
        return salary/52;
    }
}

public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu", "Kubar", 3, 5000.00); 
        Pegawai e = new Gaji("ini Nama", "Samarinda", 2, 2500.00); // upcasting
        //pada baris ke 60 merupakan bentuk dari polymorphism yaitu upcasting yang mengkonversi objek dari tipe child class ke tipe parent class
        /*Alasan kenapa "menyusun pegawai" ditampilkan 2 kali hal ini disebabkan oleh
        kode super yang terdapat pada konstruktor gaji mengakses parent class yang menampilkan menyusun pegawai*/
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan referensi Pegawai --");
        e.mailCheck();
    }
}