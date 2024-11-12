
package vit.adda.reg21mic0007.mic0007_paint;

public class Rectangle {
    int l;
    int b;
    
    
    Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }
    
    public void draw(){
        System.out.println("Rectangle is drawn.");
    }
    public void move(){
        System.out.println("Rectangle is moved");
    }
    public void resize(){
        System.out.println("Rectangle is resized");
    }
    public void erase(){
        System.out.println("Rectangle erased");
    }
}
