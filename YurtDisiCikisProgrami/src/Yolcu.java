import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırdığınız harç bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasak durumunuz var mı  (evet yada hayır) : ");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")){
            this.siyasiYasak = true;
        }else {
            this.siyasiYasak = false;
        }

        System.out.print("vizeniz var mı ? :");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")){
            this.vizeDurumu=true;
        }else {
            this.vizeDurumu=false;
        }

    }

    @Override
    public boolean YurtDısiHarciKontrol() {

        if (this.harc < 15){
            System.out.println("lütfen harcı tam yatırınız.");
            return false;
        }
        else {
            System.out.println("harç işleminiz tamamdır.");
            return true;
        }
    }

    @Override
    public boolean SiyasiYasak() {
        if(this.siyasiYasak == true ) {
            System.out.println("siyasi yasağınız bulunuyor yurt dışına çıkamazsınız");
            return false;
        }
        System.out.println("siyasi yasağınız bulunmuyor");
        return true;

    }

    @Override
    public boolean VizeDurumuKontrol() {
        if (this.vizeDurumu == true){
            System.out.println("vize işlemleri tamam.");
            return true;
        }
        else {
            System.out.println("vizeniz yoktur.");
            return false;

        }

    }
}
