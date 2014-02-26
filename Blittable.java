public abstract class Blittable{

protected boolean[][] image;
protected Color color;

// true values in image should be filled with the color defined in the color variable

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
