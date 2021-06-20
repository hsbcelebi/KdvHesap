import java.util.Scanner;

public class KDV {


    public static void main(String[] args) {

        float para;
        float kdvli;
        float kdv_tutar;

        float kdv_oran= (float) 0.18;
        float kdv_oran2= (float) 0.08;

        Scanner scan = new Scanner(System.in);
        System.out.print("KDV hesaplamak istediğiniz miktarı giriniz : " );

        para= scan.nextFloat();

        if(para>0 && para < 1000){


            System.out.println("KDV siz fiyat : " +para);

            kdvli = (para*kdv_oran)+para;
            System.out.println("KDV li fiyat : " +kdvli);

            kdv_tutar= kdvli-para;

            System.out.println("KDV Tutarı : " +kdv_tutar);
        }else {
            System.out.println("KDV siz fiyat : " + para);

            kdvli = (para * kdv_oran2) + para;
            System.out.println("KDV li fiyat : " + kdvli);

            kdv_tutar = kdvli - para;

            System.out.println("KDV Tutarı : " + kdv_tutar);
        }
    }






}
