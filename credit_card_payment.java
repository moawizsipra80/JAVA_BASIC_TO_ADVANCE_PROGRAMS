package payments;
class credit_card_payment extends payment implements Refundable{
credit_card_payment(double amount){
super(amount);
}
@Override
public void process_payment(){
System.out.println("Processing credit card payment of Rs"+amount);
}
@Override
public void refund(double refundable){
	System.out.println("refunding  Rs"+refundable +"to credit card ");
}
}
