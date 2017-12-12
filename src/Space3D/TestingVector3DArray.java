package Space3D;

import java.util.Scanner;



public class TestingVector3DArray {

    private static final int ARRAY_LENGTH = 5;

    private static void identation() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //Пункт 1
        //Конструктор с параметром. Параметр length - размер массива
        /*
         this.vector3DS = new Vector3D[length];

         for (int i = 0; i < length;i++) {
           vector3DS[i] = new Vector3D();
         }
         */
        Vector3DArray vector3DArray = new Vector3DArray(ARRAY_LENGTH);

        //Пункт 2
        //Метод getLength();
        //Возвращает размер массива
        System.out.println("ПУНКТ 2");
        System.out.println("Длина массива " + vector3DArray.getLength());
        identation();

        //Пункт 3
        //Метод changeVector();
        //Параметры: position(позиция элемента), Vector3D - вектор замена.
        //Создаём вектор(конструктор по координатам)
        Vector3D vector3D = new Vector3D(1,2,3);

        //Проверка на границы массива. Позиция > vector3DArray.getLength();
        vector3DArray.changeVector(ARRAY_LENGTH, vector3D);

        //Выберем 3 элемент
        int position = 3;
        vector3DArray.changeVector(position, vector3D);

        /*Проверим замену, воспользуемся вспомогательной функцией toString(int position) -
         *вывод i-ого элемента на экран.
         */
        System.out.println("ПУНКТ 3");
        System.out.println(vector3DArray.toString(position));

        identation();

        //Пункт 4
        //Метод maxLengthVector
        //Создадим ещё один вектор отличный от нуля и заменим 4 элемент массива на него
        vector3D = new Vector3D(2,4,7);
        vector3DArray.changeVector(++position, vector3D);

        System.out.println("ПУНКТ 4");
        System.out.println("Длина самого длинного вектора - " + vector3DArray.maxLengthVector());

        identation();

        //Пункт 5
        //Метод vectorSearch();
        //Параметры: Vector3D - вектор, который мы ищим в массиве
        //Если заданного вектора не будет в массиве, метод вернёт -1;
        //Воспользуемся уже существующим вектором
        System.out.println("ПУНКТ 5");
        if (vector3DArray.vectorSearch(vector3D) >= 0){
            System.out.println("Позиция элемента - " + vector3DArray.vectorSearch(vector3D));
        } else {
            System.out.println("Такого вектора в массиве нет:с");
        }
        //Создадим вектор, которого нет в массиве
        vector3D = new Vector3D(Math.PI, 0,0);

        if (vector3DArray.vectorSearch(vector3D) >= 0){
            System.out.println("Позиция элемента - " + vector3DArray.vectorSearch(vector3D));
        } else {
            System.out.println("Такого вектора в массиве нет:с");
        }

        identation();

        //Пункт 6
        //Метод sumVectorsInArray();
        //Метод возвращает вектор. Воспользуемся уже существующей ссылкой.
        vector3D = vector3DArray.sumVectorsInArray();
        System.out.println("ПУНКТ 6");
        System.out.println(vector3D);

        identation();

        //Пункт 7
        //Метод returnLinearCombination();
        //Параметры: double[] array - Массив вещественных чисел(коэффициентов);
        //Проверка на границы массивов

        System.out.println("ПУНКТ 7");
        double[] coefficients = {1.0f, 2.0f};

        try {
            coefficients = new double[]{1.0f, 2.0f, 1.0f, 2.0f, 1.0f};
            vector3D = vector3DArray.returnLinearCombination(coefficients);
            System.out.println(vector3D);

            double[] coefficients1 = {1.0f, 2.0f};
            vector3D = vector3DArray.returnLinearCombination(coefficients1);
            System.out.println(vector3D);
        } catch(DiffLengthArrayException e) {
            System.out.println( e.getMessage());
        }

        identation();

        //Пункт 8
        //Метод arrayPointsShift
        //Прараметры: Point3D - точка, которую сдвигают на вектора.

        System.out.println("ПУНКТ 8");
        Point3D point3D = new Point3D(1,1,1);
        Point3D[] point3DS = vector3DArray.arrayPointsShift(point3D);

        //Проверка сдвига
        for (int i = 0; i < point3DS.length;i++) {
            System.out.println(point3DS[i]);
        }
    }
}
