import java.util.Scanner;
public class Day32 {
    public static void main(String [] args) {
    Scanner hai = new Scanner(System.in);
        
        int alas = hai.nextInt();
        int tinggi = hai.nextInt();
        
        int Luas = 1 * alas * tinggi / 2;
        
        System.out.printf("%d != : 999 %b %n",Luas,Luas != 999);
        System.out.printf("!(%d > 1 ) %b | %d >= 40 && %d == 50 : %b %n",Luas,!( Luas > 1 ),Luas,Luas, Luas >= 40 && Luas == 50);
        
    }
}
