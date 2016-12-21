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

public class setstrategy{
    strategies strategy;
    public setstrategy(strategies strategy){
        this.strategy=strategy;
    }
    public void execue(ArrayList<contact> c){
        strategy.summarize(c);
    }
}