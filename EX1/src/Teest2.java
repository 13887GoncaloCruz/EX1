import java.util.Scanner ;
public class Teest2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = ler.nextInt();
        do {
            if (x % 2 == 0) {
                x = x / 2;
            } if(x % 2 != 0) {
                x = 3 * x + 1;

                System.out.println(x);
                x++;
            }
        }while(x != 1);
    }
}