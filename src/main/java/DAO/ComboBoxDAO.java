package DAO;

import DTO.Tabela;
import UTIL.Campo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ComboBoxDAO {
    private BancoDAO banco = new BancoDAO();
    public JComboBox<String> comboBox;
    public Campo campoChave;
    public Campo campoDescricao;
    public Tabela tabela;

    public ComboBoxDAO(JComboBox<String> comboBox, Campo campoChave, Campo campoDescricao, Tabela tabela) {
        this.comboBox = comboBox;
        this.campoChave = campoChave;
        this.campoDescricao = campoDescricao;
        this.tabela = tabela;
    }
    public void posicionaComboBoxPelaChave(int chave){
        comboBox.setSelectedIndex(0);
        String chaveParametro = chave + " - ";
        String textoSelecionado = "";
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            comboBox.setSelectedIndex(i);
             textoSelecionado = comboBox.getSelectedItem().toString();
            if (textoSelecionado.contains(chaveParametro)){
                break;
            }
        }
        
    }
    public int retornaChaveSelecionada(){
        String textoSelecionado = comboBox.getSelectedItem().toString();
        String textoResultado = "";
        int index = 0;
     
        while(textoSelecionado.charAt(index+1) != '-'){
            textoResultado += textoSelecionado.charAt(index);
            index++;
        }
        textoResultado = textoResultado.trim();
        return Integer.parseInt(textoResultado);
    }
    public void atualizaDadosComboBox(){
        comboBox.removeAllItems();
        
        String comando = "SELECT "+campoChave.nomeCampo+", "
                +campoDescricao.nomeCampo+" FROM "+tabela.nomeTabela;
        ResultSet rs = banco.retornaDados(comando);
        String novaLinha = "";
        try {
            while (rs.next()) {
                for (int i = 1; i < 3; i++) {
                    if (i == 2){
                        novaLinha += rs.getString(i);
                    }else{
                        novaLinha = rs.getString(i) + " - ";
                    }
                }
                comboBox.addItem(novaLinha);
                
            }
            comboBox.setSelectedIndex(-1);
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
}
