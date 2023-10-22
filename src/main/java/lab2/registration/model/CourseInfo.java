package lab2.registration.model;
import java.util.List;
/**
 * Класс для базовой информации о курсе
 */
public class CourseInfo {

    /**
     * идентификатор курса
     */
    private int id;
    private String name;

    /**
     * краткое описание курса
     */
    private String description;

    /**
     * Список идентификаторов курсов, которые нужно обязательно пройти до начала данного курса
     */
    private List<Integer> prerequisites;

    /**
     * список категорий студентов, которые могут посещать курс
     */
    private List<StudentCategory> studentCategories;

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public List<Integer> getPrerequisites(){
        return prerequisites;
    }
    public void setPrerequisites(List<Integer> prerequisites){
        this.prerequisites = prerequisites;
    }

    public List<StudentCategory> getStudentCategories(){
        return studentCategories;
    }
    public void setStudentCategories(List<StudentCategory> studentCategories){
        this.studentCategories = studentCategories;
    }

}
