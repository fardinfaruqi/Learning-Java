import java.util.*;

public class _028_MultiDimArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1; // Single dimentional array
        int[][] arr2 = new int[2][3]; // 2D array
        int[][][] arr3; // 3D array
        int[][][][] arr4 = new int[2][2][2][2]; // 4D array

        arr2[0][0] = 101;
        arr2[0][1] = 102;
        arr2[0][2] = 103;
        arr2[1][0] = 201;
        arr2[1][1] = 202;
        arr2[1][2] = 203;

        for (int[] row : arr2) {
            for (int element : row) {
                System.out.println(element);
            }
        }

        int arr[][] = new int[2][2];
        for (int[] is : arr) {
            for (int i = 0; i < is.length; i++) {
                is[i] = sc.nextInt();
            }
        }
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.println(is2 + ", ");
            }
        }

        for (int[][][] is : arr4) {
            for (int[][] is2 : is) {
                for (int[] is3 : is2) {
                    for (int i = 0; i < is3.length; i++) {
                        is3[i] = sc.nextInt();
                    }
                }
            }
        }

        for (int[][][] is : arr4) {
            for (int[][] is2 : is) {
                for (int[] is3 : is2) {
                    for (int is4 : is3) {
                        System.out.print(is4 + ", ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}