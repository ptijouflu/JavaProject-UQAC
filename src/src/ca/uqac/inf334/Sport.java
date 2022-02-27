package ca.uqac.inf334;

import java.util.*;

public class Sport {
    String name;
    ArrayList<String> students = new ArrayList<String>();


    /**
     * Constructor
     */
    public void Sport(String name){
        this.name = name;

    }

    /**
     * Get sport list
     */
    public void SportList(){
        for (String i :students){
            System.out.println(students);
        }
    }

}
///