

/**
 *
 * @author oscar
 */
public class Funcion extends Simpson{
   public double f(double x, double y){
    return Math.sqrt(x)*Math.pow(y, 2);
  }
  public double c(double x){
      return(-0.1);
  }
  public double d(double x){
      return(0.1);
  }
    
}
