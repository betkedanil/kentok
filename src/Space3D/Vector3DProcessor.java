package Space3D;

import Space3D.Vector3D;

public class Vector3DProcessor
{
    public static Vector3D sumVectors(Vector3D vector3D_1, Vector3D vector3D_2)
    {
//        try
//        {
            return ( new Vector3D(vector3D_1.getX() + vector3D_2.getX(),
                                  vector3D_1.getY() + vector3D_2.getY(),
                                  vector3D_1.getZ() + vector3D_2.getZ()));
//        }
//        catch (NullPointerException e)
//        {
//            System.err.println("Заданая ссылка без объекта");
//            return null;
//        }
    }

    public static Vector3D substractVectors(Vector3D vector3D_1, Vector3D vector3D_2)
    {
        try
        {
            return ( new Vector3D(vector3D_1.getX() - vector3D_2.getX(),
                                  vector3D_1.getY() - vector3D_2.getY(),
                                  vector3D_1.getZ() - vector3D_2.getZ() ));
        }
        catch (NullPointerException e)
        {
            System.err.println("Заданая ссылка без объекта");
            return null;
        }
    }

    public static boolean isCollinearity(Vector3D vector3D_1, Vector3D vector3D_2)
    {
        try
        {
            if ((vector3D_1.getX() == 0 && vector3D_1.getY() == 0 && vector3D_1.getZ() == 0) ||
                 vector3D_2.getY() == 0 && vector3D_2.getY() == 0 && vector3D_2.getZ() == 0)
            {
                return true;
            }
            else
                {
                    return vector3D_1.getX() * vector3D_2.getY() == vector3D_1.getX() * vector3D_2.getY() &&
                            vector3D_1.getY() * vector3D_2.getZ() == vector3D_1.getZ() * vector3D_2.getY();
            }
        }
        catch (NullPointerException e)
        {
            System.err.println("Заданая ссылка без объекта");
            return false;
        }
    }

    public static double scalarMultiplyed(Vector3D vector3D_1, Vector3D vector3D_2)
    {
        try
        {
            return ((vector3D_1.getX() * vector3D_2.getX()) +
                    (vector3D_1.getY() * vector3D_2.getY()) +
                    (vector3D_1.getZ() * vector3D_2.getZ()) );
        }
        catch (NullPointerException e)
        {
            System.err.println("Ссылка без объекта");
            return -1;
        }

    }

    public static Vector3D vectorMultiplyed(Vector3D vector3D_1, Vector3D vector3D_2)
    {
        try
        {
            return new Vector3D( vector3D_1.getY()*vector3D_2.getZ() - vector3D_1.getZ()*vector3D_2.getY(),
                    vector3D_1.getZ()*vector3D_2.getX() - vector3D_1.getX()*vector3D_2.getZ(),
                    vector3D_1.getX()*vector3D_2.getY() - vector3D_1.getY()*vector3D_2.getX()) ;
        }
        catch (NullPointerException e)
        {
            System.err.println("Ссылка без объекта");
            return null;
        }

    }

    public static Vector3D multiplyConstant(Vector3D vector3D, double constant)
    {
        try
        {
            return new Vector3D(vector3D.getX()*constant, vector3D.getY()*constant, vector3D.getZ()*constant);
        }
        catch (NullPointerException e)
        {
            System.err.println("Ссылка без объекта");
            return null;
        }
    }
}
