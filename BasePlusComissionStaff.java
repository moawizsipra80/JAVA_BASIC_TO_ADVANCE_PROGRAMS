class BasePlusComissionStaff  extends ComissionStaff{
   private double base_salary;
BasePlusComissionStaff(String firstname,String lastname,int employee_id,double total_revenue,double comission_rate,double base_salary)
{
    super(firstname,lastname, total_revenue,comission_rate);
    this.base_salary=base_salary;

}
public double get_base_salary(){
    return this.base_salary;
}
public double set_base_salary(double base_salary)
{
return this.base_salary=base_salary;
}

 @Override
    public double payment_method() {
        return (super.total_revenue * super.comission_rate) + base_salary;
    }


    @Override
    public String toString() {
        return "Base Plus Commission Employee: " +(super.total_revenue * super.comission_rate) + base_salary;
    }

}
