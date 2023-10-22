package lab2.registration.reader;

import lab2.registration.model.Student;
import lab2.registration.model.CourseInstance;
import lab2.registration.model.CourseInfo;

import java.io.IOException;
import java.util.Map;

public class DataStorage {
    public Map<Integer, Student> students;
    public Map<Integer, CourseInfo> courseInfos;
    public Map<Integer, CourseInstance> courseInstances;

    public DataStorage(){
        StudentDataReader studentDataReader = new StudentDataReader();
        CourseDataReader courseDataReader = new CourseDataReader();
        try {
            //Students info
            Map<Integer, Student> students_bachelor = studentDataReader.readBachelorStudentData();
            Map<Integer, Student> students_master = studentDataReader.readMasterStudentData();
            this.students.putAll(students_bachelor);
            this.students.putAll(students_master);

            // CoursersInfo
            this.courseInfos = courseDataReader.readCourseInfo();
            this.courseInstances = courseDataReader.readCourseInstance();

        }
        catch (IOException ie) {ie.printStackTrace();}

    }
}
