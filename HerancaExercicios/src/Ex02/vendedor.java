package Ex02;

import java.math.BigDecimal;
import java.util.Date;

public class vendedor  extends Funcionario{


    private double comissão;
    private int qntvendas;

    public vendedor(String nome, Date dataNascimento, BigDecimal salario, double comissão, int qntvendas) {
        super(nome, dataNascimento, salario);
        this.comissão = comissão;
        this.qntvendas = qntvendas;
    }

    @Override
    public void PagarSalario() {
        double valorfinal = this.getSalario().doubleValue() + (comissão * qntvendas);
        System.out.println(this.getNome() + " ganhou " + valorfinal);
    }
}
