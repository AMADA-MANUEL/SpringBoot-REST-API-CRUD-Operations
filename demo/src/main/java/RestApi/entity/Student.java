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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
