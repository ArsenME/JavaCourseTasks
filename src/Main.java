import task1.Person;
import task2.ExtraTask;
import task2.Task21_30;
import task2.Task30_40;
import task2.Task51_60;

public class Main {
    public static void main(String[] args) {
        Person Arsen = new Person("Arsen","Melikyan",12,"Charencavan");
        Person Arman = new Person();
        Arsen.resume();
        Arman.resume();
        System.out.println("\n".repeat(2));

        Task21_30 a = new Task21_30(6,4,2);
        Task30_40 b = new Task30_40(4,-3,6,-7);
        a.bigger();
        a.smaller();
        System.out.println(a.isEqualOne());
        System.out.println(a.isEqualTwo());
        a.isTriangle();
        a.isEven();
        System.out.println(a.isArithmeticProgression());
        System.out.println(a.isGeometricProgression());
        a.achmanKarg();
        a.nvazmanKarg();

        System.out.println("\n".repeat(2));




        b.bigger();
        b.smaller();
        System.out.println(b.isEqualOne());
        System.out.println(b.isEqualTwo());
        b.isEqualSum();
        b.isOdd();
        System.out.println(b.isArithmeticProgression());
        System.out.println(b.isGeometricProgression());
        b.achmanKarg();
        b.nvazmanKarg();


        System.out.println("\n".repeat(2));

        Task51_60 d = new Task51_60(345);


        System.out.println(d.isEqual());

        System.out.println(d.isEqualTwoNum());
        System.out.println(d.dis(100));
        d.bigger();
        d.smaller();
        System.out.println(d.equal());
        System.out.println(d.isBiggerThan());
        System.out.println(d.problemFifthiEight());
        d.achmanKarg();
        System.out.println();
        d.nvazmanKarg();

        System.out.println("\n".repeat(2));

        ExtraTask lo = new ExtraTask(56223462);
        System.out.println(lo.reverse());



    }
}
