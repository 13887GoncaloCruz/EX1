public class Ex2 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 1000) {
            if (x % 2 == 0) {
                x = x + x;
            }

            x++;

        }
        System.out.println(x);

    }
}