public class AutomorphicNumber {
    public static void main(String[] args) {

        int n = 25;
        long sq = (long)n * n;
        int temp = n;
        boolean match = true;

        for(; temp > 0; temp /= 10, sq /= 10) {
            if(temp % 10 != sq % 10) {
                match = false;
                break;
            }
        }

        if(match)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}








public class AutomorphicNumber {
    public static void main(String[] args) {

        int n = 25;
        long sq = (long)n * n;
        int temp = n;
        boolean match = true;

        for(; temp > 0; temp /= 10, sq /= 10) {
            if(temp % 10 != sq % 10) {
                match = false;
                break;
            }
        }

        if(match)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}










 public static void main(String[] args) {

        int n = 25;
        long sq = (long)n * n;
        int temp = n;
        boolean match = true;

        for(; temp > 0; temp /= 10, sq /= 10) {
            if(temp % 10 != sq % 10) {
                match = false;
                break;
            }
        }

        if(match)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}

