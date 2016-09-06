package com.caofei.test;

import java.util.Scanner;

public class Test1 {
	/**
	 * turn right 90
	 *  temp[���ѭ��][�ڲ�ѭ��]=a[��ά�����һά����-j-1][���ѭ��]
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
	 *  temp[���ѭ��][�ڲ�ѭ��]=a[���ѭ��][��ά����һά����-i-1]
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
	 * ��������
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
		System.out.println("�����ά�����n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		System.out.println("���������Ԫ��");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("������ľ���Ϊ��");
		print(a);
		System.out.println("˳ʱ����ת90�Ⱦ���Ϊ��");
		print(transform1(a));
		System.out.println("��ʱ����ת90�Ⱦ���Ϊ��");
		print(transform2(a));
		
		
	}

}
