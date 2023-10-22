package lab2.registration.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lab2.registration.model.CourseInfo;
import lab2.registration.model.CourseInstance;
import lab2.registration.model.Student;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CourseDataReader {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public Map<Integer, CourseInfo> readCourseInfo() throws IOException {
        CourseInfo[] students = objectMapper
                .readValue(new File("src/main/resources/courseInfos.json"), CourseInfo[].class);
        Map<Integer, CourseInfo> courseInfoMap = new HashMap<Integer, CourseInfo>();
        for (CourseInfo cs : students) {
            courseInfoMap.put(cs.getId(), cs);
        }
        return courseInfoMap;
    }
    public Map<Integer, CourseInstance> readCourseInstance() throws IOException {
        CourseInstance[] students = objectMapper
                .readValue(new File("src/main/resources/courseInstances.json"), CourseInstance[].class);
        Map<Integer, CourseInstance> courseInfoMap = new HashMap<Integer, CourseInstance>();
        for (CourseInstance cs : students) {
            courseInfoMap.put(cs.getId(), cs);
        }
        return courseInfoMap;
    }

}