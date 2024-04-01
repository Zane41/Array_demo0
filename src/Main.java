import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massiv0 = new int[5]; //объявление переменной и выделение памяти для 5 целых чисел
        //массив уже заполнен 0
        int[] massiv1 = {12, 16, 13, -8, 7, 9};

        int[] massiv2 = inputArray();

       // printArray("массив0 содержит ", massiv0);
       // printArray("массив1 содержит ", massiv1);
        printArray("массив2 содержит ", massiv2);
       // fillArray(massiv0, 193);
       // printArray("массив0 содержит ", massiv0);


//        printArray("массив2 содержит ", massiv2);

    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    public static void fillArray(int[] m, int filler)
    {
        for (int i = 0; i < m.length; i++) {
            m[i] = filler;
        }
    }

    public static void readArray(int[] m)
    {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("введите "+m.length+" элементов массива");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
        }
    }

    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива 2");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }
    public static int summaElementov(int[] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = +m[i];
        }
        return sum;
    }
    public static int minZnac(int[]m){
        int minZnac = m[0];
        for (int i = 1; i <m.length ; i++) {
            if (m[i] <= minZnac) minZnac = m[i];
        }
            return minZnac;
    }
    public static int maxZnac(int[]m){
        int maxZnac = m[0];
        for (int i = 1; i <m.length ; i++) {
            if (m[i] >= maxZnac) maxZnac = m[i];
        }
        return maxZnac;
    }
    public  static  int nomerMax(int []m) {
        int max = m[0], numberMax = 0;
        for (int i = 1; i < m.length; i++) {
            if (max < m[i]) {
                max = m[i];
                numberMax = i;
            }
        }
        return numberMax;
    }
    public  static  int nomerMin(int []m) {
        int min = m[0], numberMin = 0;
        for (int i = 1; i < m.length; i++) {
            if (min > m[i]) {
                min = m[i];
                numberMin = i;
            }
        }
        return numberMin;
    }
    public static int[] zamenaMinMax(int []mass){
        int imin= nomerMax(mass); int  imax=nomerMin(mass);
        int min= minZnac(mass); int  max=maxZnac(mass);
        for (int i = 0; i < mass.length; i++) {
            if (i==imin) mass[i]=max;
            if (i==imax) mass[i]=min;
        }
        return mass;
    }
}