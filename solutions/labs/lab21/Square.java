public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    //optionally, could override name to give
    //Square a different name than Rectangle

    //optionally, could override Rectangle's compareTo
    //method here. If we do write our own compareTo, 
    //it will allow us to sort rectangles and squares
    //separately. If we don't, rectangles and squares
    //will be treated as the same kind of shape when
    //sorting (and we will just compare their areas)
}