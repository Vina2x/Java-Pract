public class FuncToCalc_BinomialCoefficient {

    public static int factorial(int n){ // function to find individual coefficients
        int f=1;
        for (int i = 2; i <= n; i++) {
            f=f*i;
        }
        return f;
    }

    public static int Bincoff(int n, int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);

        int bincoeff= fact_n/(fact_r*fact_nmr);

        return bincoeff;
    }
    public static void main(String[] args) {
        System.out.println(Bincoff(5,2));
    }
}
