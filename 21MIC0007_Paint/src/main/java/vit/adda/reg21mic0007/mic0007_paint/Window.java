package vit.adda.reg21mic0007.mic0007_paint;

public class Window {
    Window(){}
    public String Creation(int n){
        System.out.println("No of windows created: "+n);
        return "done";
    }
    
    public void open(){
        System.out.println("Window opened");
    }
    
    public void close(){
        System.out.println("Window closed");
    }
    
    public void move(){
        System.out.println("Window moved");
    }
    
    public void display(){
        System.out.println("Window displayed");
    }
    public void handleEvent(){
        System.out.println("Window event handled");
    }
}
