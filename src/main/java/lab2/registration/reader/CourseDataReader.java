package lab2.registration.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lab2.registration.model.CourseInfo;
import lab2.registration.model.CourseInstance;


import java.io.File;
import java.io.IOException;

public class CourseDataReader {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public CourseInfo[] readCourseInfo() throws IOException {
        return objectMapper
                .readValue(new File("src/main/resources/courseInfos.json"), CourseInfo[].class);
    }
    public CourseInstance[] readCourseInstance() throws IOException {
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper
                .readValue(new File("src/main/resources/courseInstances.json"), CourseInstance[].class);
    }

}