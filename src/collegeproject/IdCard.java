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
import javax.imageio.ImageIO;
import pojo.StudentPojo;

/**
 *
 * @author Neel_Esh
 */
public class IdCard {
    
    public static boolean createIdCard(StudentPojo student,String path)throws IOException
    {
        //System.out.println(System.getProperty("student.dir"));
        BufferedImage image = ImageIO.read(new File(System.getProperty("user.dir")+"/src/collegeproject/Id_Card_Front.png"));
        
        //get the Graphics object
        Graphics g = image.getGraphics();
        
        
        g.drawImage(ImageIO.read(new File(path)),350, 140, 208,208, Color.yellow,null);
        
        //set Roll No
        g.setFont(g.getFont().deriveFont(25f));
        g.setColor(Color.white);
        g.drawString(student.getRollNo(), 35,782);
        
        //set Batch 
        g.setFont(g.getFont().deriveFont(20f));
        g.drawString(student.getBatch(), 150,835);
        
         //set General Details 
        g.setFont(g.getFont().deriveFont(25f));
        g.setColor(Color.BLACK);
        g.drawString(student.getName(), 17,309);
        g.drawString(student.getPhone()+"", 17,382);
        
        g.drawString(student.getCourse(),17, 458);
        g.drawString(student.getBranch(),182, 458);
        
        String[] add=student.getAddress().split(",");
        g.drawString(add[0]+" , "+add[1], 17,545);
        g.drawString(add[2]+" , "+add[3], 17,578);
        g.dispose();
        
        new File(System.getProperty("user.dir")+"/src/Users_Data/"+student.getRollNo()).mkdirs();
        //write the image
        ImageIO.write(image,"png", new File(System.getProperty("user.dir")+"/src/Users_Data/"+student.getRollNo()+"/"+"ID_"+student.getRollNo()+".png"));
        
        return true;
    }
}
