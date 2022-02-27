package ca.uqac.inf334;

public class Course {
    String name;
    String field;
    String professor;

    /**
     * Constructor
     */
    public void Course(String name, String field, String professor){
        this.name = name;
        this.field = field;
        this.professor = professor;
    }
}