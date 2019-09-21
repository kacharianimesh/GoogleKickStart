import java.util.Scanner;

public class Solution 
{
	public static int solve(int[] skill, int P)
	{
		int size = skill.length;
		int time = 0;
		for(int i = 0 ; i <size;i++)
		{
			for(int j = 0; j<size-1 ; j++)
			{
				if(skill[j]>skill[j+1])
				{
					int temp = skill[j];
					skill[j] = skill[j+1];
					skill[j+1] = temp;
				}
			}
		}
		for(int j = size-2; j>size-P-1;j--)
		{
			time += skill[size-1] - skill[j];
		
		}
		return time;
	
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 1; i <= T; i++) 
		{
			int N = scan.nextInt();
			int P = scan.nextInt();
			
			int[] skill = new int[N];
			
			for(int j = 0; j < N; j++)
			{
				skill[j] = scan.nextInt();
			}
			int time = solve(skill, P);
			System.out.println("Case #"+i+" :"+time);
			
		}
	}
}