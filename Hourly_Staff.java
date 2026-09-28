class Hourly_Staff extends Staff{
String firstname;
String lastname;
int employee_id;
double wages;
double hours;
    Hourly_Staff(String firstname,String lastname,int employee_id,int wages,double hours){
        super(firstname,lastname,employee_id);
    this.wages=wages;
    this.hours=hours;
    }    
   public double  get_wages(){
    return this.wages;
   }
   public double setwages(int wages){
    return  this.wages=wages;
   }
   public double  get_hours(){
  return this.hours;
   }
   public double set_hours(double hours){
    return this.hours=hours;
   }
   @Override 
    public double  payment_method() {
        if (hours <= 40) {
            return wages * hours;
        } else {
            return (40 * wages) + ((hours - 40) * wages * 1.5);
        }
    }

    @Override
    public String toString() {
        return "Hourly Employee: " +(40 * wages) + ((hours - 40) * wages * 1.5);
    }

  
  
  
}
