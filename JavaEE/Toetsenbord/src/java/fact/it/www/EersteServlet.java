/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www;

import fact.it.www.beans.Toetsenbord;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ali
 */
@WebServlet(name = "EersteServlet", urlPatterns = {"/EersteServlet"})
public class EersteServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Toetsenbord klavier;
            klavier = new Toetsenbord();
            klavier.setMerk("Ergo");
            klavier.setDraadloos(false);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Servlet</title><link rel=\"stylesheet\" href='newcss.css'> </head>");
            out.println("<body lang=NL-BE link=blue vlink=\"#954F72\">");
            out.println("<div class=WordSection1><p class=MsoTitle>Java Web Application<br>Servlet</p>");
            out.println("<p>Het merk van mijn toetsenbord is " + klavier.getMerk() + "</p>");
            out.println("<p>" + klavier + "</p>");
            out.println("<hr>");
            LocalDate vandaag = LocalDate.now();
            out.println("<h3>Vandaag is " + vandaag + "</h3>");
            out.println("<hr>");
            out.println("<p>Jaar = " + vandaag.getYear());
            out.println(", Maand = " + vandaag.getMonthValue());
            out.println(", Dag = " + vandaag.getDayOfMonth() + "</p>");
            out.println("<hr>");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate mijnDatum = LocalDate.parse("1/1/2000", formatter);
            out.println(mijnDatum);
            out.println("<hr>");
            ArrayList<String> namenLijst;
            namenLijst = new ArrayList<>();
            namenLijst.add("Alex");		//constante waarde
            namenLijst.add("Marie");		//constante waarde
            String mijnNaam = "Ali";
            namenLijst.add(mijnNaam); //variabele
            //For - each lus
            namenLijst.stream().forEach((naam) -> {
                out.println(naam);
                out.println(",  ");
            });
            out.println("<br>First name in the list: " + namenLijst.get(0) + "<br>");
            //Shuffle all the elements of the ArrayList list:Collections.shuffle(list); 
            Collections.shuffle(namenLijst);
            //For - each lus
            namenLijst.stream().forEach((naam) -> {
                out.println(naam);
                out.println(",  ");
            });

            try (PrintWriter output = response.getWriter()) {
                Toetsenbord klavier1 = new Toetsenbord();
                Toetsenbord klavier2 = new Toetsenbord("Logitech", 23.75);
                output.println("<p>" + klavier1 + "</p>");
                output.println("<p>" + klavier2 + "</p>");
            }

            out.println("</div></body>");
            out.println("</html>");
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
