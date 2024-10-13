
class Settergetter{
//q1 is done to set the radius and height
//q2 is done for finding surface and volume of a cylinder

private int radius;
private int height;

public void setradius(int n)
{
radius=n;
}

public void setheight(int x){
height=x;
}

public int getradius(){
return radius;
}

public int getheight(){
return height;
}

public void surfacearea(){
//double pie2=(2*3.14);
double surf=2*3.14*radius*height+2*3.14*radius*radius;
System.out.println("Surface area of a cylinder "+surf);
}

public void volume(){
double vol=3.14*radius*radius*height;
System.out.println("Volume of a cylinder "+vol);
}



}

public class CH9PSCylinder{
public static void main(String args[]){
Settergetter sg=new Settergetter();
sg.setradius(20);
System.out.println("radius "+sg.getradius());
sg.setheight(10);
System.out.println("height "+sg.getheight());
sg.surfacearea();
sg.volume();
}
}