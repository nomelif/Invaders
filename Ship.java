import java.awt.Color;

public class Ship extends Blittable{

public Ship(int[] location){
    this.x = location[0];
    this.y = location[1];
    this.image = {{false, false, true, false, false}, {false, true, true, true, false}, {true, true, true, true, true}};
    //--#--
    //-###-
    //#####
    this.color = Color.blue;
    this.InvType = Blittable.SHIP;
}

}
