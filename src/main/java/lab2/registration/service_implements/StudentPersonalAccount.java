package lab2.registration.service_implements;

import lab2.registration.exceptions.NoStudent;
import lab2.registration.model.*;
import lab2.registration.reader.DataStorage;
import lab2.registration.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentPersonalAccount implements StudentService{
    private final DataStorage dataStorage;
    public StudentPersonalAccount(DataStorage dataStorage){
        this.dataStorage = dataStorage;
    }
    public ActionStatus subscribe(int studentId, int courseId){
        Student student = dataStorage.students.get(studentId);
        CourseInfo courseInfo = dataStorage.courseInfos.get(courseId);

        if (student == null || courseInfo == null){
            System.out.println("Проверьте id студента и курса. Данные не найденны");
            return ActionStatus.NOK;
        }

        if (student.getCompletedCourses().containsAll(courseInfo.getPrerequisites())
                && courseInfo.getStudentCategories().contains(student.getCategory())) {
            student.setSubscribedCourses(courseId);
            System.out.println("Успешная запись на курс!");
            return ActionStatus.OK;
        }
        else {
            System.out.println("Студент не удовлетворяет требованиям курса");
            return ActionStatus.NOK;
        }
    }

    public ActionStatus unsubscribe(int studentId, int courseId){

        if (this.dataStorage.students.get(studentId) == null ||this.dataStorage.courseInfos.get(courseId) == null){
            System.out.println("Проверьте id студента и курса. Данные не найденны");
            return ActionStatus.NOK;
        }

        boolean isSubscribed = this.dataStorage.students.get(studentId).getSubscribedCourses().contains(courseId);
        if (isSubscribed){
            // TODO::Доделать отписку от курса
            return ActionStatus.OK;
        }
        else {
            System.out.println("Вы и так не записанны на курс");
            return ActionStatus.NOK;
        }
    }


    public List<CourseInstance> findAllSubscriptionsByStudentId(int studentId) throws NoStudent {
        if (dataStorage.students.get(studentId) == null)
            throw new NoStudent("Проверьте id студента. Данные не найденны");
        else {
            List<CourseInstance> coursesSubscribedByStudent = new ArrayList<>();
            for (int i : dataStorage.students.get(studentId).getSubscribedCourses())
                coursesSubscribedByStudent.add(dataStorage.courseInstances.get(i));
            return coursesSubscribedByStudent;
        }
    }
}



