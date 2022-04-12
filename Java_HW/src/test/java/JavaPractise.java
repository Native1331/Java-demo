public class JavaPractise {



    public static void main(String[] args) {
        byte a = 120;
        short b = 32000;
        short s = 3300;
        int c = 1000000000;
        int p = 5000000;
        Integer d = Integer.MAX_VALUE;
        ;
        Integer i = Integer.MIN_VALUE;


        char r = 's';


        long e = 12333333333333334L;
        float f = 0.5F;
        double j = 1.25;


        int k = c - b;
        long l = e / a;
        float m = f * a;
        double n = j % f;
        boolean o = true;

//Арифметические операторы

        System.out.println(a + " " + b + " " + s + " " + c + " " + p + " " + d + " " + r + " " + e + " " +
                           f + " " + j + " " + k + " " + l + " " + m + " " + n);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(c + p);
        System.out.println(c - p);
        System.out.println(c * p);
        System.out.println(c / p);
        //Переполнение
            summ (d,i); {
   //         return (d+i);
        }


        //Логические
String name="Dima";
        if (name.equals("Dima") && name.equals("Alex")) {
              System.out.println("Hi,"+name);
           String surname="Ivanov";
            if  (surname.equals("Petrov") || surname.equals("Ivanov")) {
                System.out.println("Goodbye,"+surname);

            }

// If and Else
            if (s > b) {
                System.out.println("False");
            } else if (s < b) {
                System.out.println("True");
            };
            if (b == s) {
                System.out.println("False");
            } else if (b != s) {
                System.out.println("True");
                if (d >= c) {
                    System.out.println("False");
                }

//        Switch and Case
                int num = 500;
                switch (num) {
                    case 1:
                        System.out.println("Число равно 1");
                        break;
                    case 500:
                        System.out.println("число равно 500");
                        num++;
                        break;
                    case 9:
                        System.out.println("число равно 9");
                        break;
                    default:
                        System.out.println("число не равно 1, 2, 10");
                        long summ = (p + e);

                }
//Несколько типов данных
                String name1 = "Natalya";
                int age = 30;
                String surname1 = "Petrova";
                System.out.println("Hi," + name + " " + surname + " " + age + "!");
            }
        }
    }

    private static int summ(Integer d, Integer i) {
        return (d+i);
    }
}


















