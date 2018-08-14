public class DiscomportIndexer {


    public double calculate(double degree, double humidity){
        double result =0.81*degree+0.01*humidity*(0.99*degree-14.3)+46.3;
        //System.out.println(result);
        return result;
        //double result= ((9/5)*degree) - (0.55*(1-humidity)*(9/5*degree-26))+32;
    }

}
