package Space3D;

import static Space3D.Vector3DProcessor.*;

public class Vector3DArray
{
    private Vector3D[] vector3DS;

    public Vector3DArray(int length)
    {
        this.vector3DS = new Vector3D[length];

        for (int i = 0; i < length;i++)
        {
            vector3DS[i] = new Vector3D();
        }
    }

    public int getLength()
    {
        return vector3DS.length;
    }

    public void changeVector(int position, Vector3D vector3D)
    {
        try
        {
            Vector3D new_vector3D = new Vector3D(vector3D.getX(), vector3D.getY(), vector3D.getZ());

            this.vector3DS[position] = new_vector3D;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Выход за пределы массива");
        }
    }

    public double maxLengthVector()
    {
        double maxLength = 0;

        for (int i = 0; i < vector3DS.length;i++)
        {
            if(vector3DS[i].getLength() > maxLength)
            {
                maxLength = vector3DS[i].getLength();
            }
        }
        return maxLength;
    }

    public Vector3D sumVectorsInArray()
    {
        if(vector3DS.length == 1)
        {
            return vector3DS[0];
        }
        else
        {
            Vector3D buffer = new Vector3D();

            for (int i = 0; i < vector3DS.length;i++)
            {
                buffer = sumVectors(buffer, vector3DS[i]);
            }
            return buffer;
        }
    }

    public int vectorSearch(Vector3D vector3D)
    {
        for (int i = 0; i < vector3DS.length; i++)
        {
            if(vector3DS[i].equals(vector3D))
            {
                return i;
            }
        }
        return -1;
    }

    public Vector3D returnLinearCombination(double[] array) throws DiffLengthArrayException {
        if(vector3DS.length != array.length)
        {
            throw new DiffLengthArrayException();

        }
        Vector3D vector3D = new Vector3D();

        for (int i = 0; i < vector3DS.length; i++)
        {
            vector3D = sumVectors(vector3D, multiplyConstant(vector3DS[i],array[i]));
        }
        return vector3D;
    }

    public Point3D[] arrayPointsShift(Point3D point3D)
    {
        try
        {
            Point3D[] point3DS = new Point3D[vector3DS.length];

            for (int i = 0; i < vector3DS.length; i++)
            {
                point3DS[i] = new Point3D(point3D.getX() + vector3DS[i].getX(),
                        point3D.getY() + vector3DS[i].getY(),
                        point3D.getZ() + vector3DS[i].getZ());
            }
            return point3DS;
        }
        catch (NullPointerException e)
        {
            System.err.println("Нулевая ссылка(без объекта)");
            return null;
        }

    }

    public Vector3D get(int i) throws ArrayIndexOutOfBoundsException {
        return vector3DS[i];
    }

    public String toString(int position)
    {
        return vector3DS[position].toString();
    }

}
