public class Tiling {
    public static int tilling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1= tilling(n-1);
        int fnm2=tilling(n-2);
        int total = fnm1 +fnm2;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(tilling(4));
    }
    
}
