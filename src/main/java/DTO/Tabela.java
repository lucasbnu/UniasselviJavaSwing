package DTO;

import UTIL.Campo;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Tabela {
    public String nomeTabela;
    public abstract ArrayList<Campo> retornaCampos();
    
    public HashMap<String,String> retornaApelidoCampos(){
        ArrayList<Campo> listaCampos = retornaCampos();
        HashMap<String,String> hm = new HashMap<>();
        for (Campo campo : listaCampos) {
             hm.put(campo.apelidoCampo, campo.nomeCampo);
        }
    return hm;
    }
}
