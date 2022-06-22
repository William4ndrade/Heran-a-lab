package Ex02;

import java.math.BigDecimal;
import java.util.Date;

public class Horista extends Funcionario{


    private double valorhora;
    private double horastrabalhadas;

    public Horista(String nome, Date dataNascimento, BigDecimal salario, double valorhora, double horastrabalhadas) {
        super(nome, dataNascimento, salario);
        this.valorhora = valorhora;
        this.horastrabalhadas = horastrabalhadas;
    }


    @Override
    public void PagarSalario() {
        double valorfinal = valorhora * horastrabalhadas;
        System.out.println(this.getNome() + " ganhou " + valorfinal);

    }
}
