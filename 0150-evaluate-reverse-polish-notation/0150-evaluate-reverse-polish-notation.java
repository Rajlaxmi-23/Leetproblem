class Solution {

      public int Operate(int a, int b , String token){
        if(token.equals("+")){
            return a + b ;
        }
        if(token.equals("-")){

            return a - b ;
        }
         if(token.equals("*")){
      
            return a*b;
        }
        if(token.equals("/")){
            return a / b ;
        }
        return -1;
      }

    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        for( String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*")|| token.equals("/")){
                //top 2 elements ko pop karke operate karlo
                //then oush in stack the result

                int b = st.peek();
                st.pop();

                int a = st.peek();
                st.pop();

                int res = Operate(a, b , token);

                st.push(res);



            }
            else{
            st.push(Integer.parseInt(token));
            }

        }
        return st.peek();
    }
}