/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frmbarang;

import java.sql.*;
/**
 *
 * @author WINDOWS 10
 */
public class KoneksiMysql {
    String url, usr, pwd, dbn;
public KoneksiMysql (String dbn) {
	this.url = "jdbc:mysql://localhost/" + dbn;
	this.usr = "root";
	this.pwd = "";
}
	
public KoneksiMysql (String host, String user, String pass, String dbn) {
	this.url = "jdbc:mysql://" + host + "/" + dbn;
	this.usr = user;
	this.pwd = pass;
}
	
public Connection getConnection() throws SQLException {
	Connection con = null;
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(this.url, this.usr, this.pwd);
	} catch (ClassNotFoundException e) {
	System.out.println ("Error #1 : " + e.getMessage());
	System.exit(0);
	} catch (SQLException e) {
	System.out.println ("Error #2 : " + e.getMessage());
	System.exit(0);
	}
	return con;
}
	/*
	public static void main (String args[]) {
		KoneksiMysql kon = new KoneksiMysql ("mahasiswa");
		Connection c = kon.getConnection();
	}

         */
}
