package stateandbehavior;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import stateandbehavior.LineEditor;

public class LineEditorTest {
    private LineEditor lineEditor;

    @BeforeEach
    protected void setUp() {
        lineEditor = new LineEditor();

    }

    private void set(final String s) {
        final int pos = s.indexOf("|");
        String _substring = s.substring(0, pos);
        String _substring_1 = s.substring((pos + 1));
        String _plus = (_substring + _substring_1);
        this.lineEditor.setText(_plus);
        this.lineEditor.setInsertionIndex(pos);
    }

    private boolean operator_equals(final LineEditor lineEditor, final String s) {
        boolean _xblockexpression = false;
        {
            final int pos = s.indexOf("|");
            final String head = s.substring(0, pos);
            String _xifexpression = null;
            int _length = s.length();
            boolean _lessThan = ((pos + 1) < _length);
            if (_lessThan) {
                _xifexpression = s.substring((pos + 1));
            } else {
                _xifexpression = "";
            }
            final String tail = _xifexpression;
            _xblockexpression = (Objects.equals(lineEditor.getText(), (head + tail))
                    && (lineEditor.getInsertionIndex() == pos));
        }
        return _xblockexpression;
    }

    // @JExercise(description = "<h3>Konstrukt\u00F8r</h3>Tests
    // \n\t\tinitialization\n")
    @Test
    public void testConstructor() {
        _test__constructor_transitions0_effects0_state(lineEditor);

    }

    // @JExercise(tests = "void left()", description = "<h3>Venstre</h3>Tests
    // \n\t\tthe following
    // sequence:\n\t\t<ul>\n\t\t<li>left</li>\n\t\t<li>set(\"J|\"),
    // left</li>\n\t\t</ul>\n")
    @Test
    public void testLeft() {
        _transition_exprAction__left_transitions0_actions0(lineEditor);
        _test__left_transitions0_effects0_state(lineEditor);
        _transition_exprAction__left_transitions1_actions0(lineEditor);
        _transition_exprAction__left_transitions1_actions1(lineEditor);
        _test__left_transitions1_effects0_state(lineEditor);

    }

    // @JExercise(tests = "void right()", description = "<h3>H\u00F8yre</h3>Tests
    // \n\t\tthe following
    // sequence:\n\t\t<ul>\n\t\t<li>right</li>\n\t\t<li>set(\"|J\"),
    // right</li>\n\t\t</ul>\n")
    @Test
    public void testRight() {
        _transition_exprAction__right_transitions0_actions0(lineEditor);
        _test__right_transitions0_effects0_state(lineEditor);
        _transition_exprAction__right_transitions1_actions0(lineEditor);
        _transition_exprAction__right_transitions1_actions1(lineEditor);
        _test__right_transitions1_effects0_state(lineEditor);

    }

    // @JExercise(tests = "void deleteLeft()", description = "<h3>Slett mot
    // venstre</h3>Tests \n\t\tthe following
    // sequence:\n\t\t<ul>\n\t\t<li>deleteLeft</li>\n\t\t<li>set(\"J|\"),
    // deleteLeft</li>\n\t\t<li>set(\"Ja|va\"), deleteLeft</li>\n\t\t</ul>\n")
    @Test
    public void testDeleteLeft() {
        _transition_exprAction__deleteLeft_transitions0_actions0(lineEditor);
        _test__deleteLeft_transitions0_effects0_state(lineEditor);
        _transition_exprAction__deleteLeft_transitions1_actions0(lineEditor);
        _transition_exprAction__deleteLeft_transitions1_actions1(lineEditor);
        _test__deleteLeft_transitions1_effects0_state(lineEditor);
        _transition_exprAction__deleteLeft_transitions2_actions0(lineEditor);
        _transition_exprAction__deleteLeft_transitions2_actions1(lineEditor);
        _test__deleteLeft_transitions2_effects0_state(lineEditor);

    }

    // @JExercise(tests = "void deleteRight()", description = "<h3>Slett mot
    // h\u00F8yre</h3>Tests \n\t\tthe following
    // sequence:\n\t\t<ul>\n\t\t<li>deleteRight</li>\n\t\t<li>set(\"|J\"),
    // deleteRight</li>\n\t\t<li>set(\"J|ava\"), deleteRight</li>\n\t\t</ul>\n")
    @Test
    public void testDeleteRight() {
        _transition_exprAction__deleteRight_transitions0_actions0(lineEditor);
        _test__deleteRight_transitions0_effects0_state(lineEditor);
        _transition_exprAction__deleteRight_transitions1_actions0(lineEditor);
        _transition_exprAction__deleteRight_transitions1_actions1(lineEditor);
        _test__deleteRight_transitions1_effects0_state(lineEditor);
        _transition_exprAction__deleteRight_transitions2_actions0(lineEditor);
        _transition_exprAction__deleteRight_transitions2_actions1(lineEditor);
        _test__deleteRight_transitions2_effects0_state(lineEditor);

    }

