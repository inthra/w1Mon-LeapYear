import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumberDivisibleByFour_true() {
    assertEquals(true, LeapYear.isLeapYear(2012));
  }
  @Test
  public void isLeapYear_forNumberNotDivisibleByFour_false() {
    assertEquals(false, LeapYear.isLeapYear(2011));
  }
  @Test
  public void isLeapYear_forMultiplesOfOneHundred_false() {
    assertEquals(false, LeapYear.isLeapYear(1900));
  }
}
