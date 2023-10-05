public class Bouteille {

   private String type = "Empty bottle";
   private String shape = "Cercle";
   private String size = "1cm";
   private double side = 1.0;
   private double area;
   private double perimeter; 

Bouteille(){
    this(1.0);
}

Bouteille (double side) {
    this.side = side;

    setArea();
    setPerimeter();

}

    public void setType(String type) {
        this.type = type;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPerimeter(String type) {
        this.perimeter = perimeter;
    }

public void setArea() {
    area = side/2*side/2 * 3.14;
}

public void setPerimeter() {
    perimeter = side*3.14;
}

Bouteille (String type, String shape, String size) {
    setType(type);
    setShape(shape);
    setSize(size);
}

public String getType() {
    return type;
}

public String getShape() {
    return shape;
}

public String getSize() {
    return size;
}

@Override
public String toString() {
    String output = "";
    output += "type?" + this.type + "; ";
    output += "shape" + this.shape + "; ";
    output += "size" + this.size + "\n";

    return output;
}

@Override
public boolean equals(Object otherBouteille) {
    if (this == otherBouteille) {
        return true;
    }

    if (!(otherBouteille instanceof Bouteille)) {
        return false;
    }

Bouteille o = (Bouteille)otherBouteille;

    return o.type == this.type
    && o.shape .equals (this.shape)
    && o.size .equals (this.size);
    
    }
}