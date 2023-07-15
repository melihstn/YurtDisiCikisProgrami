
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha gökçen havaalanına hoş geldiniz..");

        String sartlar = "Yurt dışı çıkış kuralları.. \n"
                         +"siyasi yasağınız bulunmamalıdır. \n"
                         +"yurt dışı harcını eksiksiz ödemeniz gerekmektedir. \n"
                         +"gideceğiniz ülkeye vizeniz bulunmalıdır";

        String message = "Yurtdışı şartlarından hepsini yerine getirmeniz gerekiyor.";

        while (true){
            System.out.println("*******************************");
            System.out.println(sartlar);
            System.out.println("*******************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor..");

            Thread.sleep(3000);

            if(yolcu.YurtDısiHarciKontrol() == false){

                System.out.println(message);
                continue;
            }
            System.out.println("siyasi yasak durumu kontrol ediliyor..");

            Thread.sleep(3000);

            if (yolcu.SiyasiYasak() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("vize durumu kontrol ediliyor..");

            Thread.sleep(3000);

            if (yolcu.VizeDurumuKontrol() == false){
                System.out.println(message);
            }
            System.out.println("yurt dışına çıkmanıza engel bulunmamaktadır.");
            break;





        }

    }
}