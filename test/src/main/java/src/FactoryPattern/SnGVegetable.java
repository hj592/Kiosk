/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.FactoryPattern;

/**
 *
 * @author Minsu <jminsu084@gmail.com>
 */
public class SnGVegetable implements Vegetable{
    @Override
    public String getVegetable() {
        return "양배추";
    }
    public SnGVegetable() {
        System.out.println("SnG Vegetable");
    }
}