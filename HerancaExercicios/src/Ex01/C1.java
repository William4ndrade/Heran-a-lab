package Ex01;

import java.math.BigDecimal;
import java.util.*;

public class C1 {

    public List<String> A1;
    private BigDecimal B1;
    protected String C1;


    public C1() {
        System.out.println("Construtor c1 sem parametros foi chamado");
    }


    public C1(List<String> a, BigDecimal b, String c) {
        this.A1  = a;
        this.B1  = b;
        this.C1  = c;
        System.out.println("Construtor c1 com parametros foi chamado");
    }

    public void mostrar_atributos(){
        System.out.println("A da C1: " + this.A1);
        System.out.println("B da C1: " + this.B1);
        System.out.println("C da C1: " + this.C1);

    }

    public void mostar_atributos_super(){
        System.out.println("Nao tem");
    }

}
