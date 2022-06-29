package Ex03;

public class CamaroteInferior extends Vip {

    public String localizacao;


    public CamaroteInferior(double valor, double valoradicional, String localizacao) {
        super(valor, valoradicional);
        this.localizacao = localizacao;
    }

    public void PrintLocalização(){
        System.out.println(localizacao);
    }


    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
