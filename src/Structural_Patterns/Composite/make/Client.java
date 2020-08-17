package Structural_Patterns.Composite.make;

import Structural_Patterns.Composite.beans.CompositeAccount;
import Structural_Patterns.Composite.beans.DepositAccount;
import Structural_Patterns.Composite.beans.SavingAccount;

public class Client {

    public static void main(String[] args){
        CompositeAccount ca = new CompositeAccount();

        ca.addAcount(new DepositAccount("DA01", 100));
        ca.addAcount(new DepositAccount("DA02", 180));
        ca.addAcount(new SavingAccount("SA03", 200));

        float totalBalance = ca.getBalance();
        System.out.println("Total Balance : " + totalBalance);

    }
}
