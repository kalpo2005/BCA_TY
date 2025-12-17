package Shape;

public class Figure{
	
		public void volumeFind(float a){
			System.out.println("A cube volume is a        :" + (a * a * a));
		}
		
		public void volumeFind(float a, float h){
			System.out.println("A Cylinder volume is a    :" + (3.14f * a * a * h));
		}
		
		public void volumeFind(float a, float b, float c){
			System.out.println("A Ractangle volume is a   :" + (a * b * c));
		}
}