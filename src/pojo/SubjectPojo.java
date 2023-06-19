/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Neel_Esh
 */
public class SubjectPojo {
        
        private String subject;
        private String grade;
        private int subCredit;
        private int marksObt;
        
        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public int getSubCredit() {
            return subCredit;
        }

        public void setSubCredit(int subCredit) {
            this.subCredit = subCredit;
        }

        public int getMarksObt() {
            return marksObt;
        }

        public void setMarksObt(int marksObt) {
            this.marksObt = marksObt;
        }
}
