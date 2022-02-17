public class Accmodi {
		int noc;
		float hrs;
		int nos;
		
		void displayclass(int noc) {
			System.out.println("Class-"+10+"th");	
		}
		void displaystudents(int nos) {
			System.out.println("Number of Students-"+68);
		}
		void displayhours(float hrs) {
			System.out.println("Class Hours-"+6+"hr");
		}
		public static void main(String[] args) {
			Accmodi am=new Accmodi();
			am.displayclass(10);
			//System.out.println(10+"th");
			am.displaystudents(68);
			//System.out.println(68+"students");
			am.displayhours(6);
		    //System.out.println(6+"hr");
		}
	}

