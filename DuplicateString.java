public class DuplicateString {
    public static void duplicateString(String str, int ind ,StringBuilder newstr , boolean map[]){
     if(ind == str.length()){
        System.out.println(newstr);
        return;
     }
     char currentchar=str.charAt(ind);
     if(map[currentchar-'a']==true){
        duplicateString(str, ind +1 , newstr, map);
     }
     else{
        map[currentchar-'a']=true;
        duplicateString(str, ind+1, newstr.append(currentchar), map);
     }
    }
    public static void main(String[] args) {
        String str ="shubbham";
        duplicateString(str, 0, new StringBuilder(), new boolean[26]);
    }
    
}
