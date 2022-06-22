package Ex01;

import java.math.BigDecimal;
import java.util.*;

public class C2 extends C1 {

    public List<String> A2;
    private BigDecimal B2;
    protected String C2;

    public C2() {
        super();
        System.out.println("Construtor c2 sem parametros foi chamado");
    }


    public C2(List<String> a, BigDecimal b, String c, List<String> a1, BigDecimal b1, String c1) {
        super(a, b, c);
        this.A2 = a1;
        this.B2 = b1;
        this.C2 = c1;
        System.out.println("Construtor c2 com parametros foi chamado");
    }

    public void mostrar_atributos(){
        super.mostrar_atributos();
        System.out.println("A da C2: " + this.A2);
        System.out.println("B da C2: " + this.B2);
        System.out.println("C da C2: " + this.C2);
    }

    public void mostar_atributos_super(){
        System.out.println("Super A1 da C1: " + super.A1);
        System.out.println("Super C1 da C1: " + super.C1);


    }

}
