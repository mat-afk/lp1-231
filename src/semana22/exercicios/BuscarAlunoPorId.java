package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorId {
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost/alunosdb?user=root&password=mateus&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();

        String sql = "SELECT * FROM alunos WHERE id = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, codigo);
        ResultSet rs = pstm.executeQuery();

        while(rs.next()) {
            
            if(rs.getInt("id") == codigo) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                boolean ativo = rs.getBoolean("ativo");

                System.out.println(id);
                System.out.println(nome);
                System.out.println(email);
                System.out.println(ativo);
            }
        }

        scan.close();
        pstm.close();
        conn.close();
    }
}
