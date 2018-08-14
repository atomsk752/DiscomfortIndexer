
import java.util.Scanner;

public class CpUI {
    double result = 0;
    DiscomportIndexer discomportIndexer;

    public CpUI(DiscomportIndexer discomportIndexer) {
        this.discomportIndexer = discomportIndexer;
    }

    public double input(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("input degree");
        double degree = Double.parseDouble(scanner.nextLine());
        System.out.println("input humidity");
        double humidity = Double.parseDouble(scanner.nextLine());
        result = discomportIndexer.calculate(degree, humidity);
        return result;
    }
    public void grade(){
        if(result <= 68) {
            System.out.println("LOW");
        }
        if(result <= 75 && result > 68){
            System.out.println("NOMAL");
        }
        if(result < 80 && result > 75){
            System.out.println("HIGH");
        }
        if (result >= 80){
            System.out.println("VERY HIGH");
        }

    }




    }








