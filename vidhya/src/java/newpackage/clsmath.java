

package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clsmath {
    
     
    public int userid=0;
    public String username="";
    public String  mobileno="";
    public String email="";
    public String address="";
    public String password="";
   
    public ResultSet display()  throws SQLException, ClassNotFoundException
      {
    
      Class.forName("com.mysql.jdbc.Driver");
        Connection 
        con=DriverManager.getConnection("jdbc:mysql:///math","root","root");
          PreparedStatement prst=con.prepareStatement("{call  spselect()}");
          ResultSet rs=prst.executeQuery();
          return rs;
    }
   
    public void insert()throws ClassNotFoundException,SQLException
    {
    
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql:///math","root","root"); 
       PreparedStatement  pstmt=con.prepareStatement("{call spinsertdata(?,?,?,?,?,?)}");
               pstmt.setInt(1,userid);
               pstmt.setString(2,username);
               
               pstmt.setString(3,mobileno);
               pstmt.setString(4,email);
 
               pstmt.setString(5,address);
                  pstmt.setString(6,password);
               
 
 
               pstmt.executeUpdate();
    }
        
    
    
   
       public void singleselect() throws  ClassNotFoundException,SQLException
       {
       
       Class.forName("com.mysql.jdbc.Driver");
       Connection  con=DriverManager.getConnection("jdbc:mysql:///math","root","root"); 
       PreparedStatement  pstmt1=con.prepareStatement("{call spsinglevale(?)}");
            pstmt1.setInt(1,userid);
               ResultSet rs=pstmt1.executeQuery();
               rs.next();
              username =rs.getString("name");
              mobileno =rs.getString("phoneno");
              email=rs.getString("emailid");
             address= rs.getString("addresss");
             password=rs.getString("password");
            
       }
public void delete()throws   ClassNotFoundException,SQLException
    {
    
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql:///majorproject","root","root"); 
       PreparedStatement  pstmt=con.prepareStatement("{call spdeletep(?)}");
       pstmt.setInt(1,userid);
       pstmt.executeUpdate();
    }


   public ResultSet check() throws SQLException, ClassNotFoundException
      {
   
          ResultSet rs=null;
    
    Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql:///math","root","root");
          PreparedStatement prst=con.prepareStatement("SELECT * from signindata  WHERE name=? AND password=?");
        prst.setString(1, username);
     prst.setString(2, password);
         rs=prst.executeQuery();
         return rs;
   }
 
}


