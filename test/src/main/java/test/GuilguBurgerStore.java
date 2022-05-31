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
public class GuilguBurgerStore extends BurgerStore{
    
    @Override
    public Menu createBurger(String item) {
        Menu burger = null;
        BurgerStoreIngredientFactory factory = new GuilguBurgerIngredientFactory();
        
        if(item.equals("치즈 버거")) {
            burger = new CheeseBurger(factory);
            burger.setDescription("Guilgu Style Cheese Burger");
        } else if(item.equals("비프 버거")) {
            burger = new BeefBurger(factory);
            burger.setDescription("Guilgu Style Beef Burger");
        } else if(item.equals("치킨 버거")) {
            burger = new ChickenBurger(factory);
            burger.setDescription("Guilgu Style Chiken Burger");
        } else if(item.equals("매운 치킨 버거")) {
            burger = new SpicyChickenBurger(factory);
            burger.setDescription("Guilgu Style Spicy Chiken Burger");
        }
        
        return burger;
    }
}
