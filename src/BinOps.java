public class BinOps {

    public String sum(String a, String b) {
        int binStringA = in(a);
        int binStringB = in(b);

        int resultSum = binStringA + binStringB;

        String res = from(resultSum);

        return res;
    }

    public String mult(String a, String b) {
        int binStringA = in(a);
        int binStringB = in(b);

        int resultMult = binStringA * binStringB;

        String res = from(resultMult);

        return res;
    }

    public int in(String value) {
        return Integer.parseInt(value, 2);
    }

    public String from(int result) {
        return Integer.toBinaryString(result);
    }
}