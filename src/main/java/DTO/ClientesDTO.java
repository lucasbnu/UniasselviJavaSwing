package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class ClientesDTO extends Tabela {
    private Campo<Integer> ID_CLIENTE = new Campo<>("id_cliente","Identificador",true);
    private Campo<String>  nome_cliente = new Campo<>("nome_cliente","Nome Cliente");
    private Campo<Integer> idade = new Campo<>("idade","Idade");
    private Campo<Character> situacao = new Campo<>("situacao","Situação");
   
    
    public ClientesDTO(){
        this.nomeTabela = "clientes";
    }
    
    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampos = new ArrayList<>();
        listaCampos.add(getID_CLIENTE());
        listaCampos.add(getNome_cliente());
        listaCampos.add(getIdade());
        listaCampos.add(getSituacao());
        return listaCampos;
    }

    public Campo<Integer> getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public void setID_CLIENTE(Integer ID_CLIENTE) {
        
        this.ID_CLIENTE.valorCampo = ID_CLIENTE;
    }

    public Campo<String> getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente.valorCampo = nome_cliente;
    }

    public Campo<Integer> getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade.valorCampo = idade;
    }

    public Campo<Character> getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao.valorCampo = situacao;
    }
    
}
