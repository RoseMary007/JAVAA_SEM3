package MODULE_1;

class Cuboid {
   double length;
   double breadth;
   double height;
   void setDimension(double l,double b,double h) {
	   length=l;
	   breadth=b;
	   height=h;
   }
   double Volume() {
	   return(length*breadth*height);
   }
   double SurfaceArea() {
	   return(2*(length*breadth+breadth*height+length*height));
   }
}
