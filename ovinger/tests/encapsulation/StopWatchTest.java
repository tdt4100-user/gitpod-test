package encapsulation;

import static org.junit.jupiter.api.Assertions.fail;
import static assertions.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import encapsulation.StopWatch;

public class StopWatchTest {
  private StopWatch stopWatch;

  @BeforeEach
  protected void setUp() {
    stopWatch = new StopWatch();

  }
  @Test
  public void testTicks() {
    _test__ticks_transitions0_effects0_state(stopWatch);
    _transition_exprAction__ticks_transitions1_actions0(stopWatch);
    _test__ticks_transitions1_effects0_state(stopWatch);
    _transition_exprAction__ticks_transitions2_actions0(stopWatch);
    _test__ticks_transitions2_effects0_state(stopWatch);
    try {
      _transition_exprAction__ticks_transitions3_actions0(stopWatch);
      fail("IllegalArgumentException should be thrown after tick(-1)");
    } catch (Exception e) {
      _assertTrue("IllegalArgumentException should be thrown after tick(-1)", e instanceof IllegalArgumentException);
    }

  }

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

 @Test
  public void testStartStart() {
    _transition_exprAction__startStart_transitions0_actions0(stopWatch);
    _test__startStart_transitions0_effects0_state(stopWatch);
    try {
      _transition_exprAction__startStart_transitions1_actions0(stopWatch);
      fail("IllegalStateException should be thrown after start");
    } catch (Exception e) {
      _assertTrue("IllegalStateException should be thrown after start", e instanceof IllegalStateException);
    }

  }

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

  @Test
  public void testStop() {
    _test__stop_transitions0_effects0_state(stopWatch);
    try {
      _transition_exprAction__stop_transitions1_actions0(stopWatch);
      fail("IllegalStateException should be thrown after stop");
    } catch (Exception e) {
      _assertTrue("IllegalStateException should be thrown after stop", e instanceof IllegalStateException);
    }

  }

  @Test
  public void testStartStopStop() {
    _transition_exprAction__startStopStop_transitions0_actions0(stopWatch);
    _test__startStopStop_transitions0_effects0_state(stopWatch);
    _transition_exprAction__startStopStop_transitions1_actions0(stopWatch);
    _test__startStopStop_transitions1_effects0_state(stopWatch);
    try {
      _transition_exprAction__startStopStop_transitions2_actions0(stopWatch);
      fail("IllegalStateException should be thrown after stop");
    } catch (Exception e) {
      _assertTrue("IllegalStateException should be thrown after stop", e instanceof IllegalStateException);
    }

  }

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

  @Test
  public void testLap() {
    try {
      _transition_exprAction__lap_transitions0_actions0(stopWatch);
      fail("IllegalStateException should be thrown after lap");
    } catch (Exception e) {
      _assertTrue("IllegalStateException should be thrown after lap", e instanceof IllegalStateException);
    }

  }

  @Test
  public void testStartStopLap() {
    _transition_exprAction__startStopLap_transitions0_actions0(stopWatch);
    _test__startStopLap_transitions0_effects0_state(stopWatch);
    _transition_exprAction__startStopLap_transitions1_actions0(stopWatch);
    _test__startStopLap_transitions1_effects0_state(stopWatch);
    try {
      _transition_exprAction__startStopLap_transitions2_actions0(stopWatch);
      fail("IllegalStateException should be thrown after lap");
    } catch (Exception e) {
      _assertTrue("IllegalStateException should be thrown after lap", e instanceof IllegalStateException);
    }

  }

  private void _test__ticks_transitions0_effects0_state(final StopWatch it) {
    _test__ticks_transitions0_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__ticks_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

    int _ticks = it.getTicks();
    _assertEquals("ticks == 0 failed", 0, _ticks);

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
    _assertEquals("ticks == 1 failed after tick(1)", 1, _ticks);

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
    _assertEquals("ticks == 5 failed after tick(4)", 5, _ticks);

  }

  private void _transition_exprAction__ticks_transitions3_actions0(final StopWatch it) {
    try {

      it.tick((-1));
      } catch (AssertionFailedError error) {
      fail("tick(-1) failed: " + error.getMessage());
    }

  }

