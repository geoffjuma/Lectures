/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import practice.assets.ATM;
import practice.assets.Student;

/**
 *
 * @author 81900
 */

public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Student john = new Student("John Kariuki", "john@mail.com", "077005554", "0001");
        ATM atm = new ATM(john);
        atm.deposit(10000);
        atm.withdraw(7502);
        System.out.println(atm.checkBalance());
    }
    
}
