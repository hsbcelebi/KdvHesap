import java.util.Scanner;

public class KDV {


    public static void main(String[] args) {

        float para;
        float kdvli;
        float kdv_tutar;

        float kdv_oran= (float) 0.18;

        Scanner scan = new Scanner(System.in);
        System.out.print("KDV hesaplamak istediğiniz miktarı giriniz : " );

        para= scan.nextFloat();

        System.out.println("KDV siz fiyat : " +para);

        kdvli = (para*kdv_oran)+para;
        System.out.println("KDV li fiyat : " +kdvli);

        kdv_tutar= kdvli-para;

        System.out.println("KDV Tutarı : " +kdv_tutar);

    }






}
