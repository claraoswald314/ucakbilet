import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double yas, indirim,yolculuktipi, km;
        double tutar =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("yolcunun yaşını yazınız : ");
        yas= scan.nextDouble();
        if(0<yas){
        System.out.println("yolculuk tipini seçiniz : 1)tek yön   2)gidiş-dönüş");
        yolculuktipi=scan.nextDouble();
          if(yolculuktipi==1|| yolculuktipi==2){
            System.out.println("mesafeyi km cinsinden yazınız : ");
            km= scan.nextDouble();
            if(0<km){
                if(yolculuktipi==1){
                    if(yas<12){
                        tutar=(km*0.1)*0.5;
                    }else if(12<=yas&& yas<=24){
                        tutar=(km*0.1)*0.9;
                    }else if(65<yas){
                        tutar=(km*0.1)*0.7;
                    }else{
                        tutar=(km*0.1);
                    }
                }else if (yolculuktipi == 2){
                    if(yas<12){
                        tutar=(km*0.1)*0.8;
                    }else if(12<=yas&& yas<=24){
                        tutar=(((km*0.1)*0.9)*2)*0.8;
                    }else if(65<yas){
                        tutar=(((km*0.1)*0.7)*2)*0.8;
                    }else{
                        tutar=((km*0.1)*2)*0.8;
                    }
                }else{
                    System.out.println("hatalı veri girdiniz!");
                }

            }else{
                System.out.println("hatalı veri girdiniz!");

            }
        }else {
              System.out.println("hatalı veri girdiniz!");
          }
        }else{
            System.out.println("hatalı veri girdiniz!");
        }
        System.out.println("uçak bileti ücreti : " + tutar);

    }




}
