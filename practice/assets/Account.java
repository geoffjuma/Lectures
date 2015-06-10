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
public class Account{
    
    
    private int balance;
    public Account(){
        this.balance = 0;
    }
    
    public void setBalance(int amount){
        this.balance = amount;
    }
    
    /**
     *
     * @return the Account balance
     */
    public int getBalance(){
        return this.balance;
    }
}
