package structural.adapter;

public class RectangleAdapter implements Shape{
    private Rectangle adapter;
    public RectangleAdapter(Rectangle adaptee){
        this.adaptee = adaptee;

    }
    @Override
    public void draw(int x, int y, int z, int j){

    }
}
