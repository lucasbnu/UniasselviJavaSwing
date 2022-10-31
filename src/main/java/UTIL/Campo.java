package UTIL;

public class Campo<E> {
    public String nomeCampo;
    public E valorCampo;
    public boolean chavePrimaria = false;
    public String apelidoCampo;
    public Campo(){}
    
    public Campo(String nomeCampo){
        this.nomeCampo = nomeCampo;
    }
    
    public Campo(String nomeCampo, String apelidoCampo){
        this.nomeCampo = nomeCampo;
        this.apelidoCampo = apelidoCampo;
    }
    public Campo(String nomeCampo, boolean chavePrimaria){
        this.nomeCampo = nomeCampo;
        this.chavePrimaria = chavePrimaria;
    }

    public Campo(String nomeCampo,String apelidoCampo , boolean chavePrimaria){
        this.nomeCampo = nomeCampo;
        this.chavePrimaria = chavePrimaria;
        this.apelidoCampo = apelidoCampo;
    }
    
}
