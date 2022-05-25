package patterns;

import java.util.Scanner;

public class RotatedPyramid {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int temp=1;
		for(int i=0;i<(2*n);i++)
		{
			for(int j=0;j<temp;j++)
			{
				System.out.print("* ");
			}
			if(i<n-1)
			{
				temp++;
			}
			else
				temp--;
			System.out.println();
		}
		sc.close();
	}

}
