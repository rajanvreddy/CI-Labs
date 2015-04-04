package TempConv;
import java.util.*;
 
public class App
{
  private double temp;
  public App (double t) {
     temp = t;
  }
 
  public double FtoC () {
    return (temp - 32) * 5/9.0;
  }
 
  public double CtoF() {
    return (9/5.0 * temp) - 32;
  }
}
