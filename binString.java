public class binString {
    public static void BinDtringMaker(int n ,int lastBin , String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        BinDtringMaker(n-1, 0, str+"0");
        if (lastBin==0){
            BinDtringMaker(n-1, 1, str+"1");
        } 
    }
    public static void main(String[] args) {
        BinDtringMaker(4, 0, "");
    }
    
}
