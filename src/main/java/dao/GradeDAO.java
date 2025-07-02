package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Department;
import model.Grade;
import model.Student;
import model.Subject;
import utils.DBContext;

/**
 *
 * @author CE190990 - Nguyen Hoai An
 */
public class GradeDAO extends DBContext {
    public GradeDAO() {
        super();
    }
    
    public List<Grade> getAll() {
        List<Grade> list = new ArrayList<>();
        
        try {
            PreparedStatement sqlQuery = db.prepareStatement("SELECT * " +
                "FROM Grade " +
                "JOIN Student ON Student.StudentID = Grade.StudentID " +
                "JOIN Subject ON Subject.SubjectID = Grade.SubjectID " +
                "JOIN Department ON Department.DepartmentID = Student.DepartmentID");
            ResultSet sqlRes = sqlQuery.executeQuery();
            
            while (sqlRes.next()) {
                //Student student, Subject subject, float score
                list.add(
                    new Grade(
                            //String studentID, String fullName, String date, boolean gender, Department department
                        new Student(
                            sqlRes.getString("studentID"),
                            sqlRes.getString("FullName"),
                            sqlRes.getString("BirthDate"),
                            sqlRes.getBoolean("Gender"),
                            new Department(
                                sqlRes.getString("DepartmentID"),
                                sqlRes.getString("DepartmentName")
                            )
                        ),
                        new Subject(
                            sqlRes.getString("SubjectID"),
                            sqlRes.getString("SubjectName"),
                            sqlRes.getInt("Credit")
                        ),
                        sqlRes.getFloat("Score")
                    )
                );
            }
        } catch (Exception ex) {}
        
        return list;
    }
}
