package payments;
import payments.credit_card_payment;
import payments.cash;
class Driver {
 public static void main(String[] args) {
 credit_card_payment card=new credit_card_payment(2000.0);
 card.process_payment();
 card.refund(2000.0);
 cash cash_new=new cash(3000.0);
 cash.process_payment(); 

 }
}