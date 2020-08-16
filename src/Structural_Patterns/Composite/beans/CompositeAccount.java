package Structural_Patterns.Composite.beans;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount {
    private float totalBalance;
    private List<Account> accountList = new ArrayList<Account>();

    public float getTotalBalance(){
        totalBalance = 0;
        for(Account f : accountList){
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public void addAcount(Account acc){
        accountList.add(acc);
    }

    public void removeAccount(Account acc){
        accountList.remove(acc);
    }


}
