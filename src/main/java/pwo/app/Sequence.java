/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
package pwo.app;

/**
* Klasa reprezentująca główną klasę programu do obsługi ciągów.
 * Zapewnia wybór odpowiedniej aplikacji na podstawie liczby argumentów.
 * Obsługuje dwa przypadki: wyświetlanie ciągów w terminalu (3 argumenty) 
 * oraz zapisywanie ciągów do pliku (4 argumenty).
 *
 * @author sofiia
 */
public class Sequence {

   /**
     * Metoda główna programu, uruchamiająca odpowiednią aplikację w zależności od liczby argumentów.
     *
     * @param args Tablica argumentów wejściowych.
     */
    public static void main(String[] args) {

 switch(args.length){
case 3: (new SeqToOutApp()).run(args); break;
case 4: (new SeqToFileApp()).run(args); break;default: System.out.println("!Illegal arguments\n"
+ "Legal usage: seqName from to [fileName]");
}
}
}