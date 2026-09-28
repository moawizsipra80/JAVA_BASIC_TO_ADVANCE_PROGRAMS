import java.util.*;
class Staff{
    private String firstname;
    private String lastname;
    private int staff_id;
    public Staff(String firstname,String lastname,int staff_id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.staff_id=staff_id;
    }
  public String  getfirstname(){
    return firstname;

  }
  public String getlastname(){
    return lastname;
    
  }
  public int  getid(){
    return staff_id;
    
  }
  public String setfirstname(String firstname){
    return this.firstname=firstname;
  }
  public String setlastname(String lastname){
    return this.lastname=lastname;
  }
  public int setid(int staff_id){
    return this.staff_id=staff_id;
  }
 @Override 
  public String toString() {
        return "Employee: " + firstname + " " + lastname +
               "staff Id " + staff_id;
    }
public double  payment_method(){
    System.out.println("this is payment method function");
    return 0.0;
}
}