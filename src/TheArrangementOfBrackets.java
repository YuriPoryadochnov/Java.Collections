import java.util.ArrayDeque;
import java.util.Deque;

public class TheArrangementOfBrackets
{
    public static void main(String[] args) {
            TheArrangementOfBrackets bracketsLine =new TheArrangementOfBrackets();
        System.out.println(bracketsLine.theArrangementOfBrackets("((())()()}}"));
    }
    private boolean theArrangementOfBrackets(String brackets)
    {
        char[] charsOfBrackets=brackets.trim().toCharArray();
        Deque stackOfChars = new ArrayDeque();
        char temporaryChar ='0';
        for (char charOfBracket: charsOfBrackets) {
            if (charOfBracket == '[' || charOfBracket == '(' || charOfBracket =='{')
            {
                stackOfChars.push(charOfBracket);
            }
            else if(charOfBracket == ']')
            {
                if(stackOfChars.isEmpty()) return false;
                temporaryChar = (char)stackOfChars.pop();
                if(temporaryChar == '[')
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }

            else if(charOfBracket == ')')
            {
                if(stackOfChars.isEmpty()) return false;
                temporaryChar = (char)stackOfChars.pop();
                if(temporaryChar == '(')
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }

            else if(charOfBracket == '}')
            {
                if(stackOfChars.isEmpty()) return false;
                temporaryChar = (char)stackOfChars.pop();
                if(temporaryChar == '{')
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
         return stackOfChars.isEmpty();

    }
}
