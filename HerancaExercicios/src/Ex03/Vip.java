package Ex03;

public class Vip extends Ingresso {
    private double valoradicional;

    public Vip(double valor, double valoradicional) {
        super(valor);
        this.valoradicional = valoradicional;
    }

    public double ValorIngresso(){
         return super.getValor() + this.valoradicional;
    }


}
