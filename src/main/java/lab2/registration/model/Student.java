package lab2.registration.model;
import java.util.ArrayList;




/**
 * Класс для информации о студенте
 */
public class Student extends Person {

    /**
     * список идентификаторов курсов (CourseInstance.id), пройденных студентом
     */
    private ArrayList<Integer> completedCourses;
    private long[] subscribedCourses;
    private StudentCategory category;

    public ArrayList<Integer>  getCompletedCourses() {return completedCourses;};
    public void setCompletedCourses(ArrayList<Integer> completedCourses) {this.completedCourses = completedCourses;};

    public long[] getSubscribedCourses() {return subscribedCourses;};
    public void setSubscribedCourses(long[] subscribedCourses){this.subscribedCourses = subscribedCourses;};

    public StudentCategory getCategory() {
        return category;
    }

    public void setCategory(StudentCategory category) {
        this.category = category;
    }
}
