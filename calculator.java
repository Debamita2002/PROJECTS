import java.util.*;
class calculator
{
    public static void main(String args[])
    
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operotors");
        char c;
        c=in.next().charAt(0);
        System.out.println("Enter numbers");
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        switch(c)
        {
            case '+':
            System.out.println(a+b);
            break;

        case'-':
        System.out.println(a-b);
        break;

        case'*':
        System.out.println(a*b);
        break;

        case'/':
     System.out.println(a*b);
        break;
        default:
        System.out.println("invalid");
  }

}

}

    

