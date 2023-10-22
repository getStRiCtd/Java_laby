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

import java.io.File;
import java.io.IOException;

/**
 * Класс для чтения информации о студентах из файлов
 */
public class StudentDataReader {

    private final ObjectMapper objectMapper = new ObjectMapper();


    public Student[] readBachelorStudentData() throws IOException {
        return objectMapper
                .readValue(new File("src/main/resources/bachelorStudents.json"), Student[].class);
    }

    public Student[] readMasterStudentData() throws IOException {
        return objectMapper
                .readValue(new File("src/main/resources/masterStudents.json"), Student[].class);
    }

}
