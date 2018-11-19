package post.com.boxes;

public class Box {
    public static final int TYPE_3 = 3;
    public static final int TYPE_5 = 5;
    float length;
    float width;
    float height;
    String name;
    int price;
    boolean validate(float length, float width, float height){
        return length <= this.length && width <= this.width && height <= this.height;
    }
}