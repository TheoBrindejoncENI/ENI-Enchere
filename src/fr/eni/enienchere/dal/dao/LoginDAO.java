package fr.eni.enienchere.dal.dao;

import fr.eni.enienchere.beans.LoginBean;
import fr.eni.enienchere.dal.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public static String loginCheck(LoginBean loginBean){
        String query="select * from login where email=? and password=?";

        try{
            Connection con= ConnectionProvider.getConnection();
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,loginBean.getEmail());
            ps.setString(2,loginBean.getPassword());

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return "true";
            }
            else{
                return "false";
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return "error";
    }
}
