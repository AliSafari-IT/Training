package fact.it.www.Example1.model;

/**
 *
 * @author Ali
 */

import java.util.Optional;

public class StudentService {

    public Optional<Student> getStudent(String id) {
        switch (id) {
            case "1":
                return Optional.of(new Student("1", "John Doe", "Mechelen"));
            case "2":
                return Optional.of(new Student("2", "Jane Goodall", "Hasselt"));
            case "3":
                return Optional.of(new Student("3", "Max Born", "Antwerpen"));
            default:
                return Optional.empty();
        }
    }
}