/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stra;

/**
 *
 * @author User
 */
public class contact{
    String name,organization,college;
    contact(){}
    public void setdetails(String name,String organization,String college){
        this.organization=organization;
        this.college=college;
        this.name=name;
    }
    public String returnorg(){return organization;}
    public String returnname(){return name;}
    public String getcollege(){return college;}
}