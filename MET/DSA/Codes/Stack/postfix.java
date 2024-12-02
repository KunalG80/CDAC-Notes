import java.util.Scanner;

public class postfix {

    static int precedence(char ch)
        {   
            if(ch == '+' && ch =='-')
                return 1;
            else if(ch == '/' && ch == '*')
                return 2;
            else if(ch == '^')
                return 3;
            else
                
            return 0;
        }
        
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            Stack_Class stack = new Stack_Class();
            
    
            System.out.println("Enter the String");
            String s = scanner.nextLine();
            String word=" ";
            stack.create_stack(s.length());
    
            for (int i=0; i<s.length(); i++)
            {
                char ch = s.charAt(i);
    
                if( ch == '(')
                {
                    stack.push(ch);
                }
                else if(ch!='+'|| ch!='-' || ch!='/' || ch!='*' || ch!='^')
                {
                    word += ch;
                }
                else if(ch ==')')
                {
                    while(!stack.is_empty()&& stack.peek()=='(')
                    {
                        stack.pop();
                    }
                    stack.pop();
                }
                else if(ch=='+'|| ch=='-' || ch=='/' || ch=='*' || ch=='^')
                {
                    int curr = precedence(ch);
                    int old = precedence((char)stack.peek());
                    if(!stack.is_empty()&& curr > old)
                    {
                        stack.push(ch);
                    }
                    else{
                        while(curr>old || stack.is_empty())
                        {
                            stack.pop();
                        }
                    }
                        while(!stack.is_empty())
                        {
                            stack.pop();
                        }

                    word += ch;
            }
        }
        System.out.println(word);

    }
}