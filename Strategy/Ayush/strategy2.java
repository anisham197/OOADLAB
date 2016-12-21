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
public class strategy2 implements strategies{
    @Override
   public void summarize(ArrayList<contact>c){
       System.out.println("Name:"+ "\t"+"organication"+"\t"+"college"+"\n");
       for(contact c1:c){
           System.out.println(c1.returnname()+"\t"+c1.returnorg()+"\t"+c1.getcollege());
       }
   }
    
}
