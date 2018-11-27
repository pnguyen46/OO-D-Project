package poe.pickles;

import java.math.BigDecimal;

//Concrete cash payment instance
public class PaymentCash extends Payment {
    public PaymentCash(BigDecimal amount){
        super(amount);
    }

    @Override
    public String Describe(){
        return super.Describe() + " cash";
    }
}
