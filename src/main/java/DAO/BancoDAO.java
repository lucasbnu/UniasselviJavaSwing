package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BancoDAO {
    public Connection conn;
    public PreparedStatement ps;
    public BancoDAO(){ 
         //String textoConexao = "jdbc:mysql://localhost:3306/projetomercado?user=root&password=";
         String textoConexao = "jdbc:postgresql://192.95.52.241:5432/postgres";
         try {
            conn = DriverManager.getConnection(textoConexao,"postgres","bancotesteuni");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "BancoDAO.BancoDAO: "+e.getMessage());
        }
    }
    
        public ResultSet retornaDados(String Comando){
            ResultSet retorno = null;
            try {
                ps = conn.prepareStatement(Comando);
                retorno = ps.executeQuery();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "BancoDAO.retornaDados: "+ex.getMessage()+"\n"+Comando);
            }
               return retorno;    
        }
        public boolean executaComando(String Comando){
        try {
            ps = conn.prepareStatement(Comando);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BancoDAO.executaComando: "+ex.getMessage());
            return false;
        }
    }
}

