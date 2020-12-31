import java.util.Date;

class RGB{
    private short [] rgbColorArray=new short[3];
    RGB(short red,short green,short blue){
        rgbColorArray[0]=red;
        rgbColorArray[1]=green;
        rgbColorArray[2]=blue;
    }
    public String toString() {
        return rgbColorArray[0]+" "+rgbColorArray[1]+" "
                + rgbColorArray[2];
    }
}
abstract class Polygon implements Comparable,Cloneable{
    private RGB color;
    private Date createdOn;
    private double sideLength;
    Polygon(RGB color){
        createdOn=new Date();
        this.color=color;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public double getLengthOfSide() {
        return sideLength;
    }
    public RGB getColor() {
        return color;
    }
    public void setColor(RGB color) {
        this.color = color;
    }
    public Date getCreatedOn() {
        return createdOn;
    }
    public void setLengthOfSide(double lengthOfSide) {
        this.sideLength = lengthOfSide;
    }
    abstract byte getNumberOfSides();
    abstract double computeArea();
    public abstract String toString();

    public int comapreTo(Polygon object) {
        if(this.getClass().toString().equals(object.getClass().toString()))
            return (int)(this.computeArea()-object.computeArea());
        return -100;
    }
}
class Octagon extends Polygon{
    final byte NUMBER_OF_SIDES=8;
    Octagon(RGB color,double lengthOfSide){
        super(color);
        super.setLengthOfSide(lengthOfSide);
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public byte getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }
    double computeArea() {
        return 2*(1+Math.sqrt(2))*(Math.pow(getLengthOfSide(),2));
    }
    public String toString() {
        return "Octagon"+" "+super.getCreatedOn().toString()+" "
                +super.getColor().toString()+" "+NUMBER_OF_SIDES;
    }
    @Override
    public int compareTo(Object object) {
        if(this.getClass().toString().equals(object.getClass().toString()))
            return (int)(this.computeArea()-((Polygon) object).computeArea());
        return -100;
    }
}
class Decagon extends Polygon{
    final byte NUMBER_OF_SIDES=10;
    Decagon(RGB color,double lengthOfSide){
        super(color);
        super.setLengthOfSide(lengthOfSide);
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public byte getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }
    double computeArea() {
        return (5/2)*(Math.pow(getLengthOfSide(),2))*Math.sqrt(5+2*Math.sqrt(5));
    }
    public String toString() {
        return "Decagon"+" "+super.getCreatedOn()+" "
                +super.getColor().toString()+" "+NUMBER_OF_SIDES;
    }
    @Override
    public int compareTo(Object object) {
        if(this.getClass().toString().equals(object.getClass().toString()))
            return (int)(this.computeArea()-((Polygon) object).computeArea());
        return -100;
    }
}
class Nonagon extends Polygon{
    final byte NUMBER_OF_SIDES=9;
    Nonagon(RGB color,double lengthOfSide){
        super(color);
        super.setLengthOfSide(lengthOfSide);;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public byte getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }
    double computeArea() {
        return (9/4)*(Math.pow(getLengthOfSide(),2))*(Math.cos(Math.PI/9)/Math.sin(Math.PI/9));
    }
    public String toString() {
        return "Nonagon"+" "+super.getCreatedOn()+" "
                +super.getColor().toString()+" "+NUMBER_OF_SIDES;
    }
    @Override
    public int compareTo(Object object) {
        if(this.getClass().toString().equals(object.getClass().toString()))
            return (int)(this.computeArea()-((Polygon) object).computeArea());
        return -100;
    }
}