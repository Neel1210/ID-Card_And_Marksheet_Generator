/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pojo.LoginPojo;
import pojo.StudentPojo;

/**
 *
 * @author Neel_Esh
 */
public class UsersDao {
    public static boolean validateUser(LoginPojo login)throws SQLException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from users where mobile=? and password=? and type=?");
        ps.setString(1,login.getMobileNo());
        ps.setString(2,login.getPassword());
        ps.setString(3,login.getType());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            login.setName(rs.getString(2));
            login.setType(rs.getString(4));
            return true;
        }
        return false;
    }
    
    public static boolean addNewUser(LoginPojo login)throws SQLException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from users where mobile=?");
        ps.setString(1,login.getMobileNo());
        ResultSet rs=ps.executeQuery();
        if(!rs.next())
        {   
            ps=DBConnection.getConnection().prepareStatement("insert into users values(?,?,?,?)");
            ps.setString(1,login.getMobileNo());
            ps.setString(2,login.getName());
            ps.setString(3,login.getPassword());
            ps.setString(4,login.getType());
            return 1==ps.executeUpdate(); 
        }
        return false;
    }
    
     public static LoginPojo getUserByMobileNo(String mobNo)throws SQLException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from users where mobile=? and type='Facuilty'");
        ps.setString(1,mobNo);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {   
            LoginPojo lp=new LoginPojo();
            lp.setMobileNo(rs.getString(1));
            lp.setName(rs.getString(2));
            return lp;
        }
        return null;
    }
     
    public static boolean removeUser(String mobNo)throws SQLException
    {
        Statement st=DBConnection.getConnection().createStatement();
        return 1==st.executeUpdate("delete from users where mobile='"+mobNo+"'");
    }
    
    public static List <LoginPojo> getAllFacuilty()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from users where type='Facuilty'");
        List<LoginPojo> allFacuiltyList=new ArrayList<>();
        while(rs.next())
        {
            LoginPojo lp=new LoginPojo();
            lp.setMobileNo(rs.getString(1));
            lp.setName(rs.getString(2));
            allFacuiltyList.add(lp);
        }
        return allFacuiltyList;  
    }
}
