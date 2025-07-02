package model;

/**
 *
 * @author CE190990 - Nguyen Hoai An
 */
public class Subject {
    private String subjectID, subjectName;
    private int credit;

    public Subject(String subjectID, String subjectName, int credit) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.credit = credit;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
    
}
