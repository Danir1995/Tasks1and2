public class Main {

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        System.out.println(taskOne.solution("216844139"));//4
        System.out.println(taskOne.solution("77"));//1
        System.out.println(taskOne.solution("773922"));//3

        TaskTwo taskTwo = new TaskTwo();
        System.out.println(taskTwo.solution(new int[]{-1, 1, -2}, new int[]{2, 1, 0})); // true
        System.out.println(taskTwo.solution(new int[]{-10, -10, -9}, new int[]{-10, 10, 5})); // true
        System.out.println(taskTwo.solution(new int[]{-1, 1, 1, -1, 0}, new int[]{1, 1, -1, -1, 0})); // false
        System.out.println(taskTwo.solution(new int[]{-1, 1, -2, 2, -2, 2}, new int[]{1, -1, -1, 1, 1, -1})); // false
        System.out.println(taskTwo.solution(new int[]{2, 3, 4}, new int[]{2, 4, 6})); // false
        System.out.println(taskTwo.solution(new int[]{2, 2, 9, 9}, new int[]{-2, -5, -1, -3})); // true
        System.out.println(taskTwo.solution(new int[]{3,5,5,8}, new int[]{1,1,3,3})); // false
        System.out.println(taskTwo.solution(new int[]{2,2,4,6,6,}, new int[]{0,3,4,3,0})); // true
        System.out.println(taskTwo.solution(new int[]{3,3,5,7,7}, new int[]{-3,-6,-1,-3,-6})); // false
        System.out.println(taskTwo.solution(new int[]{10,10,12,16}, new int[]{2,4,4,4})); // true
    }
}

