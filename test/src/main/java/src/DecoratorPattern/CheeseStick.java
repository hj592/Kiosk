/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.DecoratorPattern;

import db.MenuDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JaeHyuk
 */
public class CheeseStick extends SideMenudecorator {
    MenuDAO menuDAO = new MenuDAO();
    int cost = 0;
    SideMenu sidemenu;
    public CheeseStick(SideMenu sidemenu) { this.sidemenu = sidemenu;}
    
    
    public String getDescription() {
        //return sidemenu.getDescription() + "+치즈스틱";
        return "치즈스틱";
    }
    
    public int cost() {
        try {
            cost = menuDAO.menuCost("cheeseStick");
        } catch (SQLException ex) {
            Logger.getLogger(SideMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return cost + sidemenu.cost();
        return cost;
    }
}
