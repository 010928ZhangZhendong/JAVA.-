//定义梯形类
class Trapezoid{
    public double shangdi;//上底
    public double xiadi;//下底
    public double gao;//高
    //求梯形面积的方法
    void area(){
        System.out.println("梯形的面积为："+ (shangdi + xiadi) * gao / 2 );
    }

}
//定义圆形类
class Circle{
    public double r;
    //求圆形面积的方法
    void area(){
        System.out.println("圆形的面积为：" + 3.14 * r * r );
    }
}
//定义主类
public class Text{

    public static void main(String[] args) {

        Trapezoid trapezoid1 = new Trapezoid();
        trapezoid1.gao = 20;
        trapezoid1.shangdi = 5;
        trapezoid1.xiadi = 8;

        trapezoid1.area();

        Circle circle1 = new Circle();
        circle1.r = 10;
        circle1.area();

    }
}