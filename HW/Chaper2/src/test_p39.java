
public class test_p39 {
	public static void main(String[] args) 
	{
		int[] test;
		test=new int[5];
		
		test[0]=6200;
		test[1]=5800;
		test[2]=5200;
		test[3]=3600;
		test[4]=2600;
		
		System.out.println("演唱會的票價:");
		
		for(int i=0;i<5;i++) {
			System.out.println("第"+(i+1)+"區的價錢是"+test[i]+"元");
		}
		
	}
}
