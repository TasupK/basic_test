package inheritage_ex;

class mypoint{
	int x;
	int y;
}

class circle{
	mypoint z = new mypoint();
	int r;
}

public class inheritage_ex3 {
	public static void main(String[] args) {
		circle xyr = new circle();
		xyr.z.x = 1;
		xyr.z.y = 1;
		xyr.r = 1;
		
	}

}
