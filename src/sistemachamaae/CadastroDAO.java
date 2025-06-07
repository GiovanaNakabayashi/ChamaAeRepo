
package sistemachamaae;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroDAO {

    private final Connection conexao;

    
    public CadastroDAO(Connection conexao) {
        this.conexao = conexao;
    }

    
    public CadastroDAO() {
        try {
            this.conexao = Conexao.conectar();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }
    
    public int inserir(Cadastro cadastro) throws SQLException {
        String sql = "INSERT INTO cadastro (login, senha, status) VALUES (?, ?, ?)";

    try (PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
    stmt.setString(1, cadastro.getLogin());
    stmt.setString(2, cadastro.getSenha());
    stmt.setString(3, cadastro.getStatus());

    stmt.executeUpdate();

    try (ResultSet rs = stmt.getGeneratedKeys()) {
    if (rs.next()) {
     return rs.getInt(1);
    } else {
 throw new SQLException("Erro ao obter o ID do cadastro.");
   }
 }
 }}


}


    
