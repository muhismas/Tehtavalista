
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class Kayttoliittyma {
    private Scanner lukija;
    private Tehtavalista lista;
    
    public Kayttoliittyma(Tehtavalista lista, Scanner lukija){
        this.lista = lista;
        this.lukija = lukija;
    }
    
    public void kaynnista(){
        while(true){
         String komento = this.lukija.nextLine();
         if(komento.equals("lopeta")){
             break;
         } else if (komento.equals("lisaa")){
             System.out.print("Lisäättävä: ");
             String lisattava = this.lukija.nextLine();
             this.lista.lisaa(lisattava);
         } else if(komento.equals("listaa")){
             this.lista.tulosta();
         } else if(komento.equals("poista")){
             
             System.out.print("Mikä poistetaan? ");
             int poistettava = Integer.valueOf(this.lukija.nextLine());
             this.lista.poista(poistettava);
         }
        }
    }
}
