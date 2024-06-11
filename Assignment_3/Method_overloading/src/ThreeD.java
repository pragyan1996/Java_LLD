public class ThreeD extends Point{
    private int z;
    public ThreeD(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void Display(){
        System.out.println("[<<" + this.x + ">>,<<"+ this.y + ">>,<<" + this.z + ">>]");
    }
}
