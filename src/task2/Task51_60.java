package task2;

public class Task51_60 {
    private int num;


    public Task51_60(int num) {
        this.num = num;
        if (this.num < 100 || this.num > 999) {
            System.out.println("input number again 100 < number < 999");

        }

    }

    public int getMiavorner() {

        return this.num % 10;


    }


    public int getTasnavorner() {

        return this.num / 10 % 10;


    }

    public int getHarur() {

        return this.num / 100;


    }

    public boolean isEqual() {
        boolean t = getMiavorner() == getTasnavorner() + getHarur();
        return t;
    }

    public boolean isEqualTwoNum() {
        boolean t = getMiavorner() == getTasnavorner() || getHarur() == getTasnavorner() || getMiavorner() == getHarur();
        return t;
    }

    public float dis(float k) {
        if (this.num > k) {
            return (float) this.num / (getMiavorner() + getHarur() + getTasnavorner());
        } else {
            return (float) getMiavorner() / this.num;
        }
    }


    public void bigger() {
        if (getMiavorner() <= getTasnavorner() && getHarur() <= getTasnavorner()) {
            System.out.println("bigger is: " + getTasnavorner());
        } else if (getMiavorner() <= getHarur() && getTasnavorner() <= getHarur()) {
            System.out.println("bigger is: " + getHarur());

        } else {

            System.out.println("bigger is " + getMiavorner());

        }



    }
    public void smaller() {
        if (getMiavorner() >= getTasnavorner() && getHarur() >= getTasnavorner()) {
            System.out.println("smaller is: " + getTasnavorner());
        } else if (getMiavorner() >= getHarur() && getTasnavorner() >= getHarur()) {
            System.out.println("smaller is: " + getHarur());

        } else {

            System.out.println("smaller is " + getMiavorner());

        }



    }

    public float equal(){
        if(getMiavorner()>getTasnavorner()){
                return (float)(getMiavorner()+getMiavorner()+ getTasnavorner()) / this.num;
        }
        else{
            return this.num;
        }

    }

    public float isBiggerThan(){
        if(getMiavorner() != 0){
            if(this.num > 300){
                return (float)getTasnavorner()/getMiavorner();
            }
            else{
                return (float)getHarur()/getMiavorner();
            }

        }else{
            return 0;
        }


    }

    public char problemFifthiEight(){
        char f = 'b';
        if(getTasnavorner() + getHarur() < 5){
            f ='a';
        return f;
        }else{
            return f;
        }
    }

    public void achmanKarg() {


        int[] arr = {getHarur(), getTasnavorner(), getMiavorner()};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void nvazmanKarg() {


        int[] arr = {getHarur(), getTasnavorner(), getMiavorner()};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    }





