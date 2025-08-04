public class Main {
    public static double predictedvalue(double curr,double growth,int years){
        if(years==0){
            return curr;
        }

        return predictedvalue(curr*(1+growth),growth,years-1);
    }

    public static void main(String[] args) {

        double curr=1000;
        double growthrate=0.10;
        int years= 3;

        double future=predictedvalue(curr,growthrate,years);
        System.out.printf("Predicted Future Value after %d years: %.2f\n", years, future);
    }
}