public class dz1 {
        public static void main(String[] args) {


         //   1
        int b = 20;
        int c = 25;
        int a = 4*(b+c-1)/2;
        System.out.println(a);




        // 2
            int n = 54;
            int sum = 0;
            int number;
            number = n % 10;
            sum = number + sum;
            number = n / 10;
            sum = number + sum;
            System.out.println(sum);



            //3
            int k = 189;
            int summa = 0;//7
            int numbers;   //6
            numbers = k % 10;
            summa = summa + numbers;
            k = k / 10;
            summa = summa + numbers;
            System.out.println(summa);



            //4
            double v =14.3;
            int res = (int) (v+0.5);
            System.out.println(res);



            //5
            int o = 30;
            int m = 7;
            int целое  = o / m;
            int остаток = o % m;
            System.out.println(целое + " и " + остаток + " в остатке ");

            

            //*
            int j = 3; //j = 10  // 7
            int p = 7; // p = 3
             j = j + p;
             p = j - p;
             j = j - p;
            System.out.println(j);
            System.out.println(p);



        }
    }

