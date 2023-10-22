package lab2.registration.reader;

import lab2.registration.model.Student;
import lab2.registration.model.CourseInstance;
import lab2.registration.model.CourseInfo;

import java.io.IOException;

public class DataStorage {
    public Student[] students_bachelor;
    public Student[] students_master;
    public CourseInfo[] courseInfos;
    public CourseInstance[] courseInstances;

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
