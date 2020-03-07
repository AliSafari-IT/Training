
package fact.it.www.jdbc_employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ali
 */
public class FirstExample {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";  
   static final String DB_URL = "jdbc:derby://localhost:1527/jdbc_employees";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "sql";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("org.apache.derby.jdbc.ClientDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT id, firstname, lastname, age FROM Employees";
       //STEP 5: Extract data from result set
       try (ResultSet rs = stmt.executeQuery(sql)) {
           //STEP 5: Extract data from result set
           while(rs.next()){
               //Retrieve by column name
               int id  = rs.getInt("id");
               int age = rs.getInt("age");
               String first = rs.getString("firstname");
               String last = rs.getString("lastname");
               
               //Display values
               System.out.print("ID: " + id);
               System.out.print(", Age: " + age);
               System.out.print(", First: " + first);
               System.out.println(", Last: " + last);
           }
           //STEP 6: Clean-up environment
       }
      stmt.close();
      conn.close();
   }catch(SQLException | ClassNotFoundException se){
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main

}//end FirstExample