public class Overload {
    // count occurrences of digit d in n
    void number(int n, int d) {
        int c = 0;
        while (n != 0) {
            int r = n % 10;
            if (r == d)
                c++;
            n = n / 10;
        }
        System.out.println("Number of occurrences of digit " + d + " in the number is " + c);
    }

    // sum of even digits in a
    void number(int a) {
        int sum = 0;
        while (a != 0) {
            int r = a % 10;
            if (r % 2 == 0) {
                sum += r;
            }
            a = a / 10;
        }
        System.out.println("Sum of even digits is " + sum);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.number(123456, 3);  // example usage
        obj.number(123456);     // example for even digit sum
    }
}
