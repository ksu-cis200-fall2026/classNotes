public class Vector3 {
    public static final int SIZE = 3;

    public static double[] addVectors(double[] vector1, double[] vector2) {
        //assumes both arrays have size 3
        double[] added = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            added[i] = vector1[i] + vector2[i];
        }

        return added;
    }

    public static double magnitude(double[] vector) {
        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            sum += vector[i]*vector[i];
        }

        return Math.sqrt(sum);
    }

    //updates the parameter vector to be normalized
    public static void normalize(double[] vector) {
        double mag = magnitude(vector);

        for (int i = 0; i < SIZE; i++) {
            vector[i] = vector[i]/mag;
        }
    }

    public static void printVector(double[] vector) {
        System.out.print("(");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%.2f", vector[i]);
            if (i < vector.length-1) {
                System.out.print(", ");
            }
            else {
                System.out.println(")");
            }
        }
    }
}