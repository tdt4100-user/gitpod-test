package stateandbehavior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class StopWatchTest {
    private StopWatch stopWatch;

    @BeforeEach
    protected void setUp() {
        stopWatch = new StopWatch();

    }

    // @JExercise(tests = "void tick(int)", description = "Tests \n\t\tthe following
    // sequence:\n\t\t<ul>\n\t\t<li>1 time unit passes: tick(1)</li>\n\t\t<li>4 time
    // units passes: tick(4)</li>\n\t\t</ul>\n")
    @Test
    public void testTicks() {
        _test__ticks_transitions0_effects0_state(stopWatch);
        _transition_exprAction__ticks_transitions1_actions0(stopWatch);
        _test__ticks_transitions1_effects0_state(stopWatch);
        _transition_exprAction__ticks_transitions2_actions0(stopWatch);
        _test__ticks_transitions2_effects0_state(stopWatch);

    }

    // @JExercise(tests = "void start();void tick(int);void stop()", description =
    // "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Start timer:
    // start()</li>\n\t\t<li>3 time units passes: tick(3)</li>\n\t\t<li>5 time units
    // passes: tick(5)</li>\n\t\t<li>Stop timer: stop()</li>\n\t\t</ul>\n")
    @Test
    public void testStartTickStop() {
        _test__startTickStop_transitions0_effects0_state(stopWatch);
        _transition_exprAction__startTickStop_transitions1_actions0(stopWatch);
        _test__startTickStop_transitions1_effects0_state(stopWatch);
        _transition_exprAction__startTickStop_transitions2_actions0(stopWatch);
        _test__startTickStop_transitions2_effects0_state(stopWatch);
        _transition_exprAction__startTickStop_transitions3_actions0(stopWatch);
        _test__startTickStop_transitions3_effects0_state(stopWatch);
        _transition_exprAction__startTickStop_transitions4_actions0(stopWatch);
        _test__startTickStop_transitions4_effects0_state(stopWatch);

    }

    // @JExercise(tests = "void tick(int);void start();void stop()", description =
    // "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>4 time units passes:
    // tick(4)</li>\n\t\t<li>Start timer: start()</li>\n\t\t<li>Stop timer:
    // stop()</li>\n\t\t<li>7 time units passes: tick(7)</li>\n\t\t</ul>\n")
    @Test
    public void testTickStartStopTick() {
        _transition_exprAction__tickStartStopTick_transitions0_actions0(stopWatch);
        _test__tickStartStopTick_transitions0_effects0_state(stopWatch);
        _transition_exprAction__tickStartStopTick_transitions1_actions0(stopWatch);
        _test__tickStartStopTick_transitions1_effects0_state(stopWatch);
        _transition_exprAction__tickStartStopTick_transitions2_actions0(stopWatch);
        _test__tickStartStopTick_transitions2_effects0_state(stopWatch);
        _transition_exprAction__tickStartStopTick_transitions3_actions0(stopWatch);
        _test__tickStartStopTick_transitions3_effects0_state(stopWatch);

    }

    // @JExercise(tests = "void start();void tick(int);void lap();void stop()",
    // description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Start
    // timer: start</li>\n\t\t<li>3 time units passes: tick(3)</li>\n\t\t<li>Stop
    // implicit lap and start new one: lap</li>\n\t\t<li>2 time units passes:
    // tick(2)</li>\n\t\t<li>Stop timer and implicitly lap: stop</li>\n\t\t</ul>\n")
    @Test
    public void testStartLapStop() {
        _test__startLapStop_transitions0_effects0_state(stopWatch);
        _transition_exprAction__startLapStop_transitions1_actions0(stopWatch);
        _test__startLapStop_transitions1_effects0_state(stopWatch);
        _transition_exprAction__startLapStop_transitions2_actions0(stopWatch);
        _test__startLapStop_transitions2_effects0_state(stopWatch);
        _transition_exprAction__startLapStop_transitions3_actions0(stopWatch);
        _test__startLapStop_transitions3_effects0_state(stopWatch);
        _transition_exprAction__startLapStop_transitions4_actions0(stopWatch);
        _test__startLapStop_transitions4_effects0_state(stopWatch);
        _transition_exprAction__startLapStop_transitions5_actions0(stopWatch);
        _test__startLapStop_transitions5_effects0_state(stopWatch);

    }

    private void _test__ticks_transitions0_effects0_state(final StopWatch it) {
        _test__ticks_transitions0_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__ticks_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(0, _ticks, "ticks == 0 failed");

    }

    private void _transition_exprAction__ticks_transitions1_actions0(final StopWatch it) {
        try {

            it.tick(1);
        } catch (AssertionFailedError error) {
            fail("tick(1) failed: " + error.getMessage());
        }

    }

    private void _test__ticks_transitions1_effects0_state(final StopWatch it) {
        _test__ticks_transitions1_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__ticks_transitions1_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(1, _ticks, "ticks == 1 failed after tick(1)");

    }

    private void _transition_exprAction__ticks_transitions2_actions0(final StopWatch it) {
        try {

            it.tick(4);
        } catch (AssertionFailedError error) {
            fail("tick(4) failed: " + error.getMessage());
        }

    }

    private void _test__ticks_transitions2_effects0_state(final StopWatch it) {
        _test__ticks_transitions2_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__ticks_transitions2_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(5, _ticks, "ticks == 5 failed after tick(4)");

    }

    private void _test__startTickStop_transitions0_effects0_state(final StopWatch it) {
        _test__startTickStop_transitions0_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startTickStop_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

        boolean _isStarted = it.isStarted();
        boolean _not = (!_isStarted);
        assertTrue(_not, "! isStarted failed");

        boolean _isStopped = it.isStopped();
        assertTrue((!_isStopped), "! isStopped failed");

    }

    private void _transition_exprAction__startTickStop_transitions1_actions0(final StopWatch it) {
        try {

            it.start();
        } catch (AssertionFailedError error) {
            fail("start() failed: " + error.getMessage());
        }

    }

    private void _test__startTickStop_transitions1_effects0_state(final StopWatch it) {
        _test__startTickStop_transitions1_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startTickStop_transitions1_effects0_state_objectTests0_test(final StopWatch it) {

        boolean _isStarted = it.isStarted();
        assertTrue(_isStarted, "isStarted failed after start()");

        boolean _isStopped = it.isStopped();
        boolean _not = (!_isStopped);
        assertTrue(_not, "! isStopped failed after start()");

        int _time = it.getTime();
        assertEquals(0, _time, "time == 0 failed after start()");

    }

    private void _transition_exprAction__startTickStop_transitions2_actions0(final StopWatch it) {
        try {

            it.tick(3);
        } catch (AssertionFailedError error) {
            fail("tick(3) failed: " + error.getMessage());
        }

    }

    private void _test__startTickStop_transitions2_effects0_state(final StopWatch it) {
        _test__startTickStop_transitions2_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startTickStop_transitions2_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(3, _ticks, "ticks == 3 failed after tick(3)");

        int _time = it.getTime();
        assertEquals(3, _time, "time == 3 failed after tick(3)");

    }

    private void _transition_exprAction__startTickStop_transitions3_actions0(final StopWatch it) {
        try {

            it.tick(5);
        } catch (AssertionFailedError error) {
            fail("tick(5) failed: " + error.getMessage());
        }

    }

    private void _test__startTickStop_transitions3_effects0_state(final StopWatch it) {
        _test__startTickStop_transitions3_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startTickStop_transitions3_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(8, _ticks, "ticks == 8 failed after tick(5)");

        int _time = it.getTime();
        assertEquals(8, _time, "time == 8 failed after tick(5)");

    }

    private void _transition_exprAction__startTickStop_transitions4_actions0(final StopWatch it) {
        try {

            it.stop();
        } catch (AssertionFailedError error) {
            fail("stop() failed: " + error.getMessage());
        }

    }

    private void _test__startTickStop_transitions4_effects0_state(final StopWatch it) {
        _test__startTickStop_transitions4_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startTickStop_transitions4_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(8, _ticks, "ticks == 8 failed after stop()");

        boolean _isStarted = it.isStarted();
        assertTrue(_isStarted, "isStarted failed after stop()");

        boolean _isStopped = it.isStopped();
        assertTrue(_isStopped, "isStopped failed after stop()");

        int _time = it.getTime();
        assertEquals(8, _time, "time == 8 failed after stop()");

    }

    private void _transition_exprAction__tickStartStopTick_transitions0_actions0(final StopWatch it) {
        try {

            it.tick(4);
        } catch (AssertionFailedError error) {
            fail("tick(4) failed: " + error.getMessage());
        }

    }

    private void _test__tickStartStopTick_transitions0_effects0_state(final StopWatch it) {
        _test__tickStartStopTick_transitions0_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__tickStartStopTick_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(4, _ticks, "ticks == 4 failed after tick(4)");

        int _time = it.getTime();
        assertEquals((-1), _time, "time == -1 failed after tick(4)");

    }

    private void _transition_exprAction__tickStartStopTick_transitions1_actions0(final StopWatch it) {
        try {

            it.start();
        } catch (AssertionFailedError error) {
            fail("start() failed: " + error.getMessage());
        }

    }

    private void _test__tickStartStopTick_transitions1_effects0_state(final StopWatch it) {
        _test__tickStartStopTick_transitions1_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__tickStartStopTick_transitions1_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(4, _ticks, "ticks == 4 failed after start()");

        boolean _isStarted = it.isStarted();
        assertTrue(_isStarted, "isStarted failed after start()");

        boolean _isStopped = it.isStopped();
        boolean _not = (!_isStopped);
        assertTrue(_not, "! isStopped failed after start()");

        int _time = it.getTime();
        assertEquals(0, _time, "time == 0 failed after start()");

    }

    private void _transition_exprAction__tickStartStopTick_transitions2_actions0(final StopWatch it) {
        try {

            it.stop();
        } catch (AssertionFailedError error) {
            fail("stop() failed: " + error.getMessage());
        }

    }

    private void _test__tickStartStopTick_transitions2_effects0_state(final StopWatch it) {
        _test__tickStartStopTick_transitions2_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__tickStartStopTick_transitions2_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(4, _ticks, "ticks == 4 failed after stop()");

        boolean _isStarted = it.isStarted();
        assertTrue(_isStarted, "isStarted failed after stop()");

        boolean _isStopped = it.isStopped();
        assertTrue(_isStopped, "isStopped failed after stop()");

        int _time = it.getTime();
        assertEquals(0, _time, "time == 0 failed after stop()");

    }

    private void _transition_exprAction__tickStartStopTick_transitions3_actions0(final StopWatch it) {
        try {

            it.tick(7);
        } catch (AssertionFailedError error) {
            fail("tick(7) failed: " + error.getMessage());
        }

    }

    private void _test__tickStartStopTick_transitions3_effects0_state(final StopWatch it) {
        _test__tickStartStopTick_transitions3_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__tickStartStopTick_transitions3_effects0_state_objectTests0_test(final StopWatch it) {

        int _ticks = it.getTicks();
        assertEquals(11, _ticks, "ticks == 11 failed after tick(7)");

        int _time = it.getTime();
        assertEquals(0, _time, "time == 0 failed after tick(7)");

    }

    private void _test__startLapStop_transitions0_effects0_state(final StopWatch it) {
        _test__startLapStop_transitions0_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startLapStop_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

        int _lapTime = it.getLapTime();
        assertEquals((-1), _lapTime, "lapTime == -1 failed");

    }

    private void _transition_exprAction__startLapStop_transitions1_actions0(final StopWatch it) {
        try {

            it.start();
        } catch (AssertionFailedError error) {
            fail("start failed: " + error.getMessage());
        }

    }

    private void _test__startLapStop_transitions1_effects0_state(final StopWatch it) {
        _test__startLapStop_transitions1_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startLapStop_transitions1_effects0_state_objectTests0_test(final StopWatch it) {

        boolean _isStarted = it.isStarted();
        assertTrue(_isStarted, "isStarted failed after start");

        boolean _isStopped = it.isStopped();
        boolean _not = (!_isStopped);
        assertTrue(_not, "! isStopped failed after start");

        int _time = it.getTime();
        assertEquals(0, _time, "time == 0 failed after start");

        int _lapTime = it.getLapTime();
        assertEquals(0, _lapTime, "lapTime == 0 failed after start");

    }

    private void _transition_exprAction__startLapStop_transitions2_actions0(final StopWatch it) {
        try {

            it.tick(3);
        } catch (AssertionFailedError error) {
            fail("tick(3) failed: " + error.getMessage());
        }

    }

    private void _test__startLapStop_transitions2_effects0_state(final StopWatch it) {
        _test__startLapStop_transitions2_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startLapStop_transitions2_effects0_state_objectTests0_test(final StopWatch it) {

        int _time = it.getTime();
        assertEquals(3, _time, "time == 3 failed after tick(3)");

        int _lapTime = it.getLapTime();
        assertEquals(3, _lapTime, "lapTime == 3 failed after tick(3)");

    }

    private void _transition_exprAction__startLapStop_transitions3_actions0(final StopWatch it) {
        try {

            it.lap();
        } catch (AssertionFailedError error) {
            fail("lap failed: " + error.getMessage());
        }

    }

    private void _test__startLapStop_transitions3_effects0_state(final StopWatch it) {
        _test__startLapStop_transitions3_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startLapStop_transitions3_effects0_state_objectTests0_test(final StopWatch it) {

        int _time = it.getTime();
        assertEquals(3, _time, "time == 3 failed after lap");

        int _lapTime = it.getLapTime();
        assertEquals(0, _lapTime, "lapTime == 0 failed after lap");

        int _lastLapTime = it.getLastLapTime();
        assertEquals(3, _lastLapTime, "lastLapTime == 3 failed after lap");

    }

    private void _transition_exprAction__startLapStop_transitions4_actions0(final StopWatch it) {
        try {

            it.tick(2);
        } catch (AssertionFailedError error) {
            fail("tick(2) failed: " + error.getMessage());
        }

    }

    private void _test__startLapStop_transitions4_effects0_state(final StopWatch it) {
        _test__startLapStop_transitions4_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startLapStop_transitions4_effects0_state_objectTests0_test(final StopWatch it) {

        int _time = it.getTime();
        assertEquals(5, _time, "time == 5 failed after tick(2)");

        int _lastLapTime = it.getLastLapTime();
        assertEquals(3, _lastLapTime, "lastLapTime == 3 failed after tick(2)");

        int _lapTime = it.getLapTime();
        assertEquals(2, _lapTime, "lapTime == 2 failed after tick(2)");

    }

    private void _transition_exprAction__startLapStop_transitions5_actions0(final StopWatch it) {
        try {

            it.stop();
        } catch (AssertionFailedError error) {
            fail("stop failed: " + error.getMessage());
        }

    }

    private void _test__startLapStop_transitions5_effects0_state(final StopWatch it) {
        _test__startLapStop_transitions5_effects0_state_objectTests0_test(stopWatch);

    }

    private void _test__startLapStop_transitions5_effects0_state_objectTests0_test(final StopWatch it) {

        boolean _isStarted = it.isStarted();
        assertTrue(_isStarted, "isStarted failed after stop");

        boolean _isStopped = it.isStopped();
        assertTrue(_isStopped, "isStopped failed after stop");

        int _time = it.getTime();
        assertEquals(5, _time, "time == 5 failed after stop");

        int _lastLapTime = it.getLastLapTime();
        assertEquals(2, _lastLapTime, "lastLapTime == 2 failed after stop");

        int _lapTime = it.getLapTime();
        assertEquals(0, _lapTime, "lapTime == 0 failed after stop");

    }
}
