package com.eastop.test;

import java.util.Enumeration;
import java.util.Stack;

public class StackClass {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("chenyun");
		stack.push("chenyun1");
		stack.push("dizhi");
		stack.push("xingbie");
		printStack(stack);
		System.out.println("元素"+stack.pop()+"出栈");
		printStack(stack);
		System.out.println("元素"+stack.pop()+"出栈");
		printStack(stack);
		System.out.println("元素"+stack.pop()+"出栈");
		printStack(stack);
		//查询栈信息
		String s = new String("dizhi");
		System.out.println(stack.search(s));
	}
	
	public static void printStack(Stack stack){
		if(stack.empty()){
			System.out.println("无消息！");
		}else{
			Enumeration enumeration = stack.elements();
			while(enumeration.hasMoreElements()){
				System.out.println(enumeration.nextElement());
			}
		}
	}
	
}
