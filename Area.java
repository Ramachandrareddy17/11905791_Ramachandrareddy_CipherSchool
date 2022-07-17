public class Area {
    int length;
    int breadth;

//    public Area(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }

//    public int perimeter(){
//        return 2*(length+breadth);
//    }

    public int returnArea(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        return length*breadth;
    }

}
