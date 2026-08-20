public class ExtraTask2 {
    public static void main(String[] args) {
        int[] array1 = {15, 7, 15, 9, 7};
        int range = array1[0];
        for (int i = 1; i < array1.length; i++) {
            range = range ^ array1[i];
        }
        System.out.println(range);

        int[] arr = {55555, 2, 4, 22, 43, 53, 343, 553, 234, 321, 343, 2, 234, 4342, 423, 4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }


        }
        int secondMax = 0;
        for (int i = 1; i < arr.length - 1; i+=2) {
            if (max - arr[i] < max - arr[i+1] && max - arr[i] != 0  ) {
                secondMax = arr[i];
            }


        }
        System.out.println(secondMax);


        System.out.println(max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        int[][] matrix = {{1, 2, 3, 1}, {4, 5, 6, 2}, {7, 8, 9, 3}, {8, 5, 9, 4}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  ".repeat(i));
            for (int j = i; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();



        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  ".repeat(i));

            System.out.println(matrix[i][i]);

        }
        System.out.println();





int iteration = 0;
        for (int i = matrix.length -1; i >= 0; i--) {
            System.out.print("  ".repeat(i));

            System.out.println(matrix[iteration][i]);
            iteration++;

        }
        System.out.println();


    }


}





