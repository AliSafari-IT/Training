package fact.it.www.Example2;

import fact.it.www.Example1.model.Student;

/**
 *
 * @author Ali
 */
public class studentCoursePreference extends Student{
    private String studentCourse;
    private String studentPreference;

    public studentCoursePreference(String studentId, String studentName, String studentAddress,String studentCourse, String studentPreference) {
        
        super(studentId, studentName, studentAddress);
        this.studentCourse = studentCourse;
        this.studentPreference = studentPreference;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentPreference() {
        return studentPreference;
    }

    public void setStudentPreference(String studentPreference) {
        this.studentPreference = studentPreference;
    }

    @Override
    public String toString() {
        return "studentCoursePreference{" + "studentCourse=" + studentCourse + ", studentPreference=" + studentPreference + '}';
    }

    
}
