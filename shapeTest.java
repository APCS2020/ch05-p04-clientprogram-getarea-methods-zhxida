public class shapeTest{
    //Get Area of Circle
    public static double getArea(Circle[] clist){
        double sum = 0;
        for(int i = 0; i < clist.length; i++){
            sum += clist[i].getArea();
        }
        return sum;
    }

    //Get Area of Rectangle
    public static double getArea(Arraylist<Rec> clist){
        double sum = 0;
        for(Rec r : clist){
            sum += r.getArea();
        }
    }

    //Get Area of Triangle
    public static double getArea(Tri[][] clist){
        double sum = 0;
        for(Tri[] r : clist){
            for(Tri t : r){
                sum += t.getArea();
            }
        }
    }

    public static void main(String[] args){
        Circle[] clist = new Circle[3];
        Circle c1 = new Circle(3, "red");
        Circle c2 = new Circle(3, "red");
        Circle c3 = new Circle(3, "red");

        clist[0] = c1;
        clist[1] = c2;
        clist[2] = c3;

        double sum = 0;
        for(int i = 0; i < clist.length; i++){
            sum += clist[i].getArea();
        }
        System.out.println(sum);
    }
}
