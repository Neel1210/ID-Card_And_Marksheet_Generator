/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.List;
import pojo.SubjectPojo;

/**
 *
 * @author Neel_Esh
 */
public class ResultPojo 
{
    private int totalMarks=0;
    private float sgpa=0.0f;
    private String division;  
    private List<SubjectPojo> list=new ArrayList<>();
    int arrIndex=0;
    
    public float getSgpa() 
    {
        return totalMarks/5f;
    }
    
    public String getDivision() 
    {
        if(totalMarks<501 && totalMarks>374) //500 to 375
            return "First Division";
        else if(totalMarks<375 && totalMarks>249) // 374 to 250
            return "Second Division";
        else if(totalMarks<250 && totalMarks>124) //249 to 125 
            return "Third Division";   
        return "Forth Division";
    }
    
    public String getResult() 
    {
        if(totalMarks>250)
            return "Pass";
        else
            return "Fail";
    }
    
    public int getTotalMarks() 
    {
        return totalMarks;
    }
    
    public void addSubjectInList(SubjectPojo sub)
    {
        totalMarks=totalMarks+sub.getMarksObt();
        list.add(sub);
    }
    
    public List<SubjectPojo> getSubjectList()
    {
        return list;
    }
    
    
}
