
package vit.adda.reg21mic0007.mic0007_paint;

import java.util.Scanner;
public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Window window = new Window();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Open Window");
            System.out.println("2. Close Window");
            System.out.println("3. Display Window");
            System.out.println("4. Drawing context");
            System.out.println("5. Frame display");
            System.out.println("6. Draw Shape");
            System.out.println("7. Erase Shape");
            System.out.println("8. Move Shape");
            System.out.println("9. Resize Shape");
            System.out.println("10. Exit");
            
            System.out.print("\nYour Choice: ");
                    
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    window.open();
                    break;
                case 2:
                    window.close();
                    break;
                case 3:
                    window.display();
                    break;
                case 4:
                    DrawingContext dc=new DrawingContext();
                    dc.setPoint();
                    dc.clearScreen();
                    dc.getVerticalSize();
                    dc.getHorizontalSize();
                    break;
                case 5:
                    Frame f=new Frame();
                    String msg=f.creation();
                    break;
                case 6:
                    System.out.print("Enter shape to draw (circle/rectangle): ");
                    String shapeType = scanner.nextLine().toLowerCase();

                    switch (shapeType) {
                        case "circle":
                            Circle c = new Circle();
                            c.draw();
                            break;
                        case "rectangle":
                            Rectangle a = new Rectangle(5, 6);
                            a.draw();
                            break;
                        default:
                            System.out.println("Invalid shape type.");
                    }
                    break;
                case 7:
                    System.out.print("Enter shape to erase (circle/rectangle): ");
                    String eraseType = scanner.nextLine().toLowerCase();
                    
                    switch(eraseType){
                        case "circle":
                            Circle c=new Circle();
                            c.erase();
                            break;
                        case "rectangle":
                            Rectangle r=new Rectangle(5, 6);
                            r.erase();
                            break;
                    }
                    break;
                case 8:
                    System.out.print("Enter shape to erase (circle/rectangle): ");
                    
                    String moveType = scanner.nextLine().toLowerCase();
                    switch(moveType){
                        case "circle":
                            Circle c=new Circle();
                            c.move();
                            break;
                        case "rectangle":
                            Rectangle r=new Rectangle(5, 6);
                            r.move();
                            break;
                                    
                    }
                    break;
                case 9:
                    System.out.print("Enter shape: ");
                    String resizeType=scanner.nextLine();
                    //scanner.nextLine();
                    switch(resizeType){
                        case "circle":
                            Circle c=new Circle();
                            c.resize();
                            break;
                        case "rectangle":
                            Rectangle r=new Rectangle(5, 6);;
                            r.resize();
                            break;
                            
                                   
                    }
                    break;
                case 10:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
