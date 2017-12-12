package Space3D;
import Space3D.Vector3D;

public class Point3D
{
    //х,y,z - вещественные координаты.
    private double x;
    private double y;
    private double z;


    //Конструктор по умолчанию
    //Создаёт нулевой вектор.
    /*Вызов происходит следующим путём.
     *
     *Point3D point3D = new Point();
     *Создался вектор с нулевыми координатами
     */
    public Point3D()
    {
        x = 0;
        y = 0;
        z = 0;
    }



    //Конструктор по координатам.
    //На вход поступают вещественные координаты типа double
    /*Вызов конструктора просходит в момент создания объекта( как и прошлый конструктор, ну или вообще как все конструкторы)
     *Инициализация:
     *double x = 1,y = 2,z = 3;
     *Point3D point3D = new Point3D(x,y,z);
     *Таким образом создастся объект типа Point3D с координатами x,y,z;
     *Примечание:
     *Можно и так Point3D point3D = new Point3D(1,2,3);
     */
    public Point3D(double x1, double y1, double z1)
    {
        x = x1;
        y = y1;
        z = z1;
    }


    //Конструктор копирования
    //Пусть у нас уже имеется какая-то точка point3D(Например прошлая точка point3D с координатами (1,2,3))
    /*Инициализация:
     *(Уже есть какая-то точка point3D)
     * Point3D point = new Point3D(point3D);
     *Очевидно, что в констукторе копирования создастся точка с аналогичными коорданатами.
     *Можно сказать, что в данном случае point = point3D;
     */
    public Point3D(Point3D point3D)
    {
        //Зачем нужен this?
        //В данном случае он не обязателен.
        //Приведу пример, когда он нужен и зачем(см. внизу).
        this.x = point3D.x;
        this.y = point3D.y;
        this.z = point3D.z;
    }

    //Геттеры getX(),getY(),getZ();
    //Выполняют тривиальную функцию возвращают координаты х,у,z;
    /*Поля x,y,z - приватные. Перед ними стоят ключевые слова(ну или можно сказать модификаторы) private
     *Согласно этому модификатору, мы не сможем обратится к этим полям из вне и соответсвенно как-то напрямую над ними манипулировать
     *На помощь приходят геттеры и сеттеры(сеттеры будут ниже)
     */
    /*Вызов:
     *Создаём точку с помощью конструктора по координатам
     *Point3D point3D = new Point3D(1,2,3);
     *Создадим переменную типа дабл, где будет хранится наша координата х;
     *double x;
     *И присвоим x = point3D.getX();
     *
     *в данном случае (х = 1);
     *Примечаение:
     *Так как метод возвращает число имеет место быть такая запись
     *x = 5 - point3D.getX();
     *В данном случае (х = 4);
     *meow
     *Аналогично будет для остальных гетеров, только они будут возвращать другие координаты
     */
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getZ()
    {
        return z;
    }

    //Методы сет(ну или сеттеры)
    //Тут и так всё понятно.
    //Как я уже говорил. Поля private - извне недоступны нам.
    //Ну иногда есть надобность их изменить. Вот с помощью сет мы как раз и сможем это сделать;
    /*Вызов:
     *Создаём точку point3D:
     *Point3D point3D = new Point3D(1,2,4); - Конструктор по координатам;
     *Допустим я хочу вместо 1, сделать 7(Ну это про координату х)
     *Тогда пусть double x = 7;
     *point3D.setX(x);
     *(Теперь будет точка с координатами (7,2,4));
     *Примечание:
     *Можно было и так point3D.setX(7);
     *Аналогично для всех сеттеров.
     */

    public void setX(double x)
    {
        //Хороший пример, где можно объяснить, для чего в конкретном случае нам необходимо использовать this.
        //Вообще по сути this указывает на объект с которым ты в данный момент работаешь.
        //this.x - Вот эта запись означает, что я обращаюсь к приватному полю x данного класса.
        //Почему в других писал просто х, а здесь this.x?
        //Если присмотреться, в параметрах мы передаём некое значение x.
        //Их названия совпадают. И если мы запишем вот так x = x;(wtf) Вообще непонятно что к чему приравнивается
        //Поэтому мы используем здесь слово this.x - чтобы конкретно определить к какому иксу мы обращаемся
        //Примечание:
        //this - используется не только для этого
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void setZ(double z)
    {
        this.z = z;
    }


    //@Override - означает перегрузка функции.
    //Нам данное понятие ещё не рассказывали на лекциях, поэтому нет необходимости объяснять как и почему.
    //Расскажу как работает метод toString();
    //Как уже понятно он возвращает строку;
    //И мы можем выводить нашу точку в консоль.
    //Например у нас есть некая точка point3D(1,2,3);
    //Я хочу её вывести на экран. Тут мне и помогает этот метод. Вызываю следующим образом.
    /*
     *System.out.println(point3D.toString());
     *что отобразится в консоли - Point : (1,2,3);
     *вызов метода toString() можно опустить.(благодаря @override(долго объяснять как это работает, скажу, что дело связано с перегрузкой функции))
     *Как выглядит без вызова toString()
     *System.out.println(point3D);
     *что отобразится в консоли - Point : (1,2,3);
     */
    @Override
    public String toString()
    {
        return "Point : (" + x + "," + y + "," + z + ")";
    }


    //Тоже самое @Override;
    //Скажу вкратце, что метод equals - уже существует в библиотеке. Мы как бы его заимствуем и перегружаем его для нашей ситуации.
    //Метод сравнения точек
    //Параметры типа Object - объект. Ну в эти параметры мы будем передавать точки, для сравнения(по сути point3D - это объект, но немного другой типизации).
    //Вызов:
    /*
     *Создаём точки для сравнения. К примеру 3 точки.
     *Point3D point3D_1 = new Point3D(1,2,3);
     *Point3D point3D_2 = new Point3D(1,2,3);
     *Point3D point3D_3 = new Point3D(5,7,4);
     *2 точки имеют одинаковые координаты соответсвенно они равны
     *
     *point3D_1.equals(point_2); - Вернёт true; Они равные
     *point3D_1.equals(point_3); - Вернёт false; Они равные
     *Эти выражения так же можно передавать в условия.
     *if(point3D_1.equals(point_2)){ ... } Сработает тело.
     */

    @Override
    public boolean equals(Object o)
    {
        if (this==o) return true;
        if (o == null || !(o instanceof Point3D)) return false;

        Point3D point3D = (Point3D) o;
        return (Double.compare(point3D.getX(), this.getX())==0 &&
                Double.compare(point3D.getY(), this.getY())==0 &&
                Double.compare(point3D.getZ(), this.getZ())==0);
    }
}