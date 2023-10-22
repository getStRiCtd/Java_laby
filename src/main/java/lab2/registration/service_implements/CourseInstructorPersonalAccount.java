package lab2.registration.service_implements;

import lab2.registration.model.Instructor;
import lab2.registration.model.Student;
import lab2.registration.service.CourseInstructorService;

import lab2.registration.reader.InstructorsDataReader;
import lab2.registration.reader.StudentDataReader;
public class CourseInstructorPersonalAccount implements CourseInstructorService {
    public Student[] findStudentsByCourseId(long courseId) {
        Student[] studentsByCourseId;
        return studentsByCourseId;
    };

    public Student[] findStudentsByInstructorId(long instructorId){
        Student[] studentsByInstructorId;
        return studentsByInstructorId;
    }

    public Instructor[] findReplacement(long instructorId, long courseId) {
        Instructor[] replacement;
        return replacement;
    }
}
