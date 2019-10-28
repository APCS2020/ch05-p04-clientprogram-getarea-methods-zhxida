public class Tri{
    private double base;
    private double hight;

    public Tri(double b, double h){
        base = b;
        hight = h;

    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }

  
    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getArea(){
        return base * hight * 0.5;
    }
}
