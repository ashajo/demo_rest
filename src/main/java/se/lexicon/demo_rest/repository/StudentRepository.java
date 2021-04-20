package se.lexicon.demo_rest.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.demo_rest.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,String> {

    Optional<Student> findByEmailIgnoreCase(String email);
    // select * from customer where firstName = '' and lastName = '';
    List<Student> findByFirstNameIgnoreCaseAndLastNameIgnoreCase(String firstName, String lastName);

    List<Student> findByLastNameIgnoreCase(String lastName);

    List<Student> findByFirstNameIgnoreCase(String nameName);
}
