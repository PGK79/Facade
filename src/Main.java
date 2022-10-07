public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String one = "1111"; //15
        String two = "110010"; //50

        System.out.println(bins.sum(one, two)); //65 = 1000001

        System.out.println(bins.mult(one, two)); // 750 = 1011101110
    }
}