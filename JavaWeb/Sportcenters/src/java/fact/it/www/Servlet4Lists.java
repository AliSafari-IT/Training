/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www;

import fact.it.www.beans.Members;
import fact.it.www.beans.SportCamp;
import fact.it.www.beans.Sportcentrum;
import fact.it.www.dataaccess.DACamp;
import fact.it.www.dataaccess.DAMembers;
import fact.it.www.dataaccess.DASportcentrum;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ali
 */
@WebServlet(name = "Servlet4Lists", urlPatterns = {"/Servlet4Lists"}, initParams = {
    @WebInitParam(name = "url", value = "jdbc:derby://localhost:1527/jdbc_SportCenters"),
    @WebInitParam(name = "login", value = "root"),
    @WebInitParam(name = "password", value = "sql"),
    @WebInitParam(name = "driver", value = "org.apache.derby.jdbc.ClientDriver")})

public class Servlet4Lists extends HttpServlet {

    private DASportcentrum dasportcentrum = null;
    private DACamp dacamp = null;
    private DAMembers daMember = null;

    @Override
    public void init() throws ServletException {

        try {
            String url = getInitParameter("url");
            String login = getInitParameter("login");
            String password = getInitParameter("password");
            String driver = getInitParameter("driver");

            if (dasportcentrum == null) {
                dasportcentrum = new DASportcentrum(url, login, password, driver);
            }

            if (dacamp == null) {
                dacamp = new DACamp(url, login, password, driver);
            }

            if (daMember == null) {
                daMember = new DAMembers(url, login, password, driver);
            }

        } catch (ClassNotFoundException e) {
//            throw new ServletException(e);
            e.printStackTrace();
        }
    }

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
        RequestDispatcher rd = null;
        Sportcentrum sportcentrum;
        Members member;
        String sportCenterID = request.getParameter("sportCenterID");
        Integer sportcentrumid = tryParse(sportCenterID);
        if (sportcentrumid == null) {
        } else {
            sportcentrum = dasportcentrum.getSportcentrum(sportcentrumid);
            if (sportcentrum != null) {
                request.setAttribute("sportcentrum", sportcentrum);
                rd = request.getRequestDispatcher("sportcentrum.jsp");
            } else {
                String errMsg = "ID " + sportcentrumid + " is not linked to any of sportcentra in the database. Try again!</ br>";
                request.setAttribute("errMsg", errMsg);
                rd = request.getRequestDispatcher("error.jsp");
            }
            rd.forward(request, response);
        }

        if (request.getParameter("firstCamp") != null) {
            SportCamp kamp = dacamp.getCamp();
            request.setAttribute("kamp", kamp);
            rd = request.getRequestDispatcher("kamp.jsp");
            rd.forward(request, response);
        } else {
            String clicked = request.getParameter("clicked");
            if (clicked.equalsIgnoreCase("firstCamp")) {
                SportCamp kamp = dacamp.getCamp();
                request.setAttribute("kamp", kamp);
                rd = request.getRequestDispatcher("kamp.jsp");
                rd.forward(request, response);
            }
        }
    }

    public Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
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
