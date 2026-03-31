public class XpN {
    public static int OptimizedSolution(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=OptimizedSolution(x, n/2);
        int halfpowerSqr=halfpower*halfpower;
        if(n % 2 !=0){
            halfpowerSqr=x*halfpowerSqr;
        }
        return halfpowerSqr;
    }
    public static void main(String[] args) {
        System.out.println(OptimizedSolution(2, 5));
    }
    
}
