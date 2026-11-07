                                                         (First Program)
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

                                                        (Second Program)
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}

                                                       (Third Program)
public class Main {
    public static void main(String[] args) {
        int number = 5;
        int i = 1;

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}
