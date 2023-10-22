package lab2.registration.service_implements;

import lab2.registration.exceptions.NoCourse;
import lab2.registration.exceptions.NoInstructor;
import lab2.registration.exceptions.NoStudent;
import lab2.registration.model.CourseInfo;
import lab2.registration.model.Instructor;
import lab2.registration.model.Student;
import lab2.registration.service.CourseInstructorService;

import lab2.registration.reader.DataStorage;

import java.util.ArrayList;
import java.util.List;
public class CourseInstructorPersonalAccount implements CourseInstructorService {
    private final DataStorage dataStorage;
    public CourseInstructorPersonalAccount(DataStorage dataStorage){
        this.dataStorage = dataStorage;
    }
    public List<Student> findStudentsByCourseId(int courseId) throws NoCourse, NoStudent {
        if (!dataStorage.courseInfos.containsKey(courseId))
            throw new NoCourse("Указан неверный id курса");
        if (dataStorage.courseInfos.get(courseId).getStudents() == null)
            throw new NoStudent("На курс не записано ни одного студента");
        return dataStorage.courseInfos.get(courseId).getStudents();
    };

    public List<Student> findStudentsByInstructorId(int instructorId) throws NoInstructor, NoCourse {
        if(!dataStorage.instructors.containsKey(instructorId))
            throw new NoInstructor("Неверный id преподавателя");
        if (dataStorage.instructors.get(instructorId).getCanTeach() == null)
            throw new NoCourse("Преподаватель не ведет ни одного курса");

        List<Student> studentsByInstructorsId = new ArrayList<>();
        for (CourseInfo course : dataStorage.instructors.get(instructorId).getCanTeach()){
            try {
                studentsByInstructorsId.addAll(this.findStudentsByCourseId(course.getId()));
            } catch (NoStudent ignored) {};
        }
        return studentsByInstructorsId;
    }

    public List<Instructor> findReplacement(int instructorId, int courseId) throws NoInstructor, NoCourse{
        if(!dataStorage.instructors.containsKey(instructorId))
            throw new NoInstructor("Неверный id преподавателя");
        if (dataStorage.instructors.get(instructorId).getCanTeach() == null)
            throw new NoCourse("Преподаватель не ведет ни одного курса");
        if (!dataStorage.courseInfos.containsKey(courseId))
            throw new NoCourse("Нет такого курса");

        List<Instructor> replacements = new ArrayList<>();
        for (Instructor instructor : dataStorage.instructors.values()) {
            if (instructor.getId() == instructorId)
                continue;
            if (instructor.getCanTeach().contains(dataStorage.courseInfos.get(courseId)))
                replacements.add(instructor);
        }
        return replacements;
    }
}
