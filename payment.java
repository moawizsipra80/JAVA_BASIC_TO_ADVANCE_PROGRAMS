package payments;
abstract class payment
{
protected double amount;
payment(double amount){
	this.amount=amount;
}
abstract public void process_payment();
}
