package Ex03;

public class CamaroteSUPERIOR extends Vip{


    private double ValorAdicionalsup;

    public CamaroteSUPERIOR(double valor, double valoradicional, double valorAdicional) {
        super(valor, valoradicional);
        ValorAdicionalsup = valorAdicional;
    }



    @Override
    public double ValorIngresso() {
        return super.ValorIngresso() + ValorAdicionalsup;
    }
}
