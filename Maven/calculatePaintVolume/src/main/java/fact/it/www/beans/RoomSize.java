package fact.it.www.beans;

/**
 *
 * @author Ali
 */
public class RoomSize {
    private double height,length, width;
    private boolean ceiling;

    public RoomSize(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isCeiling() {
        return ceiling;
    }

    public void setCeiling(boolean ceiling) {
        this.ceiling = ceiling;
    }
    
    public int getLiterPaint(String coatNr){
        int layers = Integer.parseInt(coatNr);
        
        double surfaceArea = (2*(length + width)*height)+(ceiling? length*width:0);
        int liter = (int) ((surfaceArea*layers)/10+.99);
        return liter;
    }
}
