package com.eastop.test;

import javax.lang.model.type.ArrayType;

import org.junit.Test;

public class TestNum {
	
	@Test
	public void TestSort(){
		/*System.out.println("111");
		int r[] = {3,6,8,7};
		int n = 3;
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n -i; j++){
				 if(r[j]>r[j+1]) //相邻元素比较，交换
		            {
		                r[0]=r[j];
		                r[j]=r[j+1];
		                r[j+1]=r[0];
		            }
			}
		}
		for(int a = 0; a < r.length; a++){
			System.out.println(r[a]);
		}
		
		for(int arrayType:r){
			System.out.println(arrayType+"----");
		}*/
		
		
		
		//二维数组
		int num[][] = {{2,3},{4,5},{5,6}};
		int[][] arr = {{2,5},{1},{3,2,4},{1,7,5,9}};
		for(int i = 0; i < arr.length; i++){ //遍历二维数组，遍历出来的每一个元素是一个一维数组
			System.out.println(arr[i]);
			for(int j = 0; j < arr[i].length; j++){ //遍历对应位置上的一维数组
				System.out.println(arr.clone());
			}
		}
	}
}
