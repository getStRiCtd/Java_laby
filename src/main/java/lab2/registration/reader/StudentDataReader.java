package lab2.registration.reader;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;


import java.util.Map;
import java.util.HashMap;

import lab2.registration.model.Student;
import lab2.registration.model.StudentCategory;

import java.io.File;
import java.io.IOException;

/**
 * Класс для чтения информации о студентах из файлов
 */
public class StudentDataReader {

    private final ObjectMapper objectMapper = new ObjectMapper();


    public Map<Integer, Student> readBachelorStudentData() throws IOException {
        Student[] students  = objectMapper
                .readValue(new File("src/main/resources/bachelorStudents.json"), Student[].class);
        Map<Integer, Student> student_map = new HashMap<Integer, Student>();
        for (Student s : students)
        {
            student_map.put(s.getId(), s);
            s.setCategory(StudentCategory.BACHELOR);
        }
        return student_map;
    }

    public Map<Integer, Student> readMasterStudentData() throws IOException {
        Student[] students  = objectMapper
                .readValue(new File("src/main/resources/masterStudents.json"), Student[].class);
        Map<Integer, Student> student_map = new HashMap<Integer, Student>();
        for (Student s : students)
        {
            student_map.put(s.getId(), s);
            s.setCategory(StudentCategory.MASTER);
        }
        return student_map;
    }

}