  private void _test__startTickStop_transitions0_effects0_state(final StopWatch it) {
    _test__startTickStop_transitions0_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__startTickStop_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    boolean _not = (!_isStarted);
    _assertTrue("! isStarted failed", _not);

    boolean _isStopped = it.isStopped();
    _assertTrue("! isStopped failed", (!_isStopped));

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
    _assertTrue("isStarted failed after start()", _isStarted);

    boolean _isStopped = it.isStopped();
    boolean _not = (!_isStopped);
    _assertTrue("! isStopped failed after start()", _not);

    int _time = it.getTime();
    _assertEquals("time == 0 failed after start()", 0, _time);

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
    _assertEquals("ticks == 3 failed after tick(3)", 3, _ticks);

    int _time = it.getTime();
    _assertEquals("time == 3 failed after tick(3)", 3, _time);

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
    _assertEquals("ticks == 8 failed after tick(5)", 8, _ticks);

    int _time = it.getTime();
    _assertEquals("time == 8 failed after tick(5)", 8, _time);

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
    _assertEquals("ticks == 8 failed after stop()", 8, _ticks);

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after stop()", _isStarted);

    boolean _isStopped = it.isStopped();
    _assertTrue("isStopped failed after stop()", _isStopped);

    int _time = it.getTime();
    _assertEquals("time == 8 failed after stop()", 8, _time);

  }

  private void _transition_exprAction__startStart_transitions0_actions0(final StopWatch it) {
    try {

      it.start();
      } catch (AssertionFailedError error) {
      fail("start failed: " + error.getMessage());
    }

  }

  private void _test__startStart_transitions0_effects0_state(final StopWatch it) {
    _test__startStart_transitions0_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__startStart_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after start", _isStarted);

    boolean _isStopped = it.isStopped();
    boolean _not = (!_isStopped);
    _assertTrue("! isStopped failed after start", _not);

    int _time = it.getTime();
    _assertEquals("time == 0 failed after start", 0, _time);

  }

  private void _transition_exprAction__startStart_transitions1_actions0(final StopWatch it) {
    try {

      it.start();
      } catch (AssertionFailedError error) {
      fail("start failed: " + error.getMessage());
    }

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
    _assertEquals("ticks == 4 failed after tick(4)", 4, _ticks);

    int _time = it.getTime();
    _assertEquals("time == -1 failed after tick(4)", (-1), _time);

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
    _assertEquals("ticks == 4 failed after start()", 4, _ticks);

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after start()", _isStarted);

    boolean _isStopped = it.isStopped();
    boolean _not = (!_isStopped);
    _assertTrue("! isStopped failed after start()", _not);

    int _time = it.getTime();
    _assertEquals("time == 0 failed after start()", 0, _time);

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
    _assertEquals("ticks == 4 failed after stop()", 4, _ticks);

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after stop()", _isStarted);

    boolean _isStopped = it.isStopped();
    _assertTrue("isStopped failed after stop()", _isStopped);

    int _time = it.getTime();
    _assertEquals("time == 0 failed after stop()", 0, _time);

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
    _assertEquals("ticks == 11 failed after tick(7)", 11, _ticks);

    int _time = it.getTime();
    _assertEquals("time == 0 failed after tick(7)", 0, _time);

  }

  private void _test__stop_transitions0_effects0_state(final StopWatch it) {
    _test__stop_transitions0_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__stop_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    boolean _not = (!_isStarted);
    _assertTrue("! isStarted failed", _not);

    boolean _isStopped = it.isStopped();
    _assertTrue("! isStopped failed", (!_isStopped));

  }

  private void _transition_exprAction__stop_transitions1_actions0(final StopWatch it) {
    try {

      it.stop();
      } catch (AssertionFailedError error) {
      fail("stop failed: " + error.getMessage());
    }

  }

  private void _transition_exprAction__startStopStop_transitions0_actions0(final StopWatch it) {
    try {

      it.start();
      } catch (AssertionFailedError error) {
      fail("start failed: " + error.getMessage());
    }

  }

  private void _test__startStopStop_transitions0_effects0_state(final StopWatch it) {
    _test__startStopStop_transitions0_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__startStopStop_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after start", _isStarted);

    boolean _isStopped = it.isStopped();
    _assertTrue("! isStopped failed after start", (!_isStopped));

  }

  private void _transition_exprAction__startStopStop_transitions1_actions0(final StopWatch it) {
    try {

      it.stop();
      } catch (AssertionFailedError error) {
      fail("stop failed: " + error.getMessage());
    }

  }

