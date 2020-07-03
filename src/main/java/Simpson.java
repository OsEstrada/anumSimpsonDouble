

/**
 *
 * @author oscar
 */
public abstract class Simpson {
    public double integral(double a, double b, int n, int m){
        double h=(b-a)/(2*n);
        double J1=0.0, J2=0.0, J3=0.0;
        double x, y;
        double HX, K1, K2, K3, Q, L;
        for(int i=0; i<=2*n; i++){
            x=a+i*h;
            HX=(d(x)-c(x))/(2*m);
            K1=f(x, c(x))+f(x, d(x));
            K2=0.0;
            K3=0.0;
            for(int j=1; j<=2*m-1; j++){
                y=c(x)+j*HX;
                Q=f(x, y);
                if(j%2==0) K2+=Q;
                else K3+=Q;
            }
            L=(K1+2*K2+4*K3)*HX/3;
            if(i==0 || i==2*n)  J1+=L;
            else{
              if(i%2==0) J2+=L;
              else J3+=L;
           }
        }
        double J=h*(J1+2*J2+4*J3)/3;
        return J;
    }
    abstract public double f(double x, double y);
    abstract public double c(double x);
    abstract public double d(double x);
}
