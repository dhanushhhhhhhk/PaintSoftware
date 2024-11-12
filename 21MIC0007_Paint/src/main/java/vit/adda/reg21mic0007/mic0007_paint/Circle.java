
package vit.adda.reg21mic0007.mic0007_paint;


public class Circle {
    float r;
    Point center= new Point();
    
    public Circle(){}
    
    Circle(int r, Point center){
        this.r=r;
        this.center=center;     
    }
    
    double Area(int r){
    double area= 3.14*r*r;
    System.out.println("Area is :" +area);
    return area;
    }
    double circumference(int r)
    {
    double Circumference= 2*3.14*r;
    System.out.println("circumference is :" +Circumference);
    return Circumference;
    }
    void setradius(int r){
        this.r=r;
}
    void setcenter(int r)
    {
        this.r=r;
    }
    
    public void draw(){
        System.out.println("Circle is drawn.");
    }
    public void move(){
        System.out.println("Circle is moved");
    }
    public void resize(){
        System.out.println("Circle is resized");
    }
    public void erase(){
        System.out.println("Circle erased");
    }
}