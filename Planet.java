public class Planet extends SolarObject{
    int velocity;
    
    Planet(String colour,int distance,int diameter,int angle, int velocity){
        this.setAngle(angle);
        this.setColour(colour);
        this.setDiameter(diameter);
        this.setDistance(distance);
        this.setVelocity(velocity);
    }
    public void setVelocity(int velocity){
        this.velocity=velocity;
    }

}
