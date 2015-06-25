public class LargestPrimeFactor {
    
    static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[]args) {
        int maxPrime = 0;
        int n = 9999999;
        for(int i=1;i<n;i++) {
            if(n%i==0 && isPrime(i) && i > maxPrime) {
                maxPrime = i;              
            }
        }
        System.out.println(maxPrime);
    }
    
}
