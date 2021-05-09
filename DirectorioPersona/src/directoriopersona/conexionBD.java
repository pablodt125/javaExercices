// Ximena Uribe Álvarez 1007824645
// Juan Camilo Sepúlveda 1088039096
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriopersona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author utp
 */
public class conexionBD {
    private String URLAccess    = "jdbc:oracle:thin:@localhost:1521:XE";
    private String usuario      = "C##BD20201";
    private String contrasena   = "xx20201";
    private Connection conexion;

    public String getURLAccess() {
        return URLAccess;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setURLAccess(String URLAccess) {
        this.URLAccess = URLAccess;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void setConexionOracle(String URLAccess,String usuario, String contrasena) {
        try{
            // String URLAccess    = "jdbc:oracle:thin:@localhost:1521:XE";
            // String usuario      = "system";
            // String contrasena   = "utp";
            setURLAccess(URLAccess);
            setUsuario(usuario);
            setContrasena(contrasena);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection(URLAccess,usuario,contrasena);
            System.out.println(" Conexion exitosa. URL: "+URLAccess+" Usuario: "+usuario);
        }catch(ClassNotFoundException | SQLException ex) {
            System.out.println(" error "+ex.toString());
        }
    }

    
    public void setConexionPostgreSQL(String URLAccess,String usuario, String contrasena) {
        try{
            // String URLAccess    = "jdbc:postgresql://localhost:5432/example"
            // String usuario      = "postgres";
            // String contrasena   = "ivan";
            setURLAccess(URLAccess);
            setUsuario(usuario);
            setContrasena(contrasena);
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URLAccess,usuario,contrasena);
            System.out.println(" Conexion exitosa. URL: "+URLAccess+" Usuario: "+usuario);
        }catch(ClassNotFoundException | SQLException ex) {
            System.out.println(" error "+ex.toString());
        }
    }

    public void closeConexion(){
        try{
            conexion.close();
        }catch(SQLException ex) {
            System.out.println(" error "+ ex.toString());
        }
    }
    
    public void sentenciasNoSelect(String sentencia){
        try{
            Statement st = conexion.createStatement();
            st.executeUpdate(sentencia);
            conexion.commit();
        }catch(SQLException ex) {
            System.out.println(" error "+ ex.toString());
        }
    }
    
    public void getDatosConsulta(String consulta){
		try{
			int i=0;
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			while ( rs.next() ){
				i++;
				//System.out.println("--------- Registro #: "+i);
				for (int j=1;j<=rs.getMetaData().getColumnCount();j++)
					System.out.println(rs.getObject(j)+"\t");

				//System.out.println("------------------------");
				System.out.println("");
			}
		}catch(SQLException ex) {
			System.out.println(" error "+ ex.toString());
		}
	}

	public void getMetaDataTable(String consulta){
		try{
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			// MOSTRAR LA METADATA
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("--- Numero de campos: "+
			rs.getMetaData().getColumnCount());
			int i=1;
			while ( i <= rsmd.getColumnCount()){
				System.out.println("Campo: "+
				rsmd.getColumnName(i)+" Tipo de dato: "+rsmd.getColumnTypeName(i) );
				i++;
			}
		}catch(SQLException ex) {
			System.out.println(" error "+ ex.toString());
		}
	}

	public static void main(String[] args) {
		// TODO code application logic here
		conexionBD vc = new conexionBD();
                
                /*  CONEXION A UNA BASE DE DATOS ORACLE */
		//vc.setConexionOracle(vc.getURLAccess() ,"C##BD20201","bd20201");
                
                
                /*  CONEXION A UNA BASE DE DATOS MYSQL */
               // vc.setURLAccess("jdbc:mariadb://localhost:3306/bd20211");
               // vc.setConexionOracle(vc.getURLAccess() ,"root@localhost","bd20211");

                /*  CONEXION A UNA BASE DE DATOS MYSQL */
                setConexionPostgreSQL("jdbc:postgresql://localhost:5432/bd20211" ,"postgres","ivan");
                
                
		System.out.println("------------- Metadatos de la consulta -------------");
		vc.getMetaDataTable("select * from branch");
		System.out.println("------------- Mostrando Informacion -------------");
		vc.getDatosConsulta("select * from branch");
		vc.sentenciasNoSelect("create table tmp0x ( id numeric)");
		vc.closeConexion();
	}
}