  private void _test__startStopStop_transitions1_effects0_state(final StopWatch it) {
    _test__startStopStop_transitions1_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__startStopStop_transitions1_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after stop", _isStarted);

    _assertTrue("isStopped failed after stop", it.isStopped());

  }

  private void _transition_exprAction__startStopStop_transitions2_actions0(final StopWatch it) {
    try {

      it.stop();
      } catch (AssertionFailedError error) {
      fail("stop failed: " + error.getMessage());
    }

  }

  private void _test__startLapStop_transitions0_effects0_state(final StopWatch it) {
    _test__startLapStop_transitions0_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__startLapStop_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    boolean _not = (!_isStarted);
    _assertTrue("! isStarted failed", _not);

    boolean _isStopped = it.isStopped();
    boolean _not_1 = (!_isStopped);
    _assertTrue("! isStopped failed", _not_1);

    int _lapTime = it.getLapTime();
    _assertEquals("lapTime == -1 failed", (-1), _lapTime);

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
    _assertTrue("isStarted failed after start", _isStarted);

    boolean _isStopped = it.isStopped();
    boolean _not = (!_isStopped);
    _assertTrue("! isStopped failed after start", _not);

    int _time = it.getTime();
    _assertEquals("time == 0 failed after start", 0, _time);

    int _lapTime = it.getLapTime();
    _assertEquals("lapTime == 0 failed after start", 0, _lapTime);

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
    _assertEquals("time == 3 failed after tick(3)", 3, _time);

    int _lapTime = it.getLapTime();
    _assertEquals("lapTime == 3 failed after tick(3)", 3, _lapTime);

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
    _assertEquals("time == 3 failed after lap", 3, _time);

    int _lapTime = it.getLapTime();
    _assertEquals("lapTime == 0 failed after lap", 0, _lapTime);

    int _lastLapTime = it.getLastLapTime();
    _assertEquals("lastLapTime == 3 failed after lap", 3, _lastLapTime);

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
    _assertEquals("time == 5 failed after tick(2)", 5, _time);

    int _lastLapTime = it.getLastLapTime();
    _assertEquals("lastLapTime == 3 failed after tick(2)", 3, _lastLapTime);

    int _lapTime = it.getLapTime();
    _assertEquals("lapTime == 2 failed after tick(2)", 2, _lapTime);

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
    _assertTrue("isStarted failed after stop", _isStarted);

    boolean _isStopped = it.isStopped();
    _assertTrue("isStopped failed after stop", _isStopped);

    int _time = it.getTime();
    _assertEquals("time == 5 failed after stop", 5, _time);

    int _lastLapTime = it.getLastLapTime();
    _assertEquals("lastLapTime == 2 failed after stop", 2, _lastLapTime);

    int _lapTime = it.getLapTime();
    _assertEquals("lapTime == 0 failed after stop", 0, _lapTime);

  }

  private void _transition_exprAction__lap_transitions0_actions0(final StopWatch it) {
    try {

      it.lap();
      } catch (AssertionFailedError error) {
      fail("lap failed: " + error.getMessage());
    }

  }

  private void _transition_exprAction__startStopLap_transitions0_actions0(final StopWatch it) {
    try {

      it.start();
      } catch (AssertionFailedError error) {
      fail("start failed: " + error.getMessage());
    }

  }

  private void _test__startStopLap_transitions0_effects0_state(final StopWatch it) {
    _test__startStopLap_transitions0_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__startStopLap_transitions0_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after start", _isStarted);

    boolean _isStopped = it.isStopped();
    _assertTrue("! isStopped failed after start", (!_isStopped));

  }

  private void _transition_exprAction__startStopLap_transitions1_actions0(final StopWatch it) {
    try {

      it.stop();
      } catch (AssertionFailedError error) {
      fail("stop failed: " + error.getMessage());
    }

  }

  private void _test__startStopLap_transitions1_effects0_state(final StopWatch it) {
    _test__startStopLap_transitions1_effects0_state_objectTests0_test(stopWatch);

  }

  private void _test__startStopLap_transitions1_effects0_state_objectTests0_test(final StopWatch it) {

    boolean _isStarted = it.isStarted();
    _assertTrue("isStarted failed after stop", _isStarted);

    _assertTrue("isStopped failed after stop", it.isStopped());

  }

  private void _transition_exprAction__startStopLap_transitions2_actions0(final StopWatch it) {
    try {

      it.lap();
      } catch (AssertionFailedError error) {
      fail("lap failed: " + error.getMessage());
    }

  }
}
