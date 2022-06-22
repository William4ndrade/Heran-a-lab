package Ex02;

import java.math.BigDecimal;
import java.util.*;

public class Empresa {


    private static List<Funcionario> AllFunças;

    private static void populaArray(){
        Funcionario f1 = new chefe("lucas", new Date(123213), new BigDecimal(20000));
        Funcionario f2 = new vendedor("joao", new Date(321321), new BigDecimal(2000), 12.3, 300);
        Funcionario f3 = new Horista("marcos", new Date(2312), new BigDecimal(0), 30, 500);
        Funcionario f4 = new Operario("carlos", new Date(2321313), new BigDecimal(3000),  300, 10);
        AllFunças = Arrays.asList(f1, f2, f3, f4);
    }

    public static void main(String[] args) {
        populaArray();

        AllFunças.forEach(e -> e.PagarSalario());


    }


}
