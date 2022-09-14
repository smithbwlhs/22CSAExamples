import java.util.Scanner; 
//from the package java.util you are importing the Scanner class
/**
 * Write a description of class ScannerDemo here.
 *
 * @author Mr. Smith
 * @purpose to demonstrate how the Scanner class in Java works
 * @date 9/14/22
 */
public class ScannerDemo
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initializing a new Scanner
        System.out.print("Enter your favorite integer: ");
        int favNum = input.nextInt();
        input.nextLine(); //clear the buffer
        System.out.print("Enter your favorite word: ");
        String favWord = input.nextLine();
    }
}






