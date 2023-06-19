package dbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.pool.OracleDataSource;



public class DBConnection 
{   
    
   final static String DB_URL="jdbc:oracle:thin:@OracleDB2_high?TNS_ADMIN="+System.getProperty("user.dir")+"/src/resources/Wallet_OracleDB2";
   //final static String DB_URL="jdbc:oracle:thin:@OracleDB2_high?TNS_ADMIN=/Users/Neel_Esh/Downloads/Wallet_OracleDB2";
   
   final static String DB_USER_NAME="CollegeProject";
   
   final static String DB_PASS="Project123456";
   
   private static Connection conn=null;
   static 
   {   System.out.println(DB_URL);
       try
       {
           Class.forName("oracle.jdbc.OracleDriver");
           conn=DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_PASS);
           System.out.println("Connection Open SuccessFully");
       }
       catch(SQLException ex)
       {
           ex.printStackTrace();
           System.out.println("Error in DBConnection :- ");
       }
       catch(ClassNotFoundException ex)
       {
           ex.printStackTrace();
           System.out.println("Error in DBConnection :- ");
       }
   }
   
   public static Connection getConnection()throws SQLException
   {
       return conn;
   }
   
   public static void closeConnection()
   {
       try
       {    
           if(conn!=null)
                conn.close();
       }
       catch(SQLException ex)
       {
           ex.printStackTrace();
           System.out.println("Error while Closing Conn ");
       }
       
   }
}
