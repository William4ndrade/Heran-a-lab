package Ex03;

public class Ingresso {

    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void EscrevaValor(){
        System.out.println(this.valor);
    }


    public double getValor() {
        return valor;
    }
}
