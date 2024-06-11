public class Rectangle {
    Point p;
    int height;
    int width;

    int getArea(){
        return this.height * this.width;
    }
    int getPerimeter(){
        return 2 * (this.height + this.width);
    }

    Point getBottomRight(Point p){
        Point t = new Point();
        t.x = p.x + this.width;
        t.y = p.y - this.height;

        return t;
    }
}
