public class Esercizio3 {

    public double perimetroRettangolo( double lato1, double lato2){
        return 2*lato1 + 2*lato2;

    }

    public int pariDispari( int nr){
        if(nr%2 == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public double perimetroTriangolo(double a, double b, double c){
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return -1;
    }
    }

