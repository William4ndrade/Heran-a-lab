package Ex01;


import java.math.BigDecimal;
import java.util.*;

public class C3 extends C2 {


    public List<String> A3;
    private BigDecimal B3;
    protected String C3;

    public C3() {
        super();
        System.out.println("Construtor c3 sem parametros chamado");
    }

    public C3(List<String> a, BigDecimal b, String c, List<String> a1, BigDecimal b1, String c1, List<String> a2, BigDecimal b2, String c2) {
        super(a, b, c, a1, b1, c1);
        this.A3 = a2;
        this.B3 = b2;
        this.C3 = c2;
        System.out.println("Construtor c3 com parametros chamado");
    }

    public C3(List<String> a, BigDecimal b, String c, List<String> a1, BigDecimal b1, String c1) {
        super(a, b, c, a1, b1, c1);
    }


    public void mostrar_atributos(){
        super.mostrar_atributos();

        System.out.println("A da C3: " + this.A3);
        System.out.println("B da C3: " + this.B3);
        System.out.println("C da C3: " + this.C3);

    }

    public void mostar_atributos_super(){
        super.mostar_atributos_super();
        System.out.println("Super A2 da C2: " + super.A2);
        System.out.println("Super C2 da C2: " + super.C2);

    }
}
