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
public class Person {
    private final String name;
    private final String phone;
    private final String email;
    public final Account account = new Account();

    /**
     *
     * @param name
     * @param email
     * @param phone
     */
    public Person(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
