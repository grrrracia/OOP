package Week04;

public class Human {
	
	String hair, color, eyeColor, name, gender;
	int age, weight, height;
		Human(int weight, int height) {
			this.height = height;
			this.weight = weight;
			this.age = 0;
		}

		public void setName(String name) {
		this.name = name;
		}
		
		public void birthday() {
			this.age++;
		}
		public static void main(String[] args) {
			

	}

}
