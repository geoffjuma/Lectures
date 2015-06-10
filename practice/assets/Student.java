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
public class Student extends Person {

    public double grade;
    public String admNumber;
    public Student(String name, String email, String phone, String admNumber) {
        super(name, email, phone);
        this.grade = 0;
        this.admNumber = admNumber;
    }

        
}
