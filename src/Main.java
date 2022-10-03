import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = Math.min(A,B);
        if (Math.max(A,B)-Math.min(A,B)<=1 || 0==A && 0==B){
            System.out.println("Arasynda bashka sandar jok ");
        }
        else{
            while(C<Math.max(A,B)){
                if((C+1)%2==1){
                    System.out.println(C+1);
                }
                C++;
            }
        }

        int D = sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count<=D){
            sum = sum+count;
            count+=1;
        }
        System.out.println(sum);

        System.out.println(D*(D+1)/2d);

//        double san1 = sc.nextDouble();
//        double san2 = sc.nextDouble();
//        double san3 = sc.nextDouble();
//        if (san1 == san2 && san2 == san3 ){
//            System.out.println("3 san barabar");
//
//        }else if(san1==san2){
//            System.out.println(Math.max(san2,san3));
//        }else if(san2==san3){
//            System.out.println(Math.max(san3,san1));
//        }else if(san3==san1){
//            System.out.println(Math.max(san1,san2));
//        }
//        else{
//            System.out.println(Math.max(Math.max(san1,san2),san3));
//        }
//        String chon = "alkogol satylat";
//        String kichine = "alkogol satylbayt";
//        int jash = sc.nextInt();
//        System.out.println(18<=jash ? chon:kichine);
//        String val = sc.nextLine();
//        switch (val){
//            case "USD":
//                System.out.println(val+" "+84.8);
//                break;
//            case "RUB":
//                System.out.println(val+" "+1.14);
//                break;
//            case "EUR":
//                System.out.println(val+" "+95.9);
//                break;
//            case "KZT":
//                System.out.println(val+" "+0.19);
//                break;
//            default:
//                System.out.println("bul valyuta azr jok");
//        }
//        int san = sc.nextInt();
//        System.out.println(san%2==0 ? "jup san":"tak san");

//        Random rd = new Random();
//
//        int sn = rd.nextInt((155-5)+1)+5;
//        System.out.println(sn);
//        System.out.println(25<=sn && sn<=100 ? "25 menen 100 ortosunda":"25 menen 100 ortosunda emes");
//        int kun = sc.nextInt();
//        switch (kun){
//            case 1:
//            case 3:
//            case 5:
//                System.out.println("Java ,tehnikalyk sabak");
//                break;
//            case 2:
//                System.out.println("English + Java praktika");
//                break;
//            case 4:
//                System.out.println("SoftSkills + Java praktika");
//                break;
//            case 6:
//                System.out.println("Java praktika");
//                break;
//            case 7:
//                System.out.println("Vyhodnoi");
//                break;
//            default:
//                System.out.println("Jumanyn kundoru emes");
//        }
//        if (kun == 1 || kun ==3 || kun == 5  ){
//            System.out.println("Java ,tehnikalyk sabak");
//        }else if(kun==2){
//            System.out.println("English + Java praktika");
//        }else if(kun==4){
//            System.out.println("SoftSkills + Java praktika");
//        }else if(kun==6) {
//            System.out.println("Java praktika");
//        }else if(kun==7){
//            System.out.println("Vyhodnoi");
//        }else {
//            System.out.println("Jumanyn kundoru emes");
//        }

    }
}