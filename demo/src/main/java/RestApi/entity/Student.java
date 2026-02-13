package RestApi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id // we want the roll number to be a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //generates rolll numbers , becouse roll numbers are unique
    private int rollNo ;
    @Column(name= "student_name")
    private String name;
    @Column(name= "student_percentage")
    private float percentage ;
    @Column(name= "student_branch")
    private String branch;




}
