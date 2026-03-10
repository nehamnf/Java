package com.neha.relationships;

class Course{
    private String name;
    public Course(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }
}

class Professor{
    private String name;
    public Professor(String name){
        this.name= name;
    }

    public void teaches(Course course){
        System.out.println("Professor teaches "+course.getName());
    }
}
public class AssociationExample {
    public static void main(String[] args) {
        Course course= new Course("English");
        Professor professor = new Professor("Neha");
        professor.teaches(course);
    }
}
