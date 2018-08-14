
import java.util.Scanner;

public class CpUI {

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
        return discomportIndexer.calculate(degree, humidity);
    }
}


