
public class MainApp {


    public static void main(String[] args) {

        System.out.println(factorial(9, 2));
        System.out.println(factorial(3, 3));
        System.out.println(factorial(2, 3));
        System.out.println(factorial(-2, 3));
        System.out.println(factorial(0, 3));
        System.out.println(factorial(7, 1));

    }

    private static int factorial(int a, int b) {


            if (a < 0) {
                System.out.println("Зачем тебе факториал отрицательного числа?");

                try {

                    return Integer.parseInt(null);

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            }
            if (a == 0) {
                System.out.println("Ноль в степень не возводим! ");
                try {
                    return Integer.parseInt(null);

                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
            if (b > 1) {
                return a * factorial(a, b - 1);
            } else {
                return a;
            }
        }
    }


