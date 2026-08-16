package task2;

public class Task30_40 {

    private int a;
    private int b;
    private int c;
    private int d;

    public Task30_40(int a, int b, int c,int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }

    public void bigger() {
        if (this.a <= this.b && this.c <= this.b && this.d <= this.b) {
            System.out.println("bigger is: " + this.b);

        } else if (this.a <= this.c && this.b <= this.c && this.d <= this.c) {
            System.out.println("bigger is: " + this.c);

        } else if (this.a <=this.d && this.b <= this.d && this.c <= this.d) {
            System.out.println("bigger is: " + this.d);

        } else {

            System.out.println("bigger is " + this.a);

        }

    }

    public void smaller() {
        if (this.a >= this.b && this.c >= this.b && this.d >= this.b) {
            System.out.println("smaller is: " + this.b);

        } else if (this.a >= this.c && this.b >= this.c && this.d >= this.c) {
            System.out.println("smaller is: " + this.c);

        } else if (this.a >=this.d && this.b >= this.d && this.c >= this.d) {
            System.out.println("smaller is: " + this.d);

        } else {

            System.out.println("smaller is " + this.a);

        }

    }

    public boolean isEqualOne() {
        boolean t = this.a == 1 || this.c == 1 || this.b == 1 || this.d == 1;
        return t;


    }


    public boolean isEqualTwo() {
        boolean t = this.a + this.b == this.c + this.d || this.a + this.c == this.d + this.b || this.a + this.d == this.c + this.b ;
        return t;


    }

    public boolean isEqualSum() {
        boolean t =  this.a == this.b + this.c + this.d ||
                     this.b == this.a + this.c + this.d ||
                     this.c == this.b + this.d + this.a ||
                     this.d == this.a + this.b + this.c;
        return t;


    }

    public void isOdd() {
        int i =0;
        if (this.a % 2 != 0) {
            i++;
        }
        if(this.b % 2 != 0) {
            i++;

        }
        if(this.c % 2 != 0) {
            i++;
        }
        if(this.d % 2 != 0) {
            i++;
        }
        if(i>2) {
            System.out.println("1");

        }
        else{

            System.out.println("2");
        }

    }

    public boolean isArithmeticProgression() {
        boolean t = false;
        t = this.b - this.a == this.c - this.b && this.c - this.b == this.d-this.c;
        return t;

    }

    public boolean isGeometricProgression() {
        boolean t = false;
        t = this.b / this.a == this.c / this.b && this.c / this.b == this.d / this.c;
        return t;

    }

    public void achmanKarg() {


        int[] arr = {this.a, this.b, this.c, this.d};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void nvazmanKarg() {


        int[] arr = {this.a, this.b, this.c,this.d};

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


