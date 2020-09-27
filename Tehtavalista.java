
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s1901557
 */
public class Tehtavalista {

    private ArrayList<String> lista;

    public Tehtavalista() {
        this.lista = new ArrayList<>();
    }

    public void lisaa(String tehtava) {
        if(!(this.lista.contains(tehtava))){
            this.lista.add(tehtava);
        }
    }

    public void tulosta() {
        if (this.lista.isEmpty()) {
            System.out.println("Tehtävälista on tyhjä");
        } else {
            for (int i=0; i<lista.size(); i++) {
                System.out.println(i+1 +": "+lista.get(i));
            }
        }
    }
    
    public void poista(int numero) {
        this.lista.remove(numero-1);
    }
}
