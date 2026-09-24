import java.util.*;
public class Intgr {
    
    void add_array_elements(int[]new_arr)
    {
        int sum=0;
    for(int i=0;i<new_arr.length;i++){
      sum=new_arr[i]+sum;
     }
         System.out.println("your sum of all numbers is " + sum);


    }
    

    public static void main(String[]args){

    Scanner input=new Scanner(System.in);
    System.out.print("how many numbers you want to add");
    int size=input.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
      arr[i]=input.nextInt();
     }
    Intgr i=new Intgr();
    i.add_array_elements(arr);
}
}


