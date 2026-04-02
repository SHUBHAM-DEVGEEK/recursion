public class FriendsPairing {
    public static int friendPairing(int n){
        //base case
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=friendPairing(n-1);
        int fnm2=friendPairing(n-2);
        int pairways=(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
    
}
