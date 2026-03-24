package Workshop3;
class Box {
    int width;
    int height;
    int depth;

    Box() {
        width = 10;
        height = 8;
        depth = 12;
    }

    Box(int length) {
        width = height = depth = length;
    }

    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    void getVolume() {
        int volume = width * height * depth;
        System.out.println("Volume = " + volume);
    }
}

public class Question9 {
	public static void main(String[] args) {

        Box cube = new Box(5);
        cube.getVolume();

       
        Box cuboid = new Box(5, 6, 7);
        cuboid.getVolume();

        Box defaultBox = new Box();
        defaultBox.getVolume();
    }

}
