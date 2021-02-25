package references;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		int ary[] = new int [10];
			int sum = 0;
			double avg = 0;
			int zzac = 0;
			int cnt = 0;
			for (int i=0; i<=ary.length; i++) {
			int	rannum = (int) (Math.random()* 100 + 1);
			zzac = (rannum%2 == 0) ? rannum : 0; 
			cnt += (rannum%2 == 0) ? 1 : 0;
			sum = sum + zzac; 
			System.out.println("rannum : " + rannum);
			}
			avg = (double) (sum / cnt);
			System.out.println("sum : " + sum + ", avg : " + avg);
			

	}

}
//두번째 위치를 첫번째 넣어라. 오름차순으로 정리해 보라.