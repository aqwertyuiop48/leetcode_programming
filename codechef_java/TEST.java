import java.util.*;
import java.lang.*;
import java.io.*;

class TEST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        while(true){
            int num=sc.nextInt();
            if(0<=num && num<=99){
            if(num==42)
                break;
            else System.out.println(num);
            
        }
        else System.out.println("Enter only 2 digit's numbers");
        }
	}
}