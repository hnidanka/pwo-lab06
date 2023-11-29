/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

import pwo.utils.SequenceTools;
import pwo.seq.Generator;

/**
  * Klasa reprezentująca aplikację do wyświetlania ciągów w terminalu.
 * Rozszerza funkcjonalności klasy bazowej SeqToFileApp.
 *
 * @author sofiia
 */
public class SeqToOutApp extends SeqToFileApp{
    
    /**
     * Metoda do parsowania argumentów wejściowych. Rozszerza funkcjonalności klasy bazowej.
     *
     * @param args Tablica argumentów wejściowych.
     * @return true, jeśli parsowanie zakończyło się sukcesem; w przeciwnym razie false.
     */
    @Override
    protected boolean getArgs(String[] args){
        if(super.getArgs(args)) return true;
        
        return seqType != null && from >= 0 && to >= 0;
    }
    
  /**
     * Metoda do wyświetlania ciągów w terminalu. Rozszerza funkcjonalności klasy bazowej.
     *
     * @return zawsze true, ponieważ nie ma potrzeby zapisu do pliku.
     */
    @Override
    protected boolean writeSeq() {
    System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));
    return true;
    }
    
    /**
     * Metoda do uruchamiania aplikacji. Rozszerza funkcjonalności klasy bazowej.
     *
     * @param args Tablica argumentów wejściowych.
     */
    @Override
    public void run(String[] args) {

System.out.println("Sequence to terminal CLI app");

if (!super.getArgs(args)) {
System.out.println("!Illegal arguments\n"
+ "Legal usage: seqName from to");
return;
}

writeSeq();
    
}
}