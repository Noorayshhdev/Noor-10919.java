public class StrongNumber {
    public static void main(String[] args) {

        int n = 145;
        int temp = n;
        int sum = 0;

        for (; temp != 0; temp /= 10) {

            int d = temp % 10;

            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }

            sum += fact;
        }

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}





public class StrongNumber {
    public static void main(String[] args) {

        int n = 145;
        int temp = n;
        int sum = 0;

        for (; temp != 0; temp /= 10) {

            int d = temp % 10;

            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }

            sum += fact;
        }

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}






public class StrongNumber {
    public static void main(String[] args) {

        int n = 145;
        int temp = n;
        int sum = 0;

        for (; temp != 0; temp /= 10) {

            int d = temp % 10;

            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact *= i;
            }

            sum += fact;
        }

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}