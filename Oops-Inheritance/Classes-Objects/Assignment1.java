class Box {

    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Assignment1 {

    public static void main(String[] args) {

        Box box = new Box(10, 20, 30);

        System.out.println("Width : " + box.width);
        System.out.println("Height : " + box.height);
        System.out.println("Depth : " + box.depth);
        System.out.println("Volume = " + box.volume());
    }
}