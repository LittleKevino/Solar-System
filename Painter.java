public class Painter {
    private static int seed = 0;
    public static void Draw(SolarSystem system,int spinning){
        Sun sun = new Sun();
        system.drawSolarObject(sun.distance,sun.angle,sun.diameter,sun.colour);
    }


}
