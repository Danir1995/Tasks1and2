import java.util.*;


public class TaskTwo {

    public boolean solution(int[] X, int[] Y) {
        int arrayLength = X.length;

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < arrayLength; i++) {
            minX = Math.min(minX, X[i]);
            maxX = Math.max(maxX, X[i]);
            minY = Math.min(minY, Y[i]);
            maxY = Math.max(maxY, Y[i]);
        }

        // check for uncomfortable point
        for (int i = 0; i < arrayLength; i++) {
            if ((X[i] > minX && X[i] < maxX) && (Y[i] > minY && Y[i] < maxY)) {
                return false;
            }
        }

        if (arrayLength >= 4) {
            int sideLengthX = maxX - minX;
            int sideLengthY = maxY - minY;

            if (sideLengthX != sideLengthY) {
                Set<Integer> dotsY = new HashSet<>();
                Set<Integer> dotsX = new HashSet<>();

                for (int i = 0; i < arrayLength; i++) {
                    if (X[i] > minX && X[i] < maxX) {
                        dotsY.add(Y[i]);
                    }
                    if (Y[i] > minY && Y[i] < maxY) {
                        dotsX.add(X[i]);
                    }
                }

                if ((dotsY.size() >= 2 && sideLengthX > sideLengthY) ||
                        (dotsX.size() >= 2 && sideLengthX < sideLengthY)) {
                    return false;
                }
            }
        }

        return true;
    }
}
