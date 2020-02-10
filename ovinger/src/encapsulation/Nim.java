
package encapsulation;

import java.util.Arrays;
import java.util.List;

public class Nim {

    private List<Integer> piles;

    public Nim() {
        this.piles = Arrays.asList(10, 10, 10);
    }

    public Nim(int pileSize) {
        this.piles = Arrays.asList(pileSize, pileSize, pileSize);
    }

    /*
     * 
     * void removePieces(int number, int targetPile) - fjerner number (>= 1) antall
     * brikker fra haugen targetPile. IllegalArgumentException utløses hvis
     * targetPile eller number er ugyldig. Siden man ikke kan gjøre trekk etter at
     * spillet er over, må IllegalStateException utløses dersom metoden kalles etter
     * det.
     */
    public void removePieces(int number, int targetPile) {

        if(isGameOver()){
            throw new IllegalStateException();
        }

        if (outOfIndexBounds(targetPile) || number < 1 || number > getPile(targetPile)) {
            throw new IllegalArgumentException();
        }

        this.piles.set(targetPile, getPile(targetPile) - number);
    }

    /*
     * returnerer true dersom argumentene representerer et lovlig trekk, og false
     * dersom argumentene ikke ville ført til et lovlig trekk. Her skal man kun
     * sjekke om et trekk er lovlig å utføre, ikke faktisk endre på tilstanden. PS:
     * Husk at å flytte når et spill er over ikke er et lovlig trekk.
     */

    public boolean isValidMove(int number, int targetPile) {
        if(isGameOver()){
            return false;
        }

        if(outOfIndexBounds(targetPile)){
            return false;
        }

         if (outOfIndexBounds(targetPile) || number < 1 || number > getPile(targetPile)) {
            return false;
        }
        return true;
    }

    public boolean isGameOver() {
        boolean gameOver = false;
        for (int i = 0; i < this.piles.size(); i++) {
            if (getPile(i) == 0) {
                gameOver = true;
            }
        }
        return gameOver;
    }

    public int getPile(int targetPile) {
        return this.piles.get(targetPile);
    }

    private boolean outOfIndexBounds(int targetPile) {
        List<Integer> validIndexes = Arrays.asList(0, 1, 2);

        if (!validIndexes.contains(targetPile)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nim [piles=" + piles + "]";
    }
}