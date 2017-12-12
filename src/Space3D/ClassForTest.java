package Space3D;
import Space3D.Point3D;
import Space3D.Vector3D;
import Space3D.Vector3DProcessor;
import Space3D.Vector3DArray;

public class ClassForTest {

    private static void identation() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Point3D point3D_1 = new Point3D(6,42,1);
        Point3D point3D_2 = new Point3D(1, 2, 3);

        Vector3D vector3D_1 = new Vector3D(point3D_1,point3D_2);
        Vector3D vector3D_2 = new Vector3D(4,1,4);

        //********************************************
        //Сравнени точек и последовательный её вывод на экран
        if (point3D_1.equals(point3D_2)) {
            System.out.println("Точки равны");
        } else {
            System.out.println("Точки не равны");
        }

        if(point3D_1.equals(point3D_1)) {
            System.out.println("Эта точка равна сама себе");
            System.out.println(point3D_1.toString());
        } else {
            System.out.println("Неудача:с");
        }

        //********************************************
        //Сравнение векторов
        identation();

        if(vector3D_1.equals(vector3D_2)) {
            System.out.println("Эти векторы равны");
        } else {
            System.out.println("Эти векторы не равны");
        }

        if(vector3D_1.equals(vector3D_1)) {
            System.out.println("Вектор равен сам себе");
            System.out.println(vector3D_1.toString());
        } else {
            System.out.println("Неудача:с");
        }

        //System.out.println(vector3D_1.toString());
        //********************************************

        identation();

        //Сложение двух векторов
        System.out.println("Сложение двух векторов  " + "1." + vector3D_1.toString() + " & " + "2." + vector3D_2.toString());

        Vector3D sum_of_vectors = Vector3DProcessor.sumVectors(vector3D_1,vector3D_2);
        System.out.println(sum_of_vectors.toString());

        identation();
        //Разность двух векторов
        System.out.println("Разность двух векторов  " + "1." + vector3D_1.toString() + " & " + "2." + vector3D_2.toString());

        Vector3D substract_vectors = Vector3DProcessor.substractVectors(vector3D_1,vector3D_2);
        System.out.println(substract_vectors.toString());

        identation();
        //Скалярное произведение двух векторов
        System.out.println("Скалярное произведение двух векторов(число)  " + "1." + vector3D_1.toString() + " & " + "2." + vector3D_2.toString());

        double scalar_multiply = Vector3DProcessor.scalarMultiplyed(vector3D_1,vector3D_2);
        System.out.printf("Скалярное произведение равно"+ " %.2f", scalar_multiply);
        System.out.println();

        identation();
        //Векторное произведение двух векторов
        System.out.println("Вектороное произведение двух векторов  " + "1." + vector3D_1.toString() + " & " + "2." + vector3D_2.toString());

        Vector3D vectors_multiply = Vector3DProcessor.vectorMultiplyed(vector3D_1,vector3D_2);
        System.out.println(vectors_multiply.toString());

        identation();
        //Проверка на коллинеарность векторов
        System.out.println("Скалярны ли вектора  " + "1." + vector3D_1.toString() + " & " + "2." + vector3D_2.toString() + "?");
        if (Vector3DProcessor.isCollinearity(vector3D_1, vector3D_2)) {
            System.out.println("Вектора равны");
        } else {
            System.out.println("Вектора не равны");
        }
        Vector3D vector3D_3 = new Vector3D();
        System.out.println("Скалярны ли вектора  " + "1." + vector3D_1.toString() + " & " + "2." + vector3D_3.toString() + "?");
        if (Vector3DProcessor.isCollinearity(vector3D_1, vector3D_3)) {
            System.out.println("Вектора коллинеарны");
        } else {
            System.out.println("Вектора не коллинеарны");
        }
        System.out.println("Скалярны ли вектора  " + "1." + vector3D_1.toString() + " & " + "2." + vector3D_1.toString() + "?");
        if (Vector3DProcessor.isCollinearity(vector3D_1, vector3D_1)) {
            System.out.println("Вектора коллинеарны");
        } else {
            System.out.println("Вектора не коллинеарны");
        }
        Vector3D vector3D_4 = new Vector3D(1, 0.25, 1);
        System.out.println("Скалярны ли вектора  " + "1." + vector3D_2.toString() + " & " + "2." + vector3D_4.toString() + "?");
        if (Vector3DProcessor.isCollinearity(vector3D_2, vector3D_4)) {
            System.out.println("Вектора коллинеарны");
        } else {
            System.out.println("Вектора не коллинеарны");
        }


    }
}
