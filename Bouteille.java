public class Bouteille {

    String type = "Empty bottle";
    String shape = "Cercle";
    String size = "1cm";
    double side = 1.0;
    double area;
    double perimeter; 

Bouteille(){
    this(1.0);
}

Bouteille (double side) {
    this.side = side;

    calculateArea();
    calculatePerimeter();

}

    public void specifyType(String type) {
        this.type = type;
    }

    public void specifyShape(String shape){
        this.shape = shape;
    }

    public void specifySize(String size) {
        this.size = size;
    }

public void calculateArea() {
    area = side/2*side/2 * 3.14;
}

public void calculatePerimeter() {
    perimeter = side*3.14;
}

@Override
public String toString() {
    String output = "";
    output += "type?" + this.type + "; ";
    output += "shape" + this.shape + "; ";
    output += "size" + this.size + "\n";
}



}