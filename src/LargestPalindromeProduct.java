public class LargestPalindromeProduct {
    
    static int largestPalindromeProduct() {
        int largest = 0;
        int number = 0;
        for(int i=1;i<1000;i++) {
            for(int j=1;j<1000;j++) {
                number = i*j;
                if(isPalindrome(Integer.toString(number)) && number > largest) {
                    largest = number;
                }
            }             
        }
        return largest;
    }
    
    static boolean isPalindrome(String number) {
        String reversed = "";
        for(int i=number.length()-1;i>=0;i--) {
            reversed += number.charAt(i);
        }
        return reversed.equals(number);
    } 
            
       
    
    public static void main(String[]args) {
        System.out.println(largestPalindromeProduct());
    }
    
}
