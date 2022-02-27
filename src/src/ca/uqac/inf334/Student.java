package ca.uqac.inf334;

import java.util.ArrayList;

public class Student {
    String name;
    String firstName;
    String birthday;
    ArrayList<String> courses = new ArrayList<String>();
    String permanentCode;
    ArrayList<String> sport = new ArrayList<String>();
    String field;

    /**
     * Constructor
     */
    public void Student(String name,String firstName,String birthday){
        this.name=name;
        this.firstName=firstName;
        this.birthday=birthday;
    }

    /**
     *Get permanent code
     */
    public String PermanentCode() {
        int n = (int)(Math.random() * 10);
        String str_n = String.valueOf(n);
        int n1 = (int)(Math.random() * 10);
        String str_n1 = String.valueOf(n1);
        this.permanentCode= name.substring(0, 2)+firstName.substring(0,0)+birthday.substring(0,1)+birthday.substring(3,4)+birthday.substring(6,7)+str_n.substring(0)+str_n1.substring(0);
        return permanentCode;
    }

    /**
     * Get field of the student
     */
    public String GetField(){
        return field;
    }

    /**
     * Get sport list of the student
     */
    public void GetSportList(){
        for(String i: sport){
            System.out.println(i);
        }
    }

    /**
     * Get courses list of the student
     */
    public void GetCoursesList(){
        for(String i: courses){
            System.out.println(i);
        }

    }
}
///gfdgfd