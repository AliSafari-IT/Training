/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.Example1.model;

/**
 *
 * @author Ali
 */
public class Student {

    private String studentId;
    private String studentName;
    private String studentAddress;

    public Student(String studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    /**
     * Get the value of studentAddress
     *
     * @return the value of studentAddress
     */
    public String getStudentAddress() {
        return studentAddress;
    }

    /**
     * Set the value of studentAddress
     *
     * @param studentAddress new value of studentAddress
     */
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    /**
     * Get the value of studentName
     *
     * @return the value of studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Set the value of studentName
     *
     * @param studentName new value of studentName
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Get the value of studentId
     *
     * @return the value of studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Set the value of studentId
     *
     * @param studentId new value of studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
