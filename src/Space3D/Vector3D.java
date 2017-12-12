package Space3D;

import Space3D.Point3D;

public class Vector3D
{
    //x,y,z- Координаты векторы
    private double x;
    private double y;
    private double z;

    public Vector3D()
    {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D point3D_1, Point3D point3D_2)
    {
        this.x = point3D_2.getX() - point3D_1.getX();
        this.y = point3D_2.getY() - point3D_1.getY();
        this.z = point3D_2.getZ() - point3D_1.getZ();
    }

    public double getX()
    {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getLength()
    {
        return (Math.sqrt(x*x+y*y+z*z));
    }

    @Override
    public String toString()
    {
        return "Vector : (" + x + "," + y + "," + z + ")";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this==o) return true;
        if (o == null || !(o instanceof Vector3D)) return false;

        Vector3D vector3D = (Vector3D) o;
        return (Double.compare(vector3D.getX(), this.getX())==0 &&
                Double.compare(vector3D.getY(), this.getY())==0 &&
                Double.compare(vector3D.getZ(), this.getZ())==0);
    }

}
