package lab2.registration.service;

import lab2.registration.exceptions.NoCourse;
import lab2.registration.exceptions.NoInstructor;
import lab2.registration.exceptions.NoStudent;
import lab2.registration.model.Instructor;
import lab2.registration.model.ActionStatus;
import lab2.registration.model.Student;

import java.util.List;

/**
 * Интерфейс сервиса для преподавателя
 */
public interface CourseInstructorService {
    
    /**
     * @param courseId идентификатор курса
     * @return список студентов, зарегистрированных на данный курс
     */
    List<Student> findStudentsByCourseId(int courseId) throws NoCourse, NoStudent;

    /**
     * @param instructorId идентификатор преподавателя
     * @return список студентов, посещающих один из курсов данного преподавателя
     */
    List<Student> findStudentsByInstructorId(int instructorId) throws NoInstructor, NoCourse;

    /**
     * @param instructorId идентификатор преподавателя
     * @param courseId идентификатор курса
     * @return список преподавателей, которые могут прочитать данный курс вместо данного преподавателя
     */
    List<Instructor> findReplacement(int instructorId, int courseId) throws NoInstructor, NoCourse;

}
