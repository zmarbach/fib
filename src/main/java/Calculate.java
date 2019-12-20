public class Calculate {
    private String seq = "0,1";

    public String calculateFibSeqWithRecursion(int num1, int num2) {
        if (num1 < 21) {
            int nextNum = num1 + num2;
            seq += "," + nextNum;
            calculateFibSeqWithRecursion(num2, nextNum);
        }
        return seq;
    }

    public void calculateFibSeqNORecursion(int num1, int num2, int count) {
        int nextNum;
        System.out.print("Iterative: " + num1 + "," + num2);

        for (int i = 2; i < count ; i++) {
            nextNum = num1 + num2;
            System.out.print("," + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}
