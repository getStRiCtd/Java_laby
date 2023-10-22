package lab2.registration.model;
import java.util.ArrayList;
import java.util.List;





/**
 * Класс для информации о студенте
 */
public class Student extends Person {

    /**
     * список идентификаторов курсов (CourseInstance.id), пройденных студентом
     */
    private List<Integer> completedCourses;
    private List<Integer> subscribedCourses;
    private StudentCategory category;

    public List<Integer> getCompletedCourses() {return completedCourses;}
    public void setCompletedCourses(List<Integer> completedCourses) {this.completedCourses = completedCourses;}

    public List<Integer>getSubscribedCourses() {return subscribedCourses;}
    public void setSubscribedCourses(List<Integer> subscribedCourses){
        if (this.subscribedCourses == null){
            this.subscribedCourses= subscribedCourses;
        }
        else {
            this.subscribedCourses.addAll(subscribedCourses);
        }
    }

    public void setSubscribedCourses(int new_course){
        if (this.subscribedCourses == null){
            List<Integer> subscribedCourses = new ArrayList<>();
            subscribedCourses.add(new_course);
            this.subscribedCourses = subscribedCourses;
            }
        else {
            this.subscribedCourses.add(new_course);
        }
    }

    public StudentCategory getCategory() {
        return category;
    }

    public void setCategory(StudentCategory category) {
        this.category = category;
    }
}