    // @JExercise(tests = "void insertString(String)", description = "<h3>Sett inn
    // tekst</h3>Tests \n\t\tthe following
    // sequence:\n\t\t<ul>\n\t\t<li>insertString(\"\")</li>\n\t\t<li>insertString(\"Java\")</li>\n\t\t<li>insertString(\"
    // er g\u00F8y!\")</li>\n\t\t<li>set(\"Java|g\u00F8y!\"), insertString(\" er
    // \")</li>\n\t\t<li>set(\"|er g\u00F8y!\"), insertString(\"Java
    // \")</li>\n\t\t</ul>\n")
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
        _test__insertString_transitions3_effects0_state(lineEditor);
        _transition_exprAction__insertString_transitions4_actions0(lineEditor);
        _transition_exprAction__insertString_transitions4_actions1(lineEditor);
        _test__insertString_transitions4_effects0_state(lineEditor);

    }

    private void _test__constructor_transitions0_effects0_state(final LineEditor it) {
        _test__constructor_transitions0_effects0_state_objectTests0_test(lineEditor);

    }

    private void _test__constructor_transitions0_effects0_state_objectTests0_test(final LineEditor it) {

        assertTrue(this.operator_equals(it, "|"), "it ==\"|\" failed");

    }

    private void _transition_exprAction__left_transitions0_actions0(final LineEditor it) {
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

        assertTrue(this.operator_equals(it, "|"), "it == \"|\" failed after left");

    }

    private void _transition_exprAction__left_transitions1_actions0(final LineEditor it) {
        try {

            this.set("J|");
        } catch (AssertionFailedError error) {
            fail("set(\"J|\") failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__left_transitions1_actions1(final LineEditor it) {
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

        assertTrue(this.operator_equals(it, "|J"), "it == \"|J\" failed after set(\"J|\") ,left");

    }

    private void _transition_exprAction__right_transitions0_actions0(final LineEditor it) {
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

        assertTrue(this.operator_equals(it, "|"),"it == \"|\" failed after right");

    }

    private void _transition_exprAction__right_transitions1_actions0(final LineEditor it) {
        try {

            this.set("|J");
        } catch (AssertionFailedError error) {
            fail("set(\"|J\") failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__right_transitions1_actions1(final LineEditor it) {
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

        assertTrue(this.operator_equals(it, "J|"),"it == \"J|\" failed after set(\"|J\") ,right");

    }

    private void _transition_exprAction__deleteLeft_transitions0_actions0(final LineEditor it) {
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

        assertTrue( this.operator_equals(it, "|"),"it == \"|\" failed after deleteLeft");

    }

    private void _transition_exprAction__deleteLeft_transitions1_actions0(final LineEditor it) {
        try {

            this.set("J|");
        } catch (AssertionFailedError error) {
            fail("set(\"J|\") failed: " + error.getMessage());
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

        assertTrue( this.operator_equals(it, "|"),"it == \"|\" failed after set(\"J|\") ,deleteLeft");

    }

    private void _transition_exprAction__deleteLeft_transitions2_actions0(final LineEditor it) {
        try {

            this.set("Ja|va");
        } catch (AssertionFailedError error) {
            fail("set(\"Ja|va\") failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteLeft_transitions2_actions1(final LineEditor it) {
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

        assertTrue( this.operator_equals(it, "J|va"),"it == \"J|va\" failed after set(\"Ja|va\") ,deleteLeft");

    }

    private void _transition_exprAction__deleteRight_transitions0_actions0(final LineEditor it) {
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

        assertTrue(this.operator_equals(it, "|"),"it == \"|\" failed after deleteRight" );

    }

    private void _transition_exprAction__deleteRight_transitions1_actions0(final LineEditor it) {
        try {

            this.set("|J");
        } catch (AssertionFailedError error) {
            fail("set(\"|J\") failed: " + error.getMessage());
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

        assertTrue( this.operator_equals(it, "|"),"it == \"|\" failed after set(\"|J\") ,deleteRight");

    }

    private void _transition_exprAction__deleteRight_transitions2_actions0(final LineEditor it) {
        try {

            this.set("J|ava");
        } catch (AssertionFailedError error) {
            fail("set(\"J|ava\") failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__deleteRight_transitions2_actions1(final LineEditor it) {
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

        assertTrue(this.operator_equals(it, "J|va"),"it == \"J|va\" failed after set(\"J|ava\") ,deleteRight" );

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

        assertTrue(this.operator_equals(it, "|"),"it == \"|\" failed after insertString(\"\")");

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

        assertTrue(this.operator_equals(it, "Java|"),"it == \"Java|\" failed after insertString(\"Java\")" );

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

        assertTrue(
                this.operator_equals(it, "Java er g\u00F8y!|"),"it == \"Java er gøy!|\" failed after insertString(\" er gøy!\")");

    }

    private void _transition_exprAction__insertString_transitions3_actions0(final LineEditor it) {
        try {

            this.set("Java|g\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("set(\"Java|gøy!\") failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions3_actions1(final LineEditor it) {
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

        assertTrue(
                this.operator_equals(it, "Java er |g\u00F8y!"),"it == \"Java er |gøy!\" failed after set(\"Java|gøy!\") ,insertString(\" er \")");

    }

    private void _transition_exprAction__insertString_transitions4_actions0(final LineEditor it) {
        try {

            this.set("|er g\u00F8y!");
        } catch (AssertionFailedError error) {
            fail("set(\"|er gøy!\") failed: " + error.getMessage());
        }

    }

    private void _transition_exprAction__insertString_transitions4_actions1(final LineEditor it) {
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

        assertTrue(
                this.operator_equals(it, "Java |er g\u00F8y!"),"it == \"Java |er gøy!\" failed after set(\"|er gøy!\") ,insertString(\"Java \")");

    }
}
