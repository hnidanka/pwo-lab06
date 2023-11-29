package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa reprezentująca generator ciągu Tribonacciego.
 * Dziedziczy po klasie FibonacciGenerator.
 * 
 * <p>
 * Klasa implementuje generację ciągu Tribonacciego, który jest podobny do ciągu
 * Fibonacciego, ale zaczyna się od trzech początkowych wartości: 0, 0, 1.
 * </p>
 * 
 * @author sofiia
 */
public class TribonacciGenerator extends
        FibonacciGenerator {

   /**
     * Konstruktor inicjalizujący generator Tribonacciego.
     * Ustawia trzecią poprzednią wartość (f_3) na 0.
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Resetuje generator Tribonacciego do stanu początkowego.
     * Ustawia trzecią poprzednią wartość (f_3) na 0.
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

   /**
     * Generuje kolejną wartość ciągu Tribonacciego.
     *
     * @return Kolejna wartość ciągu Tribonacciego.
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
