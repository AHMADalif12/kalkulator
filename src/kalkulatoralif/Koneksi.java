/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatoralif;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class Koneksi {
    private Connection connect;
    private String jdbcUrl = "jdbc:mysql://localhost:3306/kalkulator";
    private String username = "root";
    private String password = "";
    
    public Connection getKoneksi(){
        if(connect == null){
            try {
                Driver d = new com.mysql.cj.jdbc.Driver();
                DriverManager.registerDriver(d);
                connect = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException ex) {
                System.out.println("Koneksi Gagal: " + ex);
            }
        }
        return connect;
    }
    
    public static void main(String[] args) {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
    }
}
