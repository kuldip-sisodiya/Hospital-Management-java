/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalMangmentSystem;
import java.sql.*;
/**
 *
 * @author Kuldipsinh
 */
public class database {
    static final String Url ="jdbc:mysql://localhost:3306/java_hospital_db";
    static final String USER="root";
    static final String PASS="";
        public static Connection mycon(){
                Connection con=null;
            try{
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(Url,USER,PASS);
                return con;                
            }catch(Exception ex){
                System.out.println("There were error while connecting to database");
               return null;
            }
        }
}
