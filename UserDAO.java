import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private static final String URL = "jdbc:mysql://127.0.0.1/test";
    private static final String USER = "lopes";
    private static final String PASSWORD = "123";

    public Connection conectarBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Trate adequadamente em um ambiente de produção
        }
        return null;
    }

    public boolean verificarUsuario(String login, String senha) {
        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";
        try (Connection conn = conectarBD();
             PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, senha);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Trate adequadamente em um ambiente de produção
        }
        return false;
    }
}