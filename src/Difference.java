public class Difference {
    
    public static void main(String[]args) {
        int sestetiKvadrati = 0;
        int kvadriranSestevek = 0;
        int sestevek = 0;
        for(int i=1;i<=100;i++) {
            sestevek += i;
            sestetiKvadrati += i*i;
        }
        kvadriranSestevek = sestevek*sestevek;
        
        System.out.print(kvadriranSestevek-sestetiKvadrati);
    }
    
}
