import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);
        intList.add(24);
        System.out.println(intList);

        Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        int sum = num1 + num2 + num3;

        numList.add(sum);

        System.out.println(numList);

        //--------------------------------
        ArrayList<Integer> numList2 = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(7);    //numList: [6, 3, 7]

        numList.add(2, 8);//numList: [6, 3, 8, 7]
        numList.set(3, 9);//numList: [6, 3, 8, 9]
        numList.add(1, 2);//numList: [6, 2, 3, 8, 9]
        numList.add(1, 5);//numList: [6, 5, 2, 3, 8, 9]

        numList.remove(4);//numList: [6, 5, 2, 3, 9]
        numList.set(4, 0);//numList: {6, 5, 2, 3, 0]

        System.out.println(numList2);

        // updated from home
        System.out.println("Cloned and pulled from GitHub!!!");



    }
}
