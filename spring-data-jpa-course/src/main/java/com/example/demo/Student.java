package com.example.demo;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "Student")
@Table(name = "student",
        uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "Email")
        }
)

public class Student {
    public Student() {
    }

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
        @GeneratedValue(
                strategy = SEQUENCE,
                generator = "student_sequence"

        )
    @Column(
            name = "Id",
            updatable = false
    )

    private long id;
    @Column(
            name = "first_name",
            updatable = false,
            columnDefinition = "Text"
    )
    private String FirstName;
    @Column(
            name = "last_name",
            updatable = false,
            columnDefinition = "Text"
    )
    private String LastName;
    @Column(
            name = "Email",
            updatable = false,
                        columnDefinition = "Text"
    )
    private String Email;
    @Column(
            name = "Age",
            nullable = false
    )
    private Integer Age;

    public Student(
                    String firstName,
                   String lastName,
                   String email,
                   Integer age) {

        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Age=" + Age +
                '}';
    }
}
