import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url  = "jdbc:mysql://localhost:3306/estudiantes2024";
        String user = "root";
        String password = "123456";

        student estudiante = new student();

        estudiante.setNombre("David Muela");
        estudiante.setCedula("175359104");
        estudiante.setNota1(12.12);
        estudiante.setNota2(14.51);

        student estudiante1 = new student();

        estudiante1.setNombre("Pepe Melo");
        estudiante1.setCedula("1234567890");
        estudiante1.setNota1(13.62);
        estudiante1.setNota2(16.11);


        String sql = "INSERT INTO estudiantes (cedula, nombre, b1, b2) VALUES (?, ?, ?, ?)";

        try (Connection connection= DriverManager.getConnection(url,user,password)){
            System.out.println("Conectado a la base de datos");
            PreparedStatement cadena = connection.prepareStatement(sql);
            cadena.setString(1, estudiante.getCedula());
            cadena.setString(2, estudiante.getNombre());
            cadena.setDouble(3,estudiante.getNota1());
            cadena.setDouble(4,estudiante.getNota2());

            cadena.executeUpdate();

            cadena.setString(1, estudiante1.getCedula());
            cadena.setString(2, estudiante1.getNombre());
            cadena.setDouble(3,estudiante1.getNota1());
            cadena.setDouble(4,estudiante1.getNota2());

            cadena.executeUpdate();

            System.out.printf("Insertaron correctamente");


        }catch (SQLException e1){
            System.out.println(e1);}
    }

}