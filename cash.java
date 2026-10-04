package payments;
class cash extends payment{
cash(double amount){
super(amount);
}
@Override
public void process_payment(){
System.out.println("Processing cash payment Rs "+amount);
}
}