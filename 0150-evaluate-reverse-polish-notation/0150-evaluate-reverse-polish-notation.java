class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int top = 0,result=0;
        for(String token:tokens){
            if(token.equals("+")||token.equals("/")|token.equals("*")||token.equals("-"))
            {
                int a1 = stack.pop();
                int a2 = stack.pop();
            switch(token){
                case "+":stack.push(a1+a2);
                break;
                case "-":stack.push(a2-a1);
                break;
                case "*":stack.push(a2*a1);
                break;
                case "/":
                if(a1!=0){
                stack.push(a2/a1);
                }
                break;
            }
            }else{
                stack.push(Integer.parseInt(token));
            }  
        }
        return stack.pop();
    }
}