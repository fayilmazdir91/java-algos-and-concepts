package patikaJava;
import java.util.Arrays;
import java.util.Scanner;
public class MatrisTranspozunuBulma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, col;
		System.out.println("Row : ");
		row = scan.nextInt();
		System.out.println("Col : ");
		col = scan.nextInt();
		
		int[][] matris = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				matris[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Matris : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		int[][] transpose = new int[col][row];
		
		System.out.println("Transpose : ");
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				transpose[i][j] = matris[j][i];
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
