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
public class BlackBun implements Bun{
    @Override
    public String getBun() {
        return "Black Bun";
    }
    public BlackBun() {
        System.out.println("Black Bun");
    }
}
