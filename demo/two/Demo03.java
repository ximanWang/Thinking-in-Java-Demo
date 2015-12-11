package com.thinkinginjava.demo.two;

public class Demo03 {
	public static void main(String[] args) {
		class ATypeName {
			int i;
			double d;
			boolean b;
			void show() {
				System.out.println("i=" + i);
				System.out.println("d=" + d);
				System.out.println("b=" + b);
			}
		}
		ATypeName atypeName = new ATypeName();
		atypeName.i = 2;
		atypeName.d = 2.2;
		atypeName.b = true;
		atypeName.show();
	}
}
