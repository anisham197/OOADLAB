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

import java.util.*;
import java.util.ArrayList;

public interface strategies{
    public void summarize(ArrayList<contact> c);
}
public class Stra{
    public static void main(String[] args){
        contact c1=new contact();
        c1.setdetails("ayush","msrit","msrit");
        contact c2=new contact();
        c2.setdetails("ravi","i2u2","rnsit");
        contact c3=new contact();
        c3.setdetails("ayush1","i2u2","rnsit");
        ArrayList<contact> c=new ArrayList<contact>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        setstrategy newstrategy2=new setstrategy(new strategy2());
        setstrategy newstrategy1=new setstrategy(new strategy1());
        newstrategy1.execue(c);
        System.out.println("\n using strategy 2");
          newstrategy2.execue(c);    
    }
}