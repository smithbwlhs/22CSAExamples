
/**
 * 
 *
 * @author Mr. Smith
 * @purpose demo increment/decrement and prefix/postfix operators
 * @date 9-14-22
 */
public class IncDecDemo
{
    public static void main(String[] args){
        int counter = 0;
        //ways to increment
        counter = counter + 1;
        counter += 1;
        counter = counter + 3;
        counter += 3;
        System.out.println("Counter value is "+counter);
        
        int newCounter = 10;
        newCounter++; //now have a value of 11
        newCounter--; //back to 10
        
        //other operators, works for +, -, /, %, *
        newCounter *= 3;
        System.out.println("Counter is "+newCounter);
        newCounter *= newCounter;
        System.out.println("Counter is "+newCounter);
        
        //some weird code about prefix/postfix
        
        int a = 4;
        int b = ++a; //this is called prefix
        System.out.println(a);
        System.out.println(b);
        //the value of a was incremented by one then assigned to b
        System.out.println();
        int c = 4;
        int d = c++; //this is called a postfix
        System.out.println(c);
        System.out.println(d);
        //the value of c is assigned to d, then c is incremented by 1
        
        
    }
}



