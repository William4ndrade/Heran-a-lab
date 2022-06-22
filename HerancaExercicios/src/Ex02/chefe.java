package Ex02;

import java.math.BigDecimal;
import java.util.Date;

public class chefe extends  Funcionario {


    public chefe(String nome, Date dataNascimento, BigDecimal salario) {
        super(nome, dataNascimento, salario);
    }

    @Override
    public void PagarSalario() {
        System.out.println(this.getNome() + " ganhou " + this.getSalario().toString());
    }
}
