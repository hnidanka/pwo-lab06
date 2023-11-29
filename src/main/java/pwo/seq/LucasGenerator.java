/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa reprezentująca generator ciągu Lucasa.
 * Dziedziczy po klasie FibonacciGenerator.
 * 
 * <p>
 * Klasa implementuje generację ciągu Lucasa, który jest podobny do ciągu Fibonacciego,
 * ale zaczyna się od wartości 2 i 1.
 * </p>
 * 
 * @author sofiia
 */
public class LucasGenerator extends FibonacciGenerator {

     /**
     * Konstruktor inicjalizujący generator Lucasa.
     * Ustawia bieżącą wartość, poprzednią wartość (f_2) oraz początkowy indeks.
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
        lastIndex = 1; // Set lastIndex to 1 initially
    }

  /**
     * Resetuje generator Lucasa do stanu początkowego.
     * Ustawia bieżącą wartość, poprzednią wartość (f_2) oraz początkowy indeks.
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
        lastIndex = 1; // Reset lastIndex to 1
    }

    /**
     * Generuje kolejną wartość ciągu Lucasa.
     * Można pominąć obliczenia pierwszej wartości, inkrementując lastIndex.
     *
     * @return Kolejna wartość ciągu Lucasa.
     */
    @Override
    public BigDecimal nextTerm() {
        // You can skip the first term calculation by incrementing lastIndex
        if (lastIndex == 1) {
            lastIndex++;
            return current;
        }

        return super.nextTerm();
    }
}