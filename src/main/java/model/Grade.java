package model;

/**
 *
 * @author CE190990 - Nguyen Hoai An
 */
public class Grade {
    private Student student;
    private Subject subject;
    private float score;

    public Grade(Student student, Subject subject, float score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    
}
