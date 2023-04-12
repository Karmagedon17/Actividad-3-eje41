package mayorvalor;
public class calcularmayorvalor {
    public static double numeroMayor(double a,double b, double c){
        if ((a>b) && (a>c)){
            return a;
    }
        else if ((b>a) && (b>c)){
            return b;
        }
        else if ((a==b) && (a>c)){
            return a;
        }
        else{
            return c;
        }
    }
}
