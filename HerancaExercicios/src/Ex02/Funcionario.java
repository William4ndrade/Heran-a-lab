package Ex02;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Funcionario {

    private String nome;
    private Date DataNascimento;
    private BigDecimal salario;

    public Funcionario(String nome, Date dataNascimento, BigDecimal salario) {
        this.nome = nome;
        DataNascimento = dataNascimento;
        this.salario = salario;
    }

    public abstract void PagarSalario();

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }
}
