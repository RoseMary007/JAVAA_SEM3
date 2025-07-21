package MODULE_1;
class Box{
	int width;
	int height;
	int depth;
	int volume() {
	return(width*height*depth);
}}
public class Box_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box b1=new Box();
        int vol;
        b1.width=10;
        b1.height=20;
        b1.depth=30;
        vol=b1.volume();
        System.out.println("Volume of ht box is "+vol);
        
	}

}
