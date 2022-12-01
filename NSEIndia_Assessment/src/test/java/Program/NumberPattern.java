package Program;

public class NumberPattern {

	public static void main(String[] args) {
		int num=11;
		int req=2;
		for(int i=1;i<=4;i++) {
			if(i==1) {
				for(int j=1;j<=6;j++) {
					if(j==3) {
						System.out.print(1);
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			else {			
				num=num*11;
				for(int j=1;j<=6;j++) {
					if(j==req) {
						System.out.println(num);
					}else {
						System.out.print(" ");
					}
					
				}
				
			}
		}

	}

}
