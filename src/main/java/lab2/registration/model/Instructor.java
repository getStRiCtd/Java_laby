package lab2.registration.model;


import java.util.List;
public class Instructor extends Person {

    /**
     * Идентификаторы курсов, которые может вести преподаватель
     */
    private List<CourseInfo> canTeach;

    public List<CourseInfo> getCanTeach(){return canTeach;}
    public void setCanTeach(List<CourseInfo> canTeach){this.canTeach = canTeach;}

    
}
