/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Minsu <jminsu084@gmail.com>
 */
public class MozzarellaCheese implements Cheese{
    @Override
    public String getCheese() {
        return "Mozzarella Cheese";
    }
    public MozzarellaCheese() {
        System.out.println("Mozzarella Cheese");
    }
}