/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Personnel;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {
    String role;


    public EmployeeProfile(Person p, String role) {
        super(p); 
        this.role = role;
    }
    @Override
    public String getRole(){
        return  this.role;
    }

}