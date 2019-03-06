package Backpack;




import java.util.LinkedList;
import java.util.List;

public class MainApp {




    public static void main(String[] args) {

        List<Item> list = new LinkedList<>();
        list.add(new Item("Книга", 1, 200));
        list.add(new Item("Бинокль", 2, 6000));
        list.add(new Item("Термос", 1, 1900));
        list.add(new Item("Ноутбук", 4, 66000));
        list.add(new Item("Колонка", 1, 5500));


        Backpack backpack = new Backpack(6);
        backpack.calcBestSet(list);

        list = backpack.getBestSet();


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).price + " " + list.get(i).weight);
        }

        System.out.println("Total best price is " + backpack.getBestPrice());
        System.out.println("Total maxWeight " + backpack.getMaxWeight());
    }

//    private static int exponentiation(int a, int b) {
//
//
//        System.out.println(exponentiation(9, 2));
//        System.out.println(exponentiation(3, 3));
//        System.out.println(exponentiation(2, 3));
//        System.out.println(exponentiation(-2, 3));
//        System.out.println(exponentiation(0, 3));
//        System.out.println(exponentiation(7, 1));
//        System.out.println(exponentiation(0, 0));
//
//
//        if (a == 0) {
//            if (b != 0)
//                return 0;
//            else
//                throw new IllegalArgumentException("Invalid b " + b + " for value = 0");
//        }
//        if (b < 0) {
//            return 1 / (a * exponentiation(a, -b - 1));
//
//        } else if (b > 0) {
//            return a * exponentiation(a, b - 1);
//
//        } else {
//            return 1;
//        }
//    }
//}

}