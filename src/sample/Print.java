package sample;
/*
 * 2015/10/20
 * 
 * save	: command + s
 * run	: option + command + x -> j
 * 
 * and	: &&
 * or	: ||
 * 
 * do{sentence}while(condition)
 */
public class Print {
	public static void main(String[] args) {
		int[] cnt;
		cnt = new int[10];
		for(int i=0; i < 10; i++){
			cnt[i] = i;
		}
		
		for(int i=0; i < 10; i++){
			System.out.println(cnt[i]);
		}
		System.out.println("----------");
		
		int[] cnt2 = new int[cnt.length];
		for(int i=0; i < cnt.length; i++){
			cnt2[i] = cnt[i];
		}		
		cnt2[0] = 100;
		
		for(int i=0; i < 10; i++){
			System.out.println(cnt[i]);
		}
		System.out.println("----------");
		

		for(int i=0; i < 10; i++){
			System.out.println(cnt2[i]);
		}
		System.out.println("----------");
	}
}
