package task2;

public class ExtraTask {
    private int num ;

    public ExtraTask(int num){
        this.num = num;
    }

    public int reverse (){
        int newNum =0;
        while(this.num != 0){
            newNum = newNum *10;
           newNum += this.num % 10;
           this.num = this.num / 10;


        }
        return newNum;

    }

}
