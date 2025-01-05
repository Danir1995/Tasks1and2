import java.util.*;


public class TaskTwo {

        public boolean solution(int[] X, int[] Y) {
            int n = X.length;

            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                minX = Math.min(minX, X[i]);
                maxX = Math.max(maxX, X[i]);
                minY = Math.min(minY, Y[i]);
                maxY = Math.max(maxY, Y[i]);
            }

            for (int i = 0; i < n; i++) {
                if ((X[i] > minX && X[i] < maxX) && (Y[i] > minY && Y[i] < maxY)) {
                    return false;
                }
            }

            if (n >= 4) {
                int sideLength = maxX - minX;
                int sideLength2 = maxY - minY;

                if (sideLength != maxY - minY) {
                    List<Integer> dotsY = new ArrayList<>();
                    List<Integer> dotsX = new ArrayList<>();

                    for (int i = 0; i < n; i++) {
                        if (X[i] > minX && X[i] < maxX) {
                            dotsY.add(Y[i]);
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        if (Y[i] > minY && Y[i] < maxY) {
                            dotsX.add(X[i]);
                        }
                    }

                    if (dotsY.stream().distinct().count() >= 2) {
                        int sideLengthY = dotsY.stream().mapToInt(Integer::intValue).max().orElseThrow()
                                - dotsY.stream().mapToInt(Integer::intValue).min().orElseThrow();
                        return sideLength == sideLengthY;
                    }else if(dotsX.stream().distinct().count() >= 2){
                        int sideLengthX = dotsX.stream().mapToInt(Integer::intValue).max().orElseThrow()
                                - dotsX.stream().mapToInt(Integer::intValue).min().orElseThrow();
                        return sideLength2 <= sideLengthX;
                    }

                }
            }

            return true;
        }
    }
