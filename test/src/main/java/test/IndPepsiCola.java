/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Minsu <jminsu084@gmail.com>
 */
public class IndPepsiCola implements IndCola{
    @Override
    public String getIndCola() {
        return "Ind Pepsi Cola";
    }
    public IndPepsiCola() {
        System.out.println("Ind Pepsi Cola");
    }
}
