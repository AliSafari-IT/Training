package fact.it.www;

import fact.it.www.beans.SportTasks;
import fact.it.www.dataaccess.DACamp;
import fact.it.www.dataaccess.DAMembers;
import fact.it.www.dataaccess.DASportcentrum;
import fact.it.www.dataaccess.DATasks;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "Servlet4Admin", urlPatterns = {"/Servlet4Admin"}, initParams = {
    @WebInitParam(name = "url", value = "jdbc:derby://localhost:1527/jdbc_SportCenters"),
    @WebInitParam(name = "login", value = "root"),
    @WebInitParam(name = "password", value = "sql"),
    @WebInitParam(name = "driver", value = "org.apache.derby.jdbc.ClientDriver")})

public class Servlet4Admin extends HttpServlet {

    private DASportcentrum dasportcentrum = null;
    private DACamp daCamp = null;
    private DAMembers daMember = null;
    private DATasks daTasks = null;

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

            if (daCamp == null) {
                daCamp = new DACamp(url, login, password, driver);
            }

            if (daMember == null) {
                daMember = new DAMembers(url, login, password, driver);
            }
            if (daTasks == null) {
                daTasks = new DATasks(url, login, password, driver);
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

        if (request.getParameter("addTask") != null) {
            String addNewTask = request.getParameter("addTask");
            if (addNewTask.equalsIgnoreCase("true")) {
                rd = request.getRequestDispatcher("addTask.jsp");
                rd.forward(request, response);
            }
        }
        
        if (request.getParameter("addTaskButtonClicked") != null) {
            String taskContent = request.getParameter("taskContent");
            boolean added = daTasks.addTask(taskContent);
            if (added) {
                String result = "Added Successfully!";
                request.setAttribute("result", result);
                rd = request.getRequestDispatcher("result.jsp");
                rd.forward(request, response);
            }
        }
        
        if (request.getParameter("updateTaskButtonClicked") != null) {
            Integer taskID = tryParse(request.getParameter("taskID"));
            String updateTask = request.getParameter("taskContent");
            boolean updated = daTasks.updateTask(taskID, updateTask);
            if (updated) {
                String result = "Updated Successfully!";
                request.setAttribute("result", result);
                rd = request.getRequestDispatcher("result.jsp");
                rd.forward(request, response);
            } else {
                String errMsg = "The task has not been updated. Try again!!";
                request.setAttribute("errMsg", errMsg);
                rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
        }

        if (request.getParameter("administration") != null) {
            ArrayList<SportTasks> tasks = daTasks.getTasks();
            if (tasks != null) {
                request.setAttribute("tasks", tasks);
                rd = request.getRequestDispatcher("sportTasks.jsp");
                rd.forward(request, response);
            } else {
                String errMsg = "There is no task to see!";
                request.setAttribute("errMsg", errMsg);
                rd = request.getRequestDispatcher("error.jsp");
                rd.forward(request, response);
            }
        }

        if (request.getParameter("editTask") != null) {
            Integer taskID = tryParse(request.getParameter("editTask"));
            if (taskID != null) {
                SportTasks task = daTasks.getTask(taskID);
                request.setAttribute("task", task);
                rd = request.getRequestDispatcher("editTask.jsp");
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
