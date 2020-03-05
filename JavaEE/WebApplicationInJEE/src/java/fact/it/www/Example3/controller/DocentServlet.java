/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.Example3.controller;

import fact.it.www.Example1.model.Student;
import fact.it.www.Example2.studentCoursePreference;
import fact.it.www.Example3.model.Docent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ali
 */
@WebServlet(name = "DocentServlet", urlPatterns = {"/DocentServlet"})
public class DocentServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String studentName = request.getParameter("studentName");
        String classNr = request.getParameter("classNr");
        String studentPreference = request.getParameter("studentPreference");

        String docentName = "undefiend";
        String className = "INF_".concat(classNr);
        int klasnummer = Integer.parseInt(classNr);
        switch (klasnummer) {
            case 1:
                docentName = "Kristine Mangelschots";
                break;
            case 2:
            case 4:
                docentName = "Christel Maes";
                break;
            case 3:
            case 5:
                docentName = "Christine Smeets";
                break;
            case 6:
                docentName = "Els Peetermans";
                break;
        }

        Docent docent = new Docent(studentName, docentName, className, studentPreference);
        if (request.getParameter("classTeacherStudentPreferenceSubmit") != null) {
            request.setAttribute("docent", docent);
            request.getRequestDispatcher("classTeacherView.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
