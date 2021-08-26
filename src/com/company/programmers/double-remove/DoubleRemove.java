import java.util.Stack;

public class DoubleRemove
{
    public int solution(String s){

        if(s.length() < 2 || s.length()%2 != 0){
            return 0;
        }
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.size() == 0){
                stack.push(s.charAt(i));
            }else if(stack.peek() == s.charAt(i)){
                    stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}
