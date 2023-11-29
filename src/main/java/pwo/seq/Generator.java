/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Klasa abstrakcyjna reprezentująca ogólny generator ciągów.
 * Implementuje interfejs SequenceGenerator.
 * Zawiera podstawową funkcjonalność wspólną dla różnych generatorów ciągów.
 * 
 * @author sofiia
 */
package pwo.seq;

import java.math.BigDecimal;
import pwo.utils.SequenceGenerator;

/**
 * Klasa abstrakcyjna reprezentująca ogólny generator ciągów.
 * Implementuje interfejs SequenceGenerator.
 * Zawiera podstawową funkcjonalność wspólną dla różnych generatorów ciągów.
 * 
 * @author sofiia
 */
public abstract class Generator implements SequenceGenerator{

    /**
      * Indeks ostatnio wygenerowanej wartości w ciągu.
     */
    protected int lastIndex = 0;

    /**
          * Bieżąca wartość ciągu.
     */
    protected BigDecimal
current = null,

    /**
          * Poprzednia wartość ciągu.
     */
    f_1 = null,

    /**
          * Przedprzednia wartość ciągu.
     */
    f_2 = null,

    /**
          * Przedprzedprzednia wartość ciągu.
     */
    f_3 = null;

    /**
      * Resetuje generator do stanu początkowego.
     */
    @Override
 public void reset() {
lastIndex = 0;
 }

    /**
     * Pobiera wartość ciągu dla określonego indeksu.
     * Jeśli indeks jest mniejszy od zera, zgłasza wyjątek IllegalArgumentException.
     * Jeśli indeks jest mniejszy lub równy ostatniemu indeksowi, resetuje generator i generuje ciąg aż do podanego indeksu.
     * Zwraca wartość ciągu dla podanego indeksu.
     *
     * @param i Indeks, dla którego ma zostać pobrana wartość ciągu.
     * @return Wartość ciągu dla podanego indeksu.
     * @throws IllegalArgumentException Jeśli indeks jest mniejszy od zera.
     */
    @Override
 public final BigDecimal getTerm(int i) {
 if (i < 0) throw new IllegalArgumentException();
 if (i < lastIndex) reset();
 while (lastIndex <= i) nextTerm();
 return current;
 }
 }