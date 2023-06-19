/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbConnection.DBConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pojo.StudentPojo;


public class StudentsDao {
    public static boolean addNewStudents(StudentPojo student)throws SQLException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from students where rollNo=?");
        ps.setString(1,student.getRollNo());
        ResultSet rs=ps.executeQuery();
        if(!rs.next())
        {   
            ps=DBConnection.getConnection().prepareStatement("insert into students values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,student.getRollNo());
            ps.setString(2,student.getName());
            ps.setString(3,student.getEmail());
            ps.setString(4,student.getPhone());
            ps.setString(5,student.getAddress());
            ps.setString(6,student.getCourse());
            ps.setString(7,student.getBranch());
            ps.setString(8,student.getSem());
            ps.setString(9,student.getBatch());
            ps.setString(10,student.getGender());
            ps.setBlob(11,student.getFile());
            return 1==ps.executeUpdate(); 
        }
        return false;
    }
    
    public static StudentPojo getStudentByRollNo(String rollNo)throws SQLException,FileNotFoundException,IOException
    {
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("select * from students where rollNo=?");
        ps.setString(1,rollNo);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {  
            StudentPojo students=new StudentPojo();
            students.setRollNo(rs.getString(1));
            students.setName(rs.getString(2));
            students.setEmail(rs.getString(3));
            students.setPhone(rs.getString(4));
            students.setAddress(rs.getString(5));
            students.setCourse(rs.getString(6));
            students.setBranch(rs.getString(7));
            students.setSem(rs.getString(8));
            students.setBatch(rs.getString(9));
            students.setGender(rs.getString(10));
            
            //Image Writing Code
            Blob b=rs.getBlob(11);
            byte barr[]=b.getBytes(1,(int)b.length());
            FileOutputStream fout=new FileOutputStream(System.getProperty("user.dir")+"/src/temp/"+rs.getString(1)+".png");  
            fout.write(barr);  
            
            return students;
        }
        return null;
    }
    
    public static ArrayList<StudentPojo> getAllStudents()throws SQLException
    {
        Statement st=DBConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("Select * from students");
        
        ArrayList<StudentPojo> list=new ArrayList<>();
        StudentPojo students;
        while(rs.next())
        {
            students=new StudentPojo();
            students.setRollNo(rs.getString(1));
            students.setName(rs.getString(2));
            students.setEmail(rs.getString(3));
            students.setPhone(rs.getString(4));
            students.setAddress(rs.getString(5));
            students.setCourse(rs.getString(6));
            students.setBranch(rs.getString(7));
            students.setSem(rs.getString(8));
            students.setBatch(rs.getString(9));
            students.setGender(rs.getString(10));
            list.add(students);
        }
        return list;
    }
}
