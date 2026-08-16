package task2;

public class Task21_30 {
    private int a;
    private int b;
    private int c;

    public Task21_30(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void bigger() {
        if (this.a <= this.b && this.c <= this.b) {
            System.out.println("bigger is: " + this.b);

        } else if (this.a <= this.c && this.b <= this.c) {
            System.out.println("bigger is: " + this.c);

        } else {

            System.out.println("bigger is " + this.a);

        }

    }

    public void smaller() {
        if (this.a >= this.b && this.c >= this.b) {
            System.out.println("smaller is: " + this.b);

        } else if (this.a >= this.c && this.b >= this.c) {
            System.out.println("smaller is: " + this.c);

        } else {
            System.out.println("smaller is " + this.a);
        }

    }

    public boolean isEqualOne() {
        boolean t = this.a == 1 || this.c == 1 || this.b == 1;
        return t;


    }


    public boolean isEqualTwo() {
        boolean t = this.a == 2 && this.c == 2 || this.b == 2 && this.c == 2 || this.a == 2 && this.b == 2;
        return t;


    }

    public void isTriangle() {
        if (this.a > 0 && this.b > 0 && this.c > 0) {
            if (this.a + this.b > this.c && this.a + this.c > this.b && this.c + this.b > this.a) {
                System.out.println("Y = 1");
            } else {
                System.out.println("Y = 2");
            }
        } else {
            System.out.println("Y = 2");
        }


    }

    public void isEven() {
        if (this.a % 2 == 0 || this.b % 2 == 0 || this.c % 2 == 0) {
            System.out.println("1");

        }else{
            System.out.println("2");
        }

    }

    public boolean isArithmeticProgression() {
        boolean t = false;
        t = this.b - this.a == this.c - this.b;
        return t;

    }

    public boolean isGeometricProgression() {
        boolean t = false;
        t = this.b / this.a == this.c / this.b;
        return t;

    }

    public void achmanKarg() {


        int[] arr = {this.a, this.b, this.c};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void nvazmanKarg() {


        int[] arr = {this.a, this.b, this.c};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }


}


