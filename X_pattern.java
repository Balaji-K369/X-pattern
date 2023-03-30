import java.util.*;
public class X_pattern{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][5];
		int size=arr.length;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i==j || j==(size-i-1))
					System.out.print("*");
				else
					System.out.print(" ");
}System.out.println("");}}}