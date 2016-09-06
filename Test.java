package com.caofei.test;

import java.util.Scanner;

public class Test1 {
	/**
	 * turn right 90
	 *  temp[外层循环][内层循环]=a[二维数组的一维长度-j-1][外层循环]
	 */
	public static int[][] transform1(int[][] a) {
		int temp[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				temp[i][j] = a[a[i].length - j - 1][i];
			}
		}
		return temp;
	}
	
	/**
	 * turn left 90
	 *  temp[外层循环][内层循环]=a[外层循环][二维数组一维长度-i-1]
	 */
	public static int[][] transform2(int[][] a) {
		int temp[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				temp[i][j] = a[j][a[i].length - i - 1];
			}
		}
		return temp;
	}
	
	/***
	 * 数组的输出
	 * @param args
	 */
	public static void print(int[][] a){
		for (int[] is : a) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("输入二维矩阵的n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		System.out.println("请输入各个元素");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("你输入的矩阵为：");
		print(a);
		System.out.println("顺时针旋转90度矩阵为：");
		print(transform1(a));
		System.out.println("逆时针旋转90度矩阵为：");
		print(transform2(a));
		
		
	}

}
