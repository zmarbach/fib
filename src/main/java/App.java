public class App {


    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        var seq = calculate.calculateFibSeqWithRecursion(0,1);
        System.out.println("With Recursion: " + seq);

        System.out.println();

        calculate.calculateFibSeqNORecursion(0,1,10);
    }
}
