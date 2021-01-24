
package Main;
import java.sql.*;


public class JDBC {
    public static Connection conn;
    public static Statement stmt;
    public static ResultSet rs;
    
    public void connection() {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = java.sql.DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
            stmt = conn.createStatement();
            System.out.println("connected");
            
        }
        catch(Exception exp){
            System.out.println("Erreur de chargement de pilote:"+exp);
        }
                
    }
    public void getdata() throws SQLException{
        try{
            String sql = "SELECT * FROM professeur" ;
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                 System.out.println(rs.getString("ID_PROF")+"  "+rs.getString("NOM_PROF"));
            }
            System.out.println("FIN");
        }
        finally{
            if(rs!= null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } 
        
    }
    public void insertdata(int id, String abre) throws SQLException{
        try{
           String query="INSERT INTO fil VALUES ("+id+",'"+abre+"')";
           stmt.executeUpdate(query);
                     
        }
        catch(Exception e){
            System.out.println("Erreur:"+e);
        }
         
        
    }
    
    public void delete(int id) throws SQLException{
        try{
           String query="DELETE FROM fil where id="+id;
           stmt.executeUpdate(query);
                     
        }
        catch(Exception e){
            System.out.println("Erreur:"+e);
        }
        
    }
    
} 

    