public class ComissionStaff extends Staff{
double total_revenue;
double comission_rate;
    ComissionStaff(String firstname,String lastname,int employee_id,double total_revenue,double comission_rate){
    super(firstname,lastname,employee_id);
     this.comission_rate=comission_rate;
     this.total_revenue=total_revenue;
}    
public double  get_total_revenue(double total_revenue){
    return this.total_revenue=total_revenue;
}
public double comission_rate(double comission_rate){
    return this.comission_rate=comission_rate;
}
@Override
public double payment_method(){
    return comission_rate*total_revenue;
}
@Override 
public String toString(){
    return "the payment is "+comission_rate*total_revenue;
}
}
