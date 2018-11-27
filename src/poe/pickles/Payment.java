package poe.pickles;

import java.math.BigDecimal;

//Abstract base class that holds amount.
public abstract class Payment {
    private BigDecimal _amount;

    protected Payment(BigDecimal amount){
        _amount = amount;
    }

    public BigDecimal getAmount(){
        return _amount;
    }

    public String Describe(){
        return "Collected $" + _amount;
    }

    @Override
    public String toString() {
        return Describe();
    }
}
