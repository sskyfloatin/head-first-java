
public class Hobbits {
	
	String name;

	public static void main(String[] args) {
		Hobbits[] h = new Hobbits[3];
		
		int z = 0;
		
		h[0] = new Hobbits();
		h[1] = new Hobbits();
		h[2] = new Hobbits();
		
		
		
		while (z < 3) {
			
			h[z].name = "Bilbo";
			if (z == 1){
				h[z].name = "Frodo";
			}
			if (z == 2) {
				h[z].name = "Sam";
			}
				System.out.print(h[z].name + " - ");
				System.out.println("the name of a good hobbit.");
				
				z+=1;
			
		}		

	}

}
