/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice.assets;

/**
 *
 * @author 81900
 */
public class ATM {
    
    Person person;
    int accAmount;
    public ATM(Person person){
        this.person = person;
        this.accAmount = person.account.getBalance();
    }
    public void deposit(int amount){
        this.accAmount += amount;
        this.person.account.setBalance(this.accAmount);
    }
    
    public void withdraw(int amount){
        this.accAmount -= amount;
        this.person.account.setBalance(this.accAmount);
    }
    
    public int checkBalance(){
        return this.person.account.getBalance();
    }
}
