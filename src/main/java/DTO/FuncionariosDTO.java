package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class FuncionariosDTO extends Tabela {
    private Campo<Integer> id_funcionario = new Campo<>("id_funcionario","Identificador",true);
    private Campo<String> nome_funcionario = new Campo<>("nome_funcionario","Nome funcionario");
    private Campo<Integer> idade = new Campo<>("idade","Idade");
    private Campo<Character> situacao = new Campo<>("situacao","Situação");
    
    public FuncionariosDTO(){
        this.nomeTabela = "funcionarios";
    }
    
    
    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampos = new ArrayList<>();
        listaCampos.add(getId_funcionario());
        listaCampos.add(getNome_funcionario());
        listaCampos.add(getIdade());
        listaCampos.add(getSituacao());
        return listaCampos;
    }

    public Campo<Integer> getId_funcionario() {
        return id_funcionario;
    }

    public Campo<String> getNome_funcionario() {
        return nome_funcionario;
    }

    public Campo<Integer> getIdade() {
        return idade;
    }

    public Campo<Character> getSituacao() {
        return situacao;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario.valorCampo = id_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario.valorCampo = nome_funcionario;
    }

    public void setIdade(Integer idade) {
        this.idade.valorCampo = idade;
    }

    public void setSituacao(Character situacao) {
        this.situacao.valorCampo = situacao;
    }
    
}
