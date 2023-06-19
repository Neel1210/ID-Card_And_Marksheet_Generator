/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbConnection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pojo.LoginPojo;

/**
 *
 * @author Neel_Esh
 */
public class CitiesDao {
    public static List<String> getAllCitiesByState(String state)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from stateandcities where state='"+state+"' order by city");
        List<String> allCitiesList=new ArrayList<>();
        while(rs.next())
        {
           allCitiesList.add(rs.getString(2));
        }
        return allCitiesList;  
    }
}
