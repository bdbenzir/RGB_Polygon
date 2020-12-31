import java.util.Scanner;

public class PolygonTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        short red = 0, green = 0, blue = 0;
        Scanner sc=new Scanner(System.in);
        Octagon o1,o2,o3;
        Nonagon n1,n2,n3;
        Decagon d1,d2,d3;
        RGB color=new RGB(red, green, blue);
        System.out.print("Enter the Red value: ");
        red=sc.nextShort();
        System.out.print("Enter the Green value: ");
        green=sc.nextShort();
        System.out.print("Enter the Blue value: ");
        blue=sc.nextShort();
        System.out.print("Enter the length of side: ");
        int lengthOfSide=sc.nextInt();
        o1=new Octagon(color, lengthOfSide);
        o2=new Octagon(color, lengthOfSide);
        o3=new Octagon(color, lengthOfSide);
        n1=new Nonagon(color, lengthOfSide);
        n2=new Nonagon(color, lengthOfSide);
        n3=new Nonagon(color, lengthOfSide);
        d1=new Decagon(color, lengthOfSide);
        d2=new Decagon(color, lengthOfSide);
        d3=new Decagon(color, lengthOfSide);

        System.out.println(d1.computeArea()+"\t"+d2.computeArea()+"\t"+d1.comapreTo(d2));
        System.out.println(n1.computeArea()+"\t"+n2.computeArea()+"\t"+n1.comapreTo(n2));
        System.out.println(n1.computeArea()+"\t"+o2.computeArea()+"\t"+n1.comapreTo(o2));

        Nonagon cloned=(Nonagon)n1.clone();
        System.out.println(cloned.toString());
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n3.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
    }
}

