public class Main {
    public static void main(String[] args) {
        SolarSystem system = new SolarSystem(500,500);
        Painter.Draw(system,360);
        /*
        system.drawSolarObject(0,0,100,"yellow");
        system.drawSolarObject(80,200,10,"RED");
        system.drawSolarObject(125,100,20,"ORANGE");
        system.drawSolarObject(200,15,25,"BLUE");
        system.drawSolarObject(260,75,20,"RED");
        system.finishedDrawing();
        */
    }

}
