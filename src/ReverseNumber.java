import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseNumber
{
    public static void main(String[] args) {
        ReverseNumber revNumber = new ReverseNumber();
        System.out.println(revNumber.reverseNumberOfUser(1234567));
    }
    private int reverseNumberOfUser(int number)
    {
        char[] charsOfNumberArray=String.valueOf(number).toCharArray();
        Deque stackOfChars = new ArrayDeque();
        for (char charOfNumber: charsOfNumberArray) {
            stackOfChars.push(charOfNumber);
        }
        String reverseNumber="";
        while(!stackOfChars.isEmpty())
        {
           reverseNumber +=stackOfChars.pop();
        }
        return Integer.valueOf(reverseNumber).intValue();
    }
}
