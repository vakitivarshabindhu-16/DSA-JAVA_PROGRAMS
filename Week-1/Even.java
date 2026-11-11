import java.util.Scanner;
class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pos = 1;

        while(n > 0) {
            int r = n % 10;

            if(pos % 2 == 0) {
                sum = sum + r;
            }

            n = n / 10;
            pos++;
        }

        System.out.println("Sum of Even Places = " + sum);
    }
}