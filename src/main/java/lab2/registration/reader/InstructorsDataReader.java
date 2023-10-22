package lab2.registration.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import lab2.registration.model.CourseInfo;
import lab2.registration.model.CourseInstance;


import java.io.File;
import java.io.IOException;

public class InstructorsDataReader {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public CourseInfo[] readCourseInfo() throws IOException {
        return objectMapper
                .readValue(new File("src/main/resources/instructors.json"), CourseInfo[].class);
    }
}