public class Solution {
    public int solve(String A) {
        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c=='('){
                chars.push(c);
            }else if (c==')'){
                if (chars.isEmpty()){
                    return 0;
                }
                chars.pop();
            }
        }
        if (chars.isEmpty())return 1;
        else return 0;
    }
}
