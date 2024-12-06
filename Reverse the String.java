public class Solution {
    public String solve(String A) {
        
        String[]splitA=A.trim().split("\\s+");
        A="";
        for (int i=splitA.length-1;i>-1;i--){
            A+=splitA[i];
            if (i>0)
            A+=" ";
        }
        return A; 
    }
}
