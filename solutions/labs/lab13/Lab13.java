import java.util.*;

public class Lab13 {
    public static void main(String[] args) {
        if (args.length == 2) {
            double[] v1 = Parser.stringToArray(args[0]);
            double[] v2 = Parser.stringToArray(args[1]);

            double[] sum = Vector3.addVectors(v1, v2);
            System.out.print("Vector sum: ");
            Vector3.printVector(sum);

            System.out.print("\nNormalization of first vector: ");
            Vector3.normalize(v1);
            Vector3.printVector(v1);

            System.out.print("\nNormalization of second vector: ");
            Vector3.normalize(v2);
            Vector3.printVector(v2);
        }
        else {
            System.out.println("Error: run as java Lab13 \"(x1,y1,z1)\" \"(x2,y2,z2)\"");
        }
    }
}