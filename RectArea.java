import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int l = sc.nextInt();
//        int b = sc.nextInt();
        Area area = new Area();
        System.out.println(area.returnArea(4,5));
        System.out.println(area.returnArea(5,8));
//        System.out.println(area.perimeter());

    }
}
