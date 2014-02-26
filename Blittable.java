public abstract class Blittable{

protected boolean[][] image;
protected Color color;
protected int x;
protected int y;

// true values in image should be filled with the color defined in the color variable
//Location of the object is defined by x and y, size by image

public boolean[][] getImage(){
    return(this.image);
}

public void setImage(boolean[][] image){
    this.image = image;
}

// Getters and setters for image

public Color getColor(){
    return(this.color);
}

public void setColor(Color color){
    this.color = color;
}

// Getters and setters for color

public int[] getLocation(){
    int[] location = new int[] {x, y};
    return(location);
}

public void setLocation(int[] location){
    this.x = location[0];
    this.y = location[1];
}

// Getters and setters for x and y
