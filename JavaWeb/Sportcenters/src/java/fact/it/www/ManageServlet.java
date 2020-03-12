package fact.it.www;

import fact.it.www.beans.Members;
import fact.it.www.beans.SportCamp;
import fact.it.www.beans.Sportcentrum;
import fact.it.www.dataaccess.DAMembers;
import fact.it.www.dataaccess.DACamp;
import fact.it.www.dataaccess.DASportcentrum;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ManageServlet", urlPatterns = {"/ManageServlet"}, initParams = {
    @WebInitParam(name = "url", value = "jdbc:derby://localhost:1527/jdbc_SportCenters"),
    @WebInitParam(name = "login", value = "root"),
    @WebInitParam(name = "password", value = "sql"),
    @WebInitParam(name = "driver", value = "org.apache.derby.jdbc.ClientDriver")})

public class ManageServlet extends HttpServlet {

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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = null;
        Sportcentrum sportcentrum;
        Members member;
        if (request.getParameter("memberID") != null) {
            Integer memberID = tryParse(request.getParameter("memberID"));
            if (memberID != null) {
                member = daMember.getMember(memberID);
                request.setAttribute("member", member);
                rd = request.getRequestDispatcher("memberDetails.jsp");
                rd.forward(request, response);
            } else {
                String errMsg = "There is a problem to access member details for this person with member ID " + memberID + ". Try again!";
                request.setAttribute("errMsg", errMsg);
                rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
        } else if (request.getParameter("WhichSportcenter") != null) {
            Integer sportcentrumid = tryParse(request.getParameter("sportcentrumid"));
            if (sportcentrumid != null) {
                sportcentrum = dasportcentrum.getSportcentrum(sportcentrumid);
                if (sportcentrum != null) {
                    request.setAttribute("sportcentrum", sportcentrum);
                    rd = request.getRequestDispatcher("sportcentrum.jsp");
                    rd.forward(request, response);
                } else {
                    String errMsg = "This is not a valid select. Try again!";
                    request.setAttribute("errMsg", errMsg);
                    rd = request.getRequestDispatcher("error.jsp");
                    rd.forward(request, response);
                }
            } else {
                String errMsg = "This is not a valid select. Try again!";
                request.setAttribute("errMsg", errMsg);
                rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
        } else if (request.getParameter("firstSportcenter") != null) {
            sportcentrum = dasportcentrum.getSportcentrum();
            request.setAttribute("sportcentrum", sportcentrum);
            rd = request.getRequestDispatcher("sportcentrum.jsp");
            rd.forward(request, response);
        } else if (request.getParameter("firstCamp") != null) {
            SportCamp kamp = dacamp.getCamp();
            request.setAttribute("kamp", kamp);
            rd = request.getRequestDispatcher("kamp.jsp");
            rd.forward(request, response);
        } else if (request.getParameter("searchByLastname") != null) {
            ArrayList<Members> members = daMember.getMembers(request.getParameter("lastName").trim().toLowerCase());
            if (members != null) {
                request.setAttribute("members", members);
                rd = request.getRequestDispatcher("searchByLastnameResult.jsp");
                rd.forward(request, response);
            } else {
                String errMsg = "There is nobody with a family name consists of " + request.getParameter("lastName") + ". Try again!</ br>";
                request.setAttribute("errMsg", errMsg);
                rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
        } else if (request.getParameter("clicked") == null) {
        } else {
            String clicked = request.getParameter("clicked");
            if (clicked.equalsIgnoreCase("firstSportcenter")) {
                sportcentrum = dasportcentrum.getSportcentrum();
                request.setAttribute("sportcentrum", sportcentrum);
                rd = request.getRequestDispatcher("sportcentrum.jsp");
                rd.forward(request, response);
            } else if (clicked.equalsIgnoreCase("firstCamp")) {
                SportCamp kamp = dacamp.getCamp();
                request.setAttribute("kamp", kamp);
                rd = request.getRequestDispatcher("kamp.jsp");
                rd.forward(request, response);
            } else if (clicked.equalsIgnoreCase("SportCentersList")) {
                ArrayList<Sportcentrum> spList = dasportcentrum.getSportcentersList();
                request.setAttribute("spList", spList);
                rd = request.getRequestDispatcher("chooseSportCentersFromList.jsp");
                rd.forward(request, response);
            } else if (clicked.equalsIgnoreCase("SportCentersComboBox")) {
                ArrayList<Sportcentrum> spCombo = dasportcentrum.getSportcentersList();
                request.setAttribute("spCombo", spCombo);
                rd = request.getRequestDispatcher("chooseSportCentersFromList.jsp");
                rd.forward(request, response);
            }
        }
        rd.forward(request, response);
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
