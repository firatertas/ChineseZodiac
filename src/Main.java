import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, result;
        String st=null;
        System.out.print("Doğum yılınızı Giriniz : ");
        year = sc.nextInt();
        result = year%12;
        switch (result){
            case 0:
                st ="Maymun";
                break;
            case 1:
                st="Horoz";
               break;
            case 2:
                st="Köpek";
               break;
            case 3:
                st="Domuz";
               break;
            case 4:
                st="Fare";
               break;
            case 5:
                st="Öküz";
               break;
            case 6:
                st="Kaplan";
               break;
            case 7:
                st="Tavşan";
               break;
            case 8:
                st="Ejderha";
               break;
            case 9:
                st="Yılan";
               break;
            case 10:
                st="At";
               break;
            case 11:
                st="Koyun";
               break;
            default:
                System.out.println("Yanlış bir veri girdiniz");
        }
        System.out.println("Çin Zodyağı Burcunuz : "+st);
    }
}