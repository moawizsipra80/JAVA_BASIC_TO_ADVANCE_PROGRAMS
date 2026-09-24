import java.util.Scanner;
public class Hello{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter you name");
        String name=input.nextLine(); 
        
        System.out.print("enter your roll number");
        String rollno=input.nextLine();

        System.out.print("enter your  semester");
        String semester=input.nextLine();

        System.out.println("your name , roll  number and semester is  " + name+rollno+semester);
    }
}