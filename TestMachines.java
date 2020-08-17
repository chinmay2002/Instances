import java.util.Scanner;
public class TestMachines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Machines m= null;
		Mobile mo = null;
		Laptop l = null;
		
		do {
			System.out.println("*************************WELCOME TO OUR SHOP*******************");
			System.out.println("------------------------THIS IS DIGITAL MENU-------------------");
			System.out.println("================================================================");
			System.out.println("1 - LAPTOPS \t 2- MOBILES");
			System.out.println("Enter your Choice :");
			switch(sc.nextInt()) {
			case 1:
				do {
					System.out.println("---------------------WELCOME TO LAPTOP MENU--------------------");
					System.out.println("1 - DELL \t 2 - HP \t 3 - LENOVO");
					System.out.println("Enter your Choice :");
					switch(sc.nextInt()) {
					case 1:
						l=new Dell("D11","Red",56000,101);
						display(l, "Dell");
						break;
					case 2:
						l=new Hp("H11","Green",78000,102);
						display(l, "HP ");
						break;
					case 3:
						l=new Lenovo("L11","Blue",90000,103);
						display(l, "Lenovo ");
						break;
					}
					System.out.println("Enter 1 to continue in Laptop :");
				}while(sc.nextInt()==1);
				break;
				
			case 2:
				do {
					System.out.println("---------------------WELCOME TO LAPTOP MENU--------------------");
					System.out.println("1 - SAMSUNG \t 2 - REDMI \t 3 - VIVO");
					System.out.println("Enter your Choice :");
					switch(sc.nextInt()) {
					case 1:
						m=new Samsung("S11","Red",10000,64);
						display(m, "Samsung ");
						break;
					case 2:
						m=new Redmi("R11","Yellow",12000,48);
						display(m, "Redmi ");
						break;
					case 3:
						m=new Lenovo("LO11","Lemon",14000,16);
						display(m, "Lenovo ");
						break;
					}
					
					System.out.println("Press 1 to Continue in Mobiles");
				}while(sc.nextInt()==1);
				break;
			}
			
			System.out.println("Say Yes to Continue :");
		}while(sc.next().equals("yes"));
		
		System.out.println("***************************** Thank You ********************************");
	}
	
	
	
	public static void display(Machines m, String str) {
		System.out.println("------------------------------------------------------------------------");
		System.out.println(str +" Details :");
		System.out.println(str + " Model :" + m.getModel());
		System.out.println(str + " Color :" + m.getColor());
		System.out.println(str + " Price :" + m.getPrice());
		if(m instanceof Laptop) {
			Laptop l = (Laptop)m;
			System.out.println(str +" Keys :" + l.getKeys());
		}
		if(m instanceof Mobile) {
			Mobile mo = (Mobile)m;
			System.out.println(str +" Camera :" +mo.getCamera() +" MP");
		}
		System.out.println("-------------------------------------------------------------------------");
	}

}
