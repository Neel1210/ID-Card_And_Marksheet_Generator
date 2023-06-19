/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeproject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import pojo.*;

/**
 *
 * @author Neel_Esh
 */
public class ResultMaker 
{

    public static boolean createMarkSheet(ResultPojo result,StudentPojo student)throws IOException
    {
         
        BufferedImage image = ImageIO.read(new File(System.getProperty("user.dir")+"/src/collegeproject/Marksheet_Format_Img.png"));
        
        //get the Graphics object
        Graphics g = image.getGraphics();
        g.drawImage(ImageIO.read(new File(System.getProperty("user.dir")+"/src/temp/"+student.getRollNo()+".png")), 2135,604,264,303,Color.yellow,null);
        
        //set font
        g.setFont(g.getFont().deriveFont(40f));
        g.setColor(Color.BLACK);
        
        //Adding General User Details
        g.drawString(student.getRollNo()+"",390,740);
        g.drawString(student.getName(),362,826);
        g.drawString(student.getBatch(),1050,826);
        g.drawString(student.getCourse()+"( "+student.getBranch()+" )", 390,915);
        g.drawString(student.getSem(),1445,915);
        
        g.drawString(new SimpleDateFormat("dd-MMM-yyyy").format(new Date()), 1775,915);
        
        List<SubjectPojo> list=result.getSubjectList();
        SubjectPojo sub=list.get(0);
        
        //Adding Subject
        g.drawString(sub.getSubject(),200,1160);
        g.drawString(sub.getGrade(),760,1160);
        g.drawString(sub.getSubCredit()+"",1310,1160);
        g.drawString(sub.getMarksObt()+"",1920,1160);
        
        sub=list.get(1);
        g.drawString(sub.getSubject(),200,1255);
        g.drawString(sub.getGrade(),760,1255);
        g.drawString(sub.getSubCredit()+"",1310,1255);
        g.drawString(sub.getMarksObt()+"",1920,1255);
        
        sub=list.get(2);
        g.drawString(sub.getSubject(),200,1345);
        g.drawString(sub.getGrade(),760,1345);
        g.drawString(sub.getSubCredit()+"",1310,1345);
        g.drawString(sub.getMarksObt()+"",1920,1345);
  
        sub=list.get(3);
        g.drawString(sub.getSubject(),200,1433);
        g.drawString(sub.getGrade(),760,1433);
        g.drawString(sub.getSubCredit()+"",1310,1433);
        g.drawString(sub.getMarksObt()+"",1920,1433);
        
        sub=list.get(4);
        g.drawString(sub.getSubject(),200,1520);
        g.drawString(sub.getGrade(),760,1520);
        g.drawString(sub.getSubCredit()+"",1310,1520);
        g.drawString(sub.getMarksObt()+"",1920,1520);
       
        //Last Line
        g.drawString(result.getTotalMarks()+"/500",525,1632);
        g.drawString(String.format("%.2f",result.getSgpa()),915,1632);
        g.drawString(result.getDivision(),1515,1632);
        g.drawString(result.getResult(),2060,1632);
        

        g.dispose();
        
        new File(System.getProperty("user.dir")+"/src/Users_Data/"+student.getRollNo()).mkdirs();
        new File(System.getProperty("user.dir")+"/src/temp/"+student.getRollNo()+".png").delete();
        //write the image
        ImageIO.write(image,"png", new File(System.getProperty("user.dir")+"/src/Users_Data/"+student.getRollNo()+"/"+"Result_"+student.getRollNo()+"_"+student.getSem()+"-Sem.png"));
        
        return true;
    }
}
