

/**
 * @author oscar
 */
public class Funcion extends Simpson {
    public double f(double x, double y) {
        //return Math.sqrt(x) * Math.pow(y, 2);
        return Math.pow(x,2) + Math.pow(y, 3);
    }

    public double c(double x) {
        return (x);
    }

    public double d(double x) {
        return (2*x);
    }

}
