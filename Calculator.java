import java.util.Scanner;
public class Calculator{
    
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one number");
         int number= input.nextInt();

        System.out.print("Enter second number ");
        int number2=input.nextInt();
        int division=0;
        int sum=number+number2;
        int product=number*number2;
        
        if(number2!=0)
            {
        division=number/number2;
        }
        else{
            System.out.print("denominator can not be zero");
        }
        int difference;
    if(number2>number){
         difference=number2-number;
    }
    else{
        difference=number-number2;
    }
    if(number%2==0 )
        {
        System.out.println("even number" +number );
    }
    else{
        System.out.print("it is odd" +number);

    }
    if(number2%2==0){
        System.out.println("it is even"+number2);
    }
    else{
        division=0;
        System.out.println("it is odd" +number2);
    }
    System.out.println("sum is " +sum);
    System.out.println("product  is " +product);
    System.out.println("division is " +division);
    System.out.println("defference " +difference);



    }
}