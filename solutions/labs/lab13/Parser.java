public class Parser {
    public static double[] stringToArray(String line) {
        String noParen = line.substring(1, line.length()-1);
        String[] pieces = noParen.split(",");

        double[] nums = new double[pieces.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Double.parseDouble(pieces[i]);
        }

        return nums;
    }
}