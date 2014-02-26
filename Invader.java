public class Invader extends Blittable{

public Invader(boolean[][] image, int[] location, Color color){
    this.color = color;
    this.x = location[0];
    this.y = location[1];
    this.image = image;
    this.InvType = Blittable.INVADER;
}

}
