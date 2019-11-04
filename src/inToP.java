import java.util.Stack;
import java.util.regex.*;

public class inToP {
	
	static boolean isNumber(String temp) {
		Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(temp);
        if (isNum.matches())
        	return true;
        return false;
	}
	
	
	static int Prec(String ch) 
    { 
        switch (ch) { 
        case "+": 
        case "-": 
            return 1; 
       
        case "*": 
        case "/": 
            return 2; 

        } 
        return -1; 
    } 
       
	static String infixToPostfix(String exp) { 
	    	
	        // initializing empty String for result 
		String result = new String(""); 
	          
	        // initializing empty stack 
		Stack<String> stack = new Stack<>(); 
		String [] temp = exp.split("\\s");
	        
		for (int i = 0; i<temp.length; i++) {
			if (isNumber(temp[i])) {
				result += temp[i];
				result += " ";
	        }
			else         // an operator is encountered 
    		{ 
    			while (!stack.isEmpty() && Prec(stack.peek()) >= Prec(temp[i]) ){ 
    				/**System.out.println(stack.peek());
    				System.out.println(Prec(stack.peek()));
    				System.out.println(temp[i]);
    				System.out.println(Prec(temp[i]));**/
    				result += stack.pop(); 
    				result += " ";
    			} 
    			stack.push(temp[i]); 
    		} 
	     }

		while (!stack.isEmpty()){ 
	            
	            result += stack.pop(); 
	            result += " ";
	         } 
		return result;
	    }
	        	
        		        	
	            // Driver method 
	 public static void main(String[] args)  { 
	       String exp = "7 + 2 * 8"; 
	       System.out.println(infixToPostfix(exp)); 
	       String exp2 = "14 - 6 + 7 * 4 - 10";
	       System.out.println(infixToPostfix(exp2)); 
	       
	       String exp3 = "3 + 5 * 2 - 8 / 4";
	       System.out.println(infixToPostfix(exp3)); 
	 } 
}
