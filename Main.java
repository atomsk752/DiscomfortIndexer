public class Main {

    public static void main(String[] args) {

        double degree =0;
        double humidity =0;

        DiscomportIndexer dic = new DiscomportIndexer();

        CpUI cpUI = new CpUI(dic);

        System.out.println(cpUI.input());

    }
}
