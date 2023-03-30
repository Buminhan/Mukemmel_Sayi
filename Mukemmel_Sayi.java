import java.util.Scanner;
public class Mukemmel_Sayi {
    public static void main(String[] args) {
        int n, ms=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        n = inp.nextInt();
        for(int i = 1;i<n;i++){
            if(n%i==0){
                ms +=i;
            }
        }
        if(ms>1 && ms==n){
            System.out.println(n+" mükemmel sayıdır.");
        }
        else{
            System.out.println(n+" mükemmel sayı değildir.");
        }
    }
}
