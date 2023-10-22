package lab2.registration.model;

/**
 * Класс для информации о преподавателе
 */
import java.util.List;
public class Instructor extends Person {

    /**
     * Идентификаторы курсов, которые может вести преподаватель
     */
    private List<CourseInfo> canTeach;

    public List<CourseInfo> getCanTeach(){return canTeach;};
    public void setCanTeach(List<CourseInfo> canTeach){this.canTeach = canTeach;};

    
}
