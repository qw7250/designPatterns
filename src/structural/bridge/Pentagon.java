package structural.bridge;

public class Pentagon extends Shape{
    public Pentagon(Color color) {
        super(color);
    }

    public void applyColor(){
        System.out.println("Pentagon filled with color:");
        color.applyColor();
    }

}
