class Salaried_staff extends Staff {
private double week_sal;
Salaried_staff(String firstname,String lastname,int employee_id,double week_sal){
super(firstname,lastname,employee_id);
this.week_sal=week_sal;    
}

  public double get_week_sal(){
    return week_sal;
  }

    public double set_week_sal(double week_sal){
    return this.week_sal=week_sal;
  }
  @Override 
  public String toString(){
    return " weekly salary is " +week_sal;
  }

}
