package DTO;

import UTIL.Campo;
import java.util.ArrayList;

public class ProdutosDTO extends Tabela {
    private Campo<Integer> id_produto = new Campo<>("id_produto","Identificador",true);
    private Campo<String> descricao_produto = new Campo<>("descricao_produto","Descrição Produto");
    private Campo<Float> preco = new Campo<>("preco","Preço");
    private Campo<Character> situacao = new Campo<>("situacao","Situação");
    
    public ProdutosDTO(){
        this.nomeTabela = "produtos";
    }
    
    @Override
    public ArrayList<Campo> retornaCampos() {
        ArrayList<Campo> listaCampos = new ArrayList<>();
        listaCampos.add(getId_produto());
        listaCampos.add(getDescricao_produto());
        listaCampos.add(getPreco());
        listaCampos.add(getSituacao());
        return listaCampos;
    }

    public Campo<Integer> getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto.valorCampo = id_produto;
    }

    public Campo<String> getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto.valorCampo = descricao_produto;
    }

    public Campo<Float> getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco.valorCampo = preco;
    }

    public Campo<Character> getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao.valorCampo = situacao;
    }
    
}
