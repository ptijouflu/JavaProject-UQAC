package ca.uqac.inf334;

import java.util.ArrayList;

public class Field {
    String name;
    ArrayList<String> courses = new ArrayList<String>();

    /**
     * Constructor
     */
    public void Field(String name){
        this.name = name;
    }

    /**
     * Get courses of the field
     */
    public void GetCoursesList(){
        /**
         * A revoir
         */
        for (String i: courses){
            System.out.println(i);
        }
    }
}