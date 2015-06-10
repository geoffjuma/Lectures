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
public class Professor extends Person {
    public int salary;
    public Professor(String name, String email, String phone, int salary) {
        super(name, email, phone);
        this.salary = salary;
    }
    
}
