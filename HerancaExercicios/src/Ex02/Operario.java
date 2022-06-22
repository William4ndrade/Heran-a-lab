package Ex02;

import java.math.BigDecimal;
import java.util.Date;

public class Operario  extends Funcionario{

    private double valorprodução;
    private int qntproduzida;

    public Operario(String nome, Date dataNascimento, BigDecimal salario, double valorprodução, int qntproduzida) {
        super(nome, dataNascimento, salario);
        this.valorprodução = valorprodução;
        this.qntproduzida = qntproduzida;
    }


    @Override
    public void PagarSalario() {
        double valorfinal = valorprodução * qntproduzida;
        System.out.println(this.getNome() + " ganhou " + valorfinal);
    }


}
