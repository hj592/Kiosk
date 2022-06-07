/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author heejin
 */
public class MenuDAO {
    private Connection conn = null;
    private PreparedStatement pstmt= null;
    private ResultSet rs= null;
    public MenuDAO(){
        try{
            String dbURL = "jdbc:mysql://localhost:3306/kiosk?serverTimezone=UTC";
            String dbID = "root";
            String dbPW = "1234";             
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL,dbID,dbPW);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int menuCost(String name) throws SQLException{
        String SQL = "SELECT price FROM menu WHERE name = ?";
         try{
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();
            if(rs.next()){
                return rs.getInt("price");
            }
        //return -1;//아이디 없음
        }catch(Exception e){
            e.printStackTrace();
        }
         return -2;//데이터베이스오류
    }
    
    public void menuDaoClose(){
        try {
            if(rs!=null) rs.close();
            if(pstmt!= null) pstmt.close();
            if (conn!=null) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
