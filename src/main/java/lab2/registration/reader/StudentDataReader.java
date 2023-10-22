package lab2.registration.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import lab2.registration.model.Student;

import java.io.File;
import java.io.IOException;

/**
 * Класс для чтения информации о студентах из файлов
 */
public class StudentDataReader {

    private final ObjectMapper objectMapper = new ObjectMapper();


    public Student[] readBachelorStudentData() throws IOException {
        /*
          @return список студентов-бакалавров
         */
        return objectMapper
                .readValue(new File("src/main/resources/bachelorStudents.json"), Student[].class);
    }

    public Student[] readMasterStudentData() throws IOException {
        return objectMapper
                .readValue(new File("src/main/resources/masterStudents.json"), Student[].class);
    }

}
