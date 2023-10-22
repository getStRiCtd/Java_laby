package lab2.registration.reader;

import lab2.registration.model.Student;
import lab2.registration.model.CourseInstance;
import lab2.registration.model.CourseInfo;

import java.io.IOException;
import java.util.List;
import java.util.Arrays;
public class DataStorage {
    public List<Student> students_bachelor;
    public List<Student> students_master;
    public List<CourseInfo> courseInfos;
    public List<CourseInstance> courseInstances;

    public DataStorage(){
        StudentDataReader studentDataReader = new StudentDataReader();
        CourseDataReader courseDataReader = new CourseDataReader();
        try {
            this.students_bachelor = Arrays.asList(studentDataReader.readBachelorStudentData());
            this.students_master = Arrays.asList(studentDataReader.readMasterStudentData());
            this.courseInfos = Arrays.asList(courseDataReader.readCourseInfo());
            this.courseInstances = Arrays.asList(courseDataReader.readCourseInstance());

        }
        catch (IOException ie) {ie.printStackTrace();}

    }
}
