package post.com.boxes;

public class Box {
    float length;
    float width;
    float height;
    String name;
    int price;
    boolean validate(float length, float width, float height){
        return length <= this.length && width <= this.width && height <= this.height;
    }
}