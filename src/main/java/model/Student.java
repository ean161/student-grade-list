package model;

/**
 *
 * @author CE190990 - Nguyen Hoai An
 */
public class Student {
    private String studentID, fullName, birthDate;
    private boolean gender;
    private Department department;

    public Student(String studentID, String fullName, String birthDate, boolean gender, Department department) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.department = department;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
}
