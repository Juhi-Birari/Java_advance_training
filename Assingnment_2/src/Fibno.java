
public class Fibno {
	public static void main(String[] args) {
		int n=13;
		int firstterm= Integer.parseInt(args[0]);;
		int secondterm= Integer.parseInt(args[1]);;
		System.out.println("first no= "+firstterm+"second no= "+secondterm);
		
		for(int i=1;i<n;i++) {
			 System.out.print(firstterm + ", ");
			 
			 int nextterm = firstterm + secondterm;
		      firstterm = secondterm;
		      secondterm = nextterm;
		}
	}
}
