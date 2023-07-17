// WAP to find the factorial of the number entered by the user?

import java.util.*;
class prg15
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n, p=1;
        System.out.println("Enter the number: ");
        
        n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
            p=p*i; // find the factotial
        }
        System.out.println("Factorial of the given number is: "+ p);
    }
}