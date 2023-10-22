package lab2.registration.reader;

import lab2.registration.model.Student;
import lab2.registration.model.CourseInstance;
import lab2.registration.model.CourseInfo;

import java.io.IOException;
import java.util.Map;

public class DataStorage {
    public Map<Integer, Student> students_bachelor;
    public Map<Integer, Student> students_master;
    public Map<Integer, CourseInfo> courseInfos;
    public Map<Integer, CourseInstance> courseInstances;

    public DataStorage(){
        StudentDataReader studentDataReader = new StudentDataReader();
        CourseDataReader courseDataReader = new CourseDataReader();
        try {
            this.students_bachelor = studentDataReader.readBachelorStudentData();
            this.students_master = studentDataReader.readMasterStudentData();
            this.courseInfos = courseDataReader.readCourseInfo();
            this.courseInstances = courseDataReader.readCourseInstance();

        }
        catch (IOException ie) {ie.printStackTrace();}

    }
}
