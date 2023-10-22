package lab2.registration.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import lab2.registration.model.Instructor;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InstructorsDataReader {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public Map<Integer, Instructor> readInstructors() throws IOException {
        Instructor[] instructor = objectMapper
                .readValue(new File("src/main/resources/instructors.json"), Instructor[].class);
        Map<Integer, Instructor> courseInfoMap = new HashMap<>();
        for (Instructor cs : instructor) {
            courseInfoMap.put(cs.getId(), cs);
        }
        return courseInfoMap;

    }
}