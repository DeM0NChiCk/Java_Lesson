package utils;

import interfaces.Accountable;
import model.Account;

public class Transaction <T extends Accountable<String, Integer>> {

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    public Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}
