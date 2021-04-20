package se.lexicon.demo_rest.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Student {
@Id
@GeneratedValue(generator = "UUID")
  @GenericGenerator(name ="UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    @Column(unique = true)
    private String email;
    private String phoneNumber;
    private LocalDateTime registerDate;
    private boolean status;
}
