package mysql;
import java.sql.*;


public class MySqlConnection {
    final String URL = "jdbc:mysql://localhost:3306/";
    final String BD = "dbEstudiante";
    final String USERNAME = "root";
    final String PASSWORD = "";

    Connection connection;

    public java.sql.Connection establecerConexion() {

        // Establece la conexión con la base de datos

        try {

            connection = DriverManager.getConnection(URL + BD, USERNAME, PASSWORD);
            System.out.println("Conexión con base de datos" + BD + " ha sido abierta");

        } catch (SQLException e) {

            System.out.println("No se ha podido ESTABLECER la conexión con la base de datos");
            e.printStackTrace();
        }
        return connection;
    }

    public PreparedStatement enviarConsulta(Connection connection, String consultaSQL) {
        try {
            return connection.prepareStatement(consultaSQL);

        } catch (SQLException e) {

            System.out.println("No se ha podido generar el objeto Prepare Statement");
            e.printStackTrace();
        }
        return null;
    }


    public void cerrarConexion(Connection connection) {

        try {
            connection.close();
            System.out.println("Conexión con base de datos " + BD + " ha sido cerrada");
        } catch (SQLException e) {
            System.out.println("No se ha podido CERRAR la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}



