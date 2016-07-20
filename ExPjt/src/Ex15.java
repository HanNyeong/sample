
public class Ex15 {
	public static void main(String[] args) {
		final int SUN = 1;
		final int MON = 2;
		final int Tue = 3;
		final int WED = 4;
		final int THU = 5;
		final int FRI = 6;
		final int SAT = 7;
		
		int start = 1;
		int end = 31;
		int startWeek = FRI;
		
		System.out.println(" SU MO TU WE TH FR SA");
		for (int i=1; i<startWeek; i++) {
			System.out.print("   ");
		}
		for(int i=start, n=startWeek; i<= end; i++,n++) {
			System.out.print((i<10)? " 0" + i : " " +i);
			
			if(n%7 == 0) {
				System.out.println();
			}
		}
	}
}
