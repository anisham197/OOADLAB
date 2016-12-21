/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stra;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class strategy1 implements strategies{
    @Override
    public void summarize(ArrayList<contact> c) {
        ArrayList<String> organizations=new ArrayList();
        for(contact con:c){
            String org=con.returnorg();
            if(!organizations.contains(org))
            organizations.add(org);
        }
        for(String org:organizations){
            System.out.println("Organization:" +org);
            for(contact con:c){
                String o=con.returnorg();
                if(o.equals(org)){
                    System.out.println("\n "+ con.returnname());
                }
            }
        }
    }
}
