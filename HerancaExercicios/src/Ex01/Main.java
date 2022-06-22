package Ex01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String> A = Arrays.asList("SDASD", "SDASDSA");

    public static void main(String[] args) {
        C1 z = new C1(A, new BigDecimal(1), "sdsad");
        C2 x = new C2(A, new BigDecimal(2), "sadasd", A, new BigDecimal(323), "sdasdasd");
        C3 y = new C3(A, new BigDecimal(3), "sadasdsad", A, new BigDecimal(321), "sdasdsad", A, new BigDecimal(23), "sadasd");

        z.mostrar_atributos();
        x.mostrar_atributos();
        y.mostrar_atributos();

        System.out.println();

        z.mostar_atributos_super();
        x.mostar_atributos_super();
        y.mostar_atributos_super();
    }

}
