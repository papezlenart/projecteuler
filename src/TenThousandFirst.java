public class TenThousandFirst {
    
    public static void main(String[]args) {
        for(int i=1;i<20;i++) {
            if(isPrime(i)) System.out.print(i);
        }
    }
    
    static boolean isPrime(int n) {
        for(int i=1;i<n;i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
