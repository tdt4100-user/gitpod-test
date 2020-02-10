package encapsulation;

import static assertions.Assertions._assertEquals;
import static assertions.Assertions._assertNotNull;
import static assertions.Assertions._assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class LineEditorTest {
    private LineEditor lineEditor;

    @BeforeEach
    protected void setUp() {
        lineEditor = new LineEditor();
    }

    @Test
    public void testLineEditor() {
        _test__lineEditor_transitions0_effects0_state(lineEditor);

    }

    @Test
    public void testGetSetText() {
        String s = _init__getSetText_s();
        _transition_exprAction__getSetText_transitions0_actions0(lineEditor, s);
        _test__getSetText_transitions0_effects0_state(lineEditor, s);
        _transition_exprAction__getSetText_transitions1_actions0(lineEditor, s);
        _test__getSetText_transitions1_effects0_state(lineEditor, s);

    }

    @Test
    public void testGetSetInsertionIndex() {
        String s = _init__getSetInsertionIndex_s();
        _transition_exprAction__getSetInsertionIndex_transitions0_actions0(lineEditor, s);
        _test__getSetInsertionIndex_transitions0_effects0_state(lineEditor, s);
        _transition_exprAction__getSetInsertionIndex_transitions1_actions0(lineEditor, s);
        _test__getSetInsertionIndex_transitions1_effects0_state(lineEditor, s);
        _transition_exprAction__getSetInsertionIndex_transitions2_actions0(lineEditor, s);
        _test__getSetInsertionIndex_transitions2_effects0_state(lineEditor, s);
        try {
            _transition_exprAction__getSetInsertionIndex_transitions3_actions0(lineEditor, s);
            fail("IllegalArgumentException should be thrown after insertionIndex = -1");
        } catch (Exception e) {
            _assertTrue("IllegalArgumentException should be thrown after insertionIndex = -1",
                    e instanceof IllegalArgumentException);
        }
        try {
            _transition_exprAction__getSetInsertionIndex_transitions4_actions0(lineEditor, s);
            fail("IllegalArgumentException should be thrown after insertionIndex = 4");
        } catch (Exception e_1) {
            _assertTrue("IllegalArgumentException should be thrown after insertionIndex = 4",
                    e_1 instanceof IllegalArgumentException);
        }

    }

    @Test
    public void testLeft() {
        _transition_exprAction__left_transitions0_actions0(lineEditor);
        _transition_exprAction__left_transitions0_actions1(lineEditor);
        _transition_exprAction__left_transitions0_actions2(lineEditor);
        _test__left_transitions0_effects0_state(lineEditor);
        _transition_exprAction__left_transitions1_actions0(lineEditor);
        _test__left_transitions1_effects0_state(lineEditor);
        _transition_exprAction__left_transitions2_actions0(lineEditor);
        _test__left_transitions2_effects0_state(lineEditor);

    }

    @Test
    public void testRight() {
        _transition_exprAction__right_transitions0_actions0(lineEditor);
        _transition_exprAction__right_transitions0_actions1(lineEditor);
        _transition_exprAction__right_transitions0_actions2(lineEditor);
        _test__right_transitions0_effects0_state(lineEditor);
        _transition_exprAction__right_transitions1_actions0(lineEditor);
        _test__right_transitions1_effects0_state(lineEditor);
        _transition_exprAction__right_transitions2_actions0(lineEditor);
        _test__right_transitions2_effects0_state(lineEditor);

    }

    @Test
    public void testDeleteLeft() {
        _transition_exprAction__deleteLeft_transitions0_actions0(lineEditor);
        _transition_exprAction__deleteLeft_transitions0_actions1(lineEditor);
        _transition_exprAction__deleteLeft_transitions0_actions2(lineEditor);
        _test__deleteLeft_transitions0_effects0_state(lineEditor);
        _transition_exprAction__deleteLeft_transitions1_actions0(lineEditor);
        _transition_exprAction__deleteLeft_transitions1_actions1(lineEditor);
        _test__deleteLeft_transitions1_effects0_state(lineEditor);
        _transition_exprAction__deleteLeft_transitions2_actions0(lineEditor);
        _test__deleteLeft_transitions2_effects0_state(lineEditor);
        _transition_exprAction__deleteLeft_transitions3_actions0(lineEditor);
        _transition_exprAction__deleteLeft_transitions3_actions1(lineEditor);
        _transition_exprAction__deleteLeft_transitions3_actions2(lineEditor);
        _test__deleteLeft_transitions3_effects0_state(lineEditor);
        _transition_exprAction__deleteLeft_transitions4_actions0(lineEditor);
        _test__deleteLeft_transitions4_effects0_state(lineEditor);
        _transition_exprAction__deleteLeft_transitions5_actions0(lineEditor);
        _test__deleteLeft_transitions5_effects0_state(lineEditor);

    }

    @Test
    public void testDeleteRight() {
        _transition_exprAction__deleteRight_transitions0_actions0(lineEditor);
        _transition_exprAction__deleteRight_transitions0_actions1(lineEditor);
        _transition_exprAction__deleteRight_transitions0_actions2(lineEditor);
        _test__deleteRight_transitions0_effects0_state(lineEditor);
        _transition_exprAction__deleteRight_transitions1_actions0(lineEditor);
        _transition_exprAction__deleteRight_transitions1_actions1(lineEditor);
        _test__deleteRight_transitions1_effects0_state(lineEditor);
        _transition_exprAction__deleteRight_transitions2_actions0(lineEditor);
        _test__deleteRight_transitions2_effects0_state(lineEditor);
        _transition_exprAction__deleteRight_transitions3_actions0(lineEditor);
        _transition_exprAction__deleteRight_transitions3_actions1(lineEditor);
        _transition_exprAction__deleteRight_transitions3_actions2(lineEditor);
        _test__deleteRight_transitions3_effects0_state(lineEditor);
        _transition_exprAction__deleteRight_transitions4_actions0(lineEditor);
        _test__deleteRight_transitions4_effects0_state(lineEditor);
        _transition_exprAction__deleteRight_transitions5_actions0(lineEditor);
        _test__deleteRight_transitions5_effects0_state(lineEditor);

    }

    @Test
    public void testInsertString() {
        _transition_exprAction__insertString_transitions0_actions0(lineEditor);
        _test__insertString_transitions0_effects0_state(lineEditor);
        _transition_exprAction__insertString_transitions1_actions0(lineEditor);
        _test__insertString_transitions1_effects0_state(lineEditor);
        _transition_exprAction__insertString_transitions2_actions0(lineEditor);
        _test__insertString_transitions2_effects0_state(lineEditor);
        _transition_exprAction__insertString_transitions3_actions0(lineEditor);
        _transition_exprAction__insertString_transitions3_actions1(lineEditor);
        _transition_exprAction__insertString_transitions3_actions2(lineEditor);
        _test__insertString_transitions3_effects0_state(lineEditor);
        _transition_exprAction__insertString_transitions4_actions0(lineEditor);
        _transition_exprAction__insertString_transitions4_actions1(lineEditor);
        _transition_exprAction__insertString_transitions4_actions2(lineEditor);
        _test__insertString_transitions4_effects0_state(lineEditor);

    }

    private void _test__lineEditor_transitions0_effects0_state(final LineEditor it) {
        _test__lineEditor_transitions0_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__lineEditor_transitions0_effects0_state_objectTests0_test(final LineEditor it) {

        String _text = it.getText();
        _assertEquals("text == \"\" failed", "", _text);

        int _insertionIndex = it.getInsertionIndex();
        _assertNotNull("insertionIndex failed", _insertionIndex);
        try {
            /* 0 */
        } catch (AssertionFailedError error) {
            fail("0 failed: " + error.getMessage());
        }

    }

    private String _init__getSetText_s() {
        return "ABC";
    }

    private void _transition_exprAction__getSetText_transitions0_actions0(final LineEditor it, final String s) {
        try {

            it.setText("ABC");
        } catch (AssertionFailedError error) {
            fail("text = \"ABC\" failed: " + error.getMessage());
        }

    }

    private void _test__getSetText_transitions0_effects0_state(final LineEditor it, final String s) {
        _test__getSetText_transitions0_effects0_state_objectTests0_test(lineEditor, s);

    }

    private void _test__getSetText_transitions0_effects0_state_objectTests0_test(final LineEditor it, final String s) {
        try {

            it.setText(s);
        } catch (AssertionFailedError error) {
            fail("text = s failed after text = \"ABC\": " + error.getMessage());
        }
        try {

            int _length = s.length();
            it.setInsertionIndex(_length);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = s.length failed after text = \"ABC\": " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__getSetText_transitions1_actions0(final LineEditor it, final String s) {
        try {

            it.setText("");
        } catch (AssertionFailedError error) {
            fail("text = \"\" failed: " + error.getMessage());
        }

    }

    private void _test__getSetText_transitions1_effects0_state(final LineEditor it, final String s) {
        _test__getSetText_transitions1_effects0_state_objectTests0_test(lineEditor, s);

    }

    private void _test__getSetText_transitions1_effects0_state_objectTests0_test(final LineEditor it, final String s) {
        try {

            it.setText("");
        } catch (AssertionFailedError error) {
            fail("text = \"\" failed after text = \"\": " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after text = \"\": " + error_1.getMessage());
        }

    }

    private String _init__getSetInsertionIndex_s() {
        return "ABC";
    }

    private void _transition_exprAction__getSetInsertionIndex_transitions0_actions0(final LineEditor it,
            final String s) {
        try {

            it.setText("ABC");
        } catch (AssertionFailedError error) {
            fail("text = \"ABC\" failed: " + error.getMessage());
        }

    }

    private void _test__getSetInsertionIndex_transitions0_effects0_state(final LineEditor it, final String s) {
        _test__getSetInsertionIndex_transitions0_effects0_state_objectTests0_test(lineEditor, s);

    }

    private void _test__getSetInsertionIndex_transitions0_effects0_state_objectTests0_test(final LineEditor it,
            final String s) {
        try {

            it.setText(s);
        } catch (AssertionFailedError error) {
            fail("text = s failed after text = \"ABC\": " + error.getMessage());
        }
        try {

            int _length = s.length();
            it.setInsertionIndex(_length);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = s.length failed after text = \"ABC\": " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__getSetInsertionIndex_transitions1_actions0(final LineEditor it,
            final String s) {
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 0 failed: " + error.getMessage());
        }

    }

    private void _test__getSetInsertionIndex_transitions1_effects0_state(final LineEditor it, final String s) {
        _test__getSetInsertionIndex_transitions1_effects0_state_objectTests0_test(lineEditor, s);

    }

    private void _test__getSetInsertionIndex_transitions1_effects0_state_objectTests0_test(final LineEditor it,
            final String s) {
        try {

            it.setText(s);
        } catch (AssertionFailedError error) {
            fail("text = s failed after insertionIndex = 0: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after insertionIndex = 0: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__getSetInsertionIndex_transitions2_actions0(final LineEditor it,
            final String s) {
        try {

            it.setInsertionIndex(3);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 3 failed: " + error.getMessage());
        }

    }

    private void _test__getSetInsertionIndex_transitions2_effects0_state(final LineEditor it, final String s) {
        _test__getSetInsertionIndex_transitions2_effects0_state_objectTests0_test(lineEditor, s);

    }

    private void _test__getSetInsertionIndex_transitions2_effects0_state_objectTests0_test(final LineEditor it,
            final String s) {
        try {

            it.setText(s);
        } catch (AssertionFailedError error) {
            fail("text = s failed after insertionIndex = 3: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(3);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 3 failed after insertionIndex = 3: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__getSetInsertionIndex_transitions3_actions0(final LineEditor it,
            final String s) {
        try {

            it.setInsertionIndex((-1));
        } catch (AssertionFailedError error) {
            fail("insertionIndex = -1 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__getSetInsertionIndex_transitions4_actions0(final LineEditor it,
            final String s) {
        try {

            it.setInsertionIndex(4);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 4 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__left_transitions0_actions0(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__left_transitions0_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(2);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 2 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__left_transitions0_actions2(final LineEditor it) {
        try {

            it.left();
        } catch (AssertionFailedError error) {
            fail("left failed: " + error.getMessage());
        }

    }

    private void _test__left_transitions0_effects0_state(final LineEditor it) {
        _test__left_transitions0_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__left_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after text = \"Ja\" ,insertionIndex = 2 ,left: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(1);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 1 failed after text = \"Ja\" ,insertionIndex = 2 ,left: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__left_transitions1_actions0(final LineEditor it) {
        try {

            it.left();
        } catch (AssertionFailedError error) {
            fail("left failed: " + error.getMessage());
        }

    }

    private void _test__left_transitions1_effects0_state(final LineEditor it) {
        _test__left_transitions1_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__left_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after left: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after left: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__left_transitions2_actions0(final LineEditor it) {
        try {

            it.left();
        } catch (AssertionFailedError error) {
            fail("left failed: " + error.getMessage());
        }

    }

    private void _test__left_transitions2_effects0_state(final LineEditor it) {
        _test__left_transitions2_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__left_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after left: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after left: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__right_transitions0_actions0(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__right_transitions0_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 0 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__right_transitions0_actions2(final LineEditor it) {
        try {

            it.right();
        } catch (AssertionFailedError error) {
            fail("right failed: " + error.getMessage());
        }

    }

    private void _test__right_transitions0_effects0_state(final LineEditor it) {
        _test__right_transitions0_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__right_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after text = \"Ja\" ,insertionIndex = 0 ,right: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(1);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 1 failed after text = \"Ja\" ,insertionIndex = 0 ,right: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__right_transitions1_actions0(final LineEditor it) {
        try {

            it.right();
        } catch (AssertionFailedError error) {
            fail("right failed: " + error.getMessage());
        }

    }

    private void _test__right_transitions1_effects0_state(final LineEditor it) {
        _test__right_transitions1_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__right_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after right: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(2);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 2 failed after right: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__right_transitions2_actions0(final LineEditor it) {
        try {

            it.right();
        } catch (AssertionFailedError error) {
            fail("right failed: " + error.getMessage());
        }

    }

    private void _test__right_transitions2_effects0_state(final LineEditor it) {
        _test__right_transitions2_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__right_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after right: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after right: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions0_actions0(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions0_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 0 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions0_actions2(final LineEditor it) {
        try {

            it.deleteLeft();
        } catch (AssertionFailedError error) {
            fail("deleteLeft failed: " + error.getMessage());
        }

    }

    private void _test__deleteLeft_transitions0_effects0_state(final LineEditor it) {
        _test__deleteLeft_transitions0_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteLeft_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after text = \"Ja\" ,insertionIndex = 0 ,deleteLeft: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after text = \"Ja\" ,insertionIndex = 0 ,deleteLeft: "
                    + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions1_actions0(final LineEditor it) {
        try {

            it.setInsertionIndex(1);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 1 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions1_actions1(final LineEditor it) {
        try {

            it.deleteLeft();
        } catch (AssertionFailedError error) {
            fail("deleteLeft failed: " + error.getMessage());
        }

    }

    private void _test__deleteLeft_transitions1_effects0_state(final LineEditor it) {
        _test__deleteLeft_transitions1_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteLeft_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("a");
        } catch (AssertionFailedError error) {
            fail("text = \"a\" failed after insertionIndex = 1 ,deleteLeft: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after insertionIndex = 1 ,deleteLeft: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions2_actions0(final LineEditor it) {
        try {

            it.deleteLeft();
        } catch (AssertionFailedError error) {
            fail("deleteLeft failed: " + error.getMessage());
        }

    }

    private void _test__deleteLeft_transitions2_effects0_state(final LineEditor it) {
        _test__deleteLeft_transitions2_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteLeft_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("a");
        } catch (AssertionFailedError error) {
            fail("text = \"a\" failed after deleteLeft: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after deleteLeft: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions3_actions0(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions3_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(2);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 2 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions3_actions2(final LineEditor it) {
        try {

            it.deleteLeft();
        } catch (AssertionFailedError error) {
            fail("deleteLeft failed: " + error.getMessage());
        }

    }

    private void _test__deleteLeft_transitions3_effects0_state(final LineEditor it) {
        _test__deleteLeft_transitions3_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteLeft_transitions3_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("J");
        } catch (AssertionFailedError error) {
            fail("text = \"J\" failed after text = \"Ja\" ,insertionIndex = 2 ,deleteLeft: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(1);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 1 failed after text = \"Ja\" ,insertionIndex = 2 ,deleteLeft: "
                    + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions4_actions0(final LineEditor it) {
        try {

            it.deleteLeft();
        } catch (AssertionFailedError error) {
            fail("deleteLeft failed: " + error.getMessage());
        }

    }

    private void _test__deleteLeft_transitions4_effects0_state(final LineEditor it) {
        _test__deleteLeft_transitions4_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteLeft_transitions4_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("");
        } catch (AssertionFailedError error) {
            fail("text = \"\" failed after deleteLeft: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after deleteLeft: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions5_actions0(final LineEditor it) {
        try {

            it.deleteLeft();
        } catch (AssertionFailedError error) {
            fail("deleteLeft failed: " + error.getMessage());
        }

    }

    private void _test__deleteLeft_transitions5_effects0_state(final LineEditor it) {
        _test__deleteLeft_transitions5_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteLeft_transitions5_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("");
        } catch (AssertionFailedError error) {
            fail("text = \"\" failed after deleteLeft: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after deleteLeft: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions0_actions0(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions0_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(2);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 2 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions0_actions2(final LineEditor it) {
        try {

            it.deleteRight();
        } catch (AssertionFailedError error) {
            fail("deleteRight failed: " + error.getMessage());
        }

    }

    private void _test__deleteRight_transitions0_effects0_state(final LineEditor it) {
        _test__deleteRight_transitions0_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteRight_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed after text = \"Ja\" ,insertionIndex = 2 ,deleteRight: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(2);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 2 failed after text = \"Ja\" ,insertionIndex = 2 ,deleteRight: "
                    + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions1_actions0(final LineEditor it) {
        try {

            it.setInsertionIndex(1);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 1 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions1_actions1(final LineEditor it) {
        try {

            it.deleteRight();
        } catch (AssertionFailedError error) {
            fail("deleteRight failed: " + error.getMessage());
        }

    }

    private void _test__deleteRight_transitions1_effects0_state(final LineEditor it) {
        _test__deleteRight_transitions1_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteRight_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("J");
        } catch (AssertionFailedError error) {
            fail("text = \"J\" failed after insertionIndex = 1 ,deleteRight: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(1);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 1 failed after insertionIndex = 1 ,deleteRight: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions2_actions0(final LineEditor it) {
        try {

            it.deleteRight();
        } catch (AssertionFailedError error) {
            fail("deleteRight failed: " + error.getMessage());
        }

    }

    private void _test__deleteRight_transitions2_effects0_state(final LineEditor it) {
        _test__deleteRight_transitions2_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteRight_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("J");
        } catch (AssertionFailedError error) {
            fail("text = \"J\" failed after deleteRight: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(1);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 1 failed after deleteRight: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions3_actions0(final LineEditor it) {
        try {

            it.setText("Ja");
        } catch (AssertionFailedError error) {
            fail("text = \"Ja\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions3_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 0 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions3_actions2(final LineEditor it) {
        try {

            it.deleteRight();
        } catch (AssertionFailedError error) {
            fail("deleteRight failed: " + error.getMessage());
        }

    }

    private void _test__deleteRight_transitions3_effects0_state(final LineEditor it) {
        _test__deleteRight_transitions3_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteRight_transitions3_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("a");
        } catch (AssertionFailedError error) {
            fail("text = \"a\" failed after text = \"Ja\" ,insertionIndex = 0 ,deleteRight: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after text = \"Ja\" ,insertionIndex = 0 ,deleteRight: "
                    + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions4_actions0(final LineEditor it) {
        try {

            it.deleteRight();
        } catch (AssertionFailedError error) {
            fail("deleteRight failed: " + error.getMessage());
        }

    }

    private void _test__deleteRight_transitions4_effects0_state(final LineEditor it) {
        _test__deleteRight_transitions4_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteRight_transitions4_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("");
        } catch (AssertionFailedError error) {
            fail("text = \"\" failed after deleteRight: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after deleteRight: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions5_actions0(final LineEditor it) {
        try {

            it.deleteRight();
        } catch (AssertionFailedError error) {
            fail("deleteRight failed: " + error.getMessage());
        }

    }

    private void _test__deleteRight_transitions5_effects0_state(final LineEditor it) {
        _test__deleteRight_transitions5_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__deleteRight_transitions5_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("");
        } catch (AssertionFailedError error) {
            fail("text = \"\" failed after deleteRight: " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after deleteRight: " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions0_actions0(final LineEditor it) {
        try {

            it.insertString("");
        } catch (AssertionFailedError error) {
            fail("insertString(\"\") failed: " + error.getMessage());
        }

    }

    private void _test__insertString_transitions0_effects0_state(final LineEditor it) {
        _test__insertString_transitions0_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__insertString_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("");
        } catch (AssertionFailedError error) {
            fail("text = \"\" failed after insertString(\"\"): " + error.getMessage());
        }
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 0 failed after insertString(\"\"): " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions1_actions0(final LineEditor it) {
        try {

            it.insertString("Java");
        } catch (AssertionFailedError error) {
            fail("insertString(\"Java\") failed: " + error.getMessage());
        }

    }

    private void _test__insertString_transitions1_effects0_state(final LineEditor it) {
        _test__insertString_transitions1_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__insertString_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Java");
        } catch (AssertionFailedError error) {
            fail("text = \"Java\" failed after insertString(\"Java\"): " + error.getMessage());
        }
        try {

            it.setInsertionIndex(4);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 4 failed after insertString(\"Java\"): " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions2_actions0(final LineEditor it) {
        try {

            it.insertString(" er g\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("insertString(\" er gøy!\") failed: " + error.getMessage());
        }

    }

    private void _test__insertString_transitions2_effects0_state(final LineEditor it) {
        _test__insertString_transitions2_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__insertString_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Java er g\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("text = \"Java er gøy!\" failed after insertString(\" er gøy!\"): " + error.getMessage());
        }
        try {

            it.setInsertionIndex(12);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 12 failed after insertString(\" er gøy!\"): " + error_1.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions3_actions0(final LineEditor it) {
        try {

            it.setText("Javag\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("text = \"Javagøy!\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions3_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(4);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 4 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions3_actions2(final LineEditor it) {
        try {

            it.insertString(" er ");
        } catch (AssertionFailedError error) {
            fail("insertString(\" er \") failed: " + error.getMessage());
        }

    }

    private void _test__insertString_transitions3_effects0_state(final LineEditor it) {
        _test__insertString_transitions3_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__insertString_transitions3_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Java er g\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("text = \"Java er gøy!\" failed after text = \"Javagøy!\" ,insertionIndex = 4 ,insertString(\" er \"): "
                    + error.getMessage());
        }
        try {

            it.setInsertionIndex(8);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 8 failed after text = \"Javagøy!\" ,insertionIndex = 4 ,insertString(\" er \"): "
                    + error_1.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions4_actions0(final LineEditor it) {
        try {

            it.setText("er g\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("text = \"er gøy!\" failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions4_actions1(final LineEditor it) {
        try {

            it.setInsertionIndex(0);
        } catch (AssertionFailedError error) {
            fail("insertionIndex = 0 failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions4_actions2(final LineEditor it) {
        try {

            it.insertString("Java ");
        } catch (AssertionFailedError error) {
            fail("insertString(\"Java \") failed: " + error.getMessage());
        }

    }

    private void _test__insertString_transitions4_effects0_state(final LineEditor it) {
        _test__insertString_transitions4_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__insertString_transitions4_effects0_state_objectTests0_test(final LineEditor it) {
        try {

            it.setText("Java er g\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("text = \"Java er gøy!\" failed after text = \"er gøy!\" ,insertionIndex = 0 ,insertString(\"Java \"): "
                    + error.getMessage());
        }
        try {

            it.setInsertionIndex(5);
        } catch (AssertionFailedError error_1) {
            fail("insertionIndex = 5 failed after text = \"er gøy!\" ,insertionIndex = 0 ,insertString(\"Java \"): "
                    + error_1.getMessage());
        }

    }
}
