
public class test_p41 {
	public static void main(String[] args)
	{
		int[] height;
		height=new int[5];
		
		height[0]=160;
		height[1]=175;
		height[2]=153;
		height[3]=165;
		height[4]=180;
		
		height[10]=158;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("第"+(i+1)+"個人的身高是"+height[i]+"cm");
		}
	}
}
