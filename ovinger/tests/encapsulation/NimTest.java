package encapsulation;

import static org.junit.jupiter.api.Assertions.fail;
import static assertions.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class NimTest {
    private Nim nim;

    private Nim _init_nim() {
        Nim _nim = new Nim(5);
        return _nim;
    }

    @BeforeEach
    protected void setUp() {
        nim = _init_nim();

    }

    private boolean isValidMove(final Nim game, final int pieces, final boolean legal) {
        return (((legal == game.isValidMove(pieces, 0)) && (legal == game.isValidMove(pieces, 1)))
                && (legal == game.isValidMove(pieces, 2)));
    }

    @Test
    public void testConstructor() {
        _test__constructor_transitions0_effects0_state(nim);

    }

    @Test
    public void testRemovePieces() {
        _transition_exprAction__removePieces_transitions0_actions0(nim);
        _transition_exprAction__removePieces_transitions0_actions1(nim);
        _transition_exprAction__removePieces_transitions0_actions2(nim);
        _test__removePieces_transitions0_effects0_state(nim);
        try {
            _transition_exprAction__removePieces_transitions1_actions0(nim);
            fail("IllegalArgumentException should be thrown after removePieces(-1, 0)");
        } catch (Exception e) {
            _assertTrue("IllegalArgumentException should be thrown after removePieces(-1, 0)",
                    e instanceof IllegalArgumentException);
        }
        try {
            _transition_exprAction__removePieces_transitions2_actions0(nim);
            fail("IllegalArgumentException should be thrown after removePieces(0, 0)");
        } catch (Exception e_1) {
            _assertTrue("IllegalArgumentException should be thrown after removePieces(0, 0)",
                    e_1 instanceof IllegalArgumentException);
        }
        try {
            _transition_exprAction__removePieces_transitions3_actions0(nim);
            fail("IllegalArgumentException should be thrown after removePieces(6, 0)");
        } catch (Exception e_2) {
            _assertTrue("IllegalArgumentException should be thrown after removePieces(6, 0)",
                    e_2 instanceof IllegalArgumentException);
        }

    }

    @Test
    public void testGameOver() {
        _test__gameOver_transitions0_effects0_state(nim);
        _transition_exprAction__gameOver_transitions1_actions0(nim);
        _test__gameOver_transitions1_effects0_state(nim);
        try {
            _transition_exprAction__gameOver_transitions2_actions0(nim);
            fail("IllegalStateException should be thrown after removePieces(5, 0)");
        } catch (Exception e) {
            _assertTrue("IllegalStateException should be thrown after removePieces(5, 0)",
                    e instanceof IllegalStateException);
        }

    }

    @Test
    public void testIsValidMove() {
        _test__isValidMove_transitions0_effects0_state(nim);
        _transition_exprAction__isValidMove_transitions1_actions0(nim);
        _test__isValidMove_transitions1_effects0_state(nim);

    }

    private void _test__constructor_transitions0_effects0_state(final Nim it) {
        _test__constructor_transitions0_effects0_state_objectTests0_test(nim);

    }

    private void _test__constructor_transitions0_effects0_state_objectTests0_test(final Nim it) {

        int _pile = it.getPile(0);
        _assertEquals("getPile(0) == 5 failed", 5, _pile);

        int _pile_1 = it.getPile(1);
        _assertEquals("getPile(1) == 5 failed", 5, _pile_1);

        int _pile_2 = it.getPile(2);
        _assertEquals("getPile(2) == 5 failed", 5, _pile_2);

    }

    private void _transition_exprAction__removePieces_transitions0_actions0(final Nim it) {
        try {

            it.removePieces(3, 0);
        } catch (AssertionFailedError error) {
            fail("removePieces(3, 0) failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__removePieces_transitions0_actions1(final Nim it) {
        try {

            it.removePieces(2, 1);
        } catch (AssertionFailedError error) {
            fail("removePieces(2, 1) failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__removePieces_transitions0_actions2(final Nim it) {
        try {

            it.removePieces(1, 2);
        } catch (AssertionFailedError error) {
            fail("removePieces(1, 2) failed: " + error.getMessage());
        }

    }

    private void _test__removePieces_transitions0_effects0_state(final Nim it) {
        _test__removePieces_transitions0_effects0_state_objectTests0_test(nim);

    }

    private void _test__removePieces_transitions0_effects0_state_objectTests0_test(final Nim it) {

        int _pile = it.getPile(0);
        _assertEquals("getPile(0) == 2 failed after removePieces(3, 0) ,removePieces(2, 1) ,removePieces(1, 2)", 2,
                _pile);

        int _pile_1 = it.getPile(1);
        _assertEquals("getPile(1) == 3 failed after removePieces(3, 0) ,removePieces(2, 1) ,removePieces(1, 2)", 3,
                _pile_1);

        int _pile_2 = it.getPile(2);
        _assertEquals("getPile(2) == 4 failed after removePieces(3, 0) ,removePieces(2, 1) ,removePieces(1, 2)", 4,
                _pile_2);

    }

    private void _transition_exprAction__removePieces_transitions1_actions0(final Nim it) {
        try {

            it.removePieces((-1), 0);
        } catch (AssertionFailedError error) {
            fail("removePieces(-1, 0) failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__removePieces_transitions2_actions0(final Nim it) {
        try {

            it.removePieces(0, 0);
        } catch (AssertionFailedError error) {
            fail("removePieces(0, 0) failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__removePieces_transitions3_actions0(final Nim it) {
        try {

            it.removePieces(6, 0);
        } catch (AssertionFailedError error) {
            fail("removePieces(6, 0) failed: " + error.getMessage());
        }

    }

    private void _test__gameOver_transitions0_effects0_state(final Nim it) {
        _test__gameOver_transitions0_effects0_state_objectTests0_test(nim);

    }

    private void _test__gameOver_transitions0_effects0_state_objectTests0_test(final Nim it) {

        boolean _isGameOver = it.isGameOver();
        _assertTrue("! isGameOver() failed", (!_isGameOver));

    }

    private void _transition_exprAction__gameOver_transitions1_actions0(final Nim it) {
        try {

            it.removePieces(5, 0);
        } catch (AssertionFailedError error) {
            fail("removePieces(5, 0) failed: " + error.getMessage());
        }

    }

    private void _test__gameOver_transitions1_effects0_state(final Nim it) {
        _test__gameOver_transitions1_effects0_state_objectTests0_test(nim);

    }

    private void _test__gameOver_transitions1_effects0_state_objectTests0_test(final Nim it) {

        int _pile = it.getPile(0);
        _assertEquals("getPile(0) == 0 failed after removePieces(5, 0)", 0, _pile);

        _assertTrue("isGameOver() failed after removePieces(5, 0)", it.isGameOver());

    }

    private void _transition_exprAction__gameOver_transitions2_actions0(final Nim it) {
        try {

            it.removePieces(5, 0);
        } catch (AssertionFailedError error) {
            fail("removePieces(5, 0) failed: " + error.getMessage());
        }

    }

    private void _test__isValidMove_transitions0_effects0_state(final Nim it) {
        _test__isValidMove_transitions0_effects0_state_objectTests0_test(nim);

    }

    private void _test__isValidMove_transitions0_effects0_state_objectTests0_test(final Nim it) {

        boolean _isValidMove = this.isValidMove(it, 2, true);
        _assertTrue("isValidMove(2, true) failed", _isValidMove);

        boolean _isValidMove_1 = this.isValidMove(it, (-2), false);
        _assertTrue("isValidMove(-2, false) failed", _isValidMove_1);

        boolean _isValidMove_2 = this.isValidMove(it, 0, false);
        _assertTrue("isValidMove(0, false) failed", _isValidMove_2);

        _assertTrue("isValidMove(6, false) failed", this.isValidMove(it, 6, false));

    }

    private void _transition_exprAction__isValidMove_transitions1_actions0(final Nim it) {
        try {

            it.removePieces(5, 0);
        } catch (AssertionFailedError error) {
            fail("removePieces(5, 0) failed: " + error.getMessage());
        }

    }

    private void _test__isValidMove_transitions1_effects0_state(final Nim it) {
        _test__isValidMove_transitions1_effects0_state_objectTests0_test(nim);

    }

    private void _test__isValidMove_transitions1_effects0_state_objectTests0_test(final Nim it) {

        _assertTrue("isValidMove(2, false) failed after removePieces(5, 0)", this.isValidMove(it, 2, false));

    }
}
