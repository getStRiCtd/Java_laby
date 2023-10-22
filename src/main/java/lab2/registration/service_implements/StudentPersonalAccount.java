package lab2.registration.service_implements;

import lab2.registration.model.ActionStatus;
import lab2.registration.model.CourseInstance;
import lab2.registration.service.StudentService;


public class StudentPersonalAccount implements StudentService{
    public ActionStatus subscribe(long studentId, long courseId){
        return ActionStatus.OK;
    };

    public ActionStatus unsubscribe(long studentId, long courseId){
        return ActionStatus.OK;
    };

    public CourseInstance[] findAllSubscriptionsByStudentId(long studentId){
        CourseInstance[] subscriptionsByStudentId;
        return  subscriptionsByStudentId;
    };
}
