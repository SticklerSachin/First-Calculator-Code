import java.util.*;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value = ");
        int a = sc.nextInt();
        System.out.println("Enter Second Value = ");
        int b = sc.nextInt();
        System.out.println("What you want to do ?\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Remainder\n");
        int button = sc.nextInt();

        switch(button)
        {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4 :System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("Invalid Button");
        }
        
    }
}
