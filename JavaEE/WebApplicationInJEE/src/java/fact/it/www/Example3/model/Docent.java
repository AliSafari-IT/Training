/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.Example3.model;

/**
 *
 * @author Ali
 */
public class Docent {

    private String studentName;
    private String docentName;
    private String className;
    private String studentPreference;

    public Docent(String studentName, String docentName, String className, String studentPreference) {
        this.studentName = studentName;
        this.docentName = docentName;
        this.className = className;
        this.studentPreference = studentPreference;
    }

    /**
     * Get the value of className
     *
     * @return the value of className
     */
    public String getClassName() {
        return className;
    }

    /**
     * Set the value of className
     *
     * @param className new value of className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Get the value of studentPreference
     *
     * @return the value of studentPreference
     */
    public String getStudentPreference() {
        return studentPreference;
    }

    /**
     * Set the value of studentPreference
     *
     * @param studentPreference new value of studentPreference
     */
    public void setStudentPreference(String studentPreference) {
        this.studentPreference = studentPreference;
    }

    /**
     * Get the value of docentName
     *
     * @return the value of docentName
     */
    public String getDocentName() {
        return docentName;
    }

    /**
     * Set the value of docentName
     *
     * @param docentName new value of docentName
     */
    public void setDocentName(String docentName) {
        this.docentName = docentName;
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

}
