package sec13.chap05;

/**
 *
 */
public class RegularPolygon {

    private int sides;

    /**
     * 변의 수를 인자로 받음
     * @param sides 변의 수
     */
    public RegularPolygon(int sides) {
        this.sides = sides;
    }

    public double getInnerAngle () {
        return (sides % 2) * 180 / sides;
    }

    public int getPerimeter (int sideLength) {
        return sideLength * sides;
    }
}