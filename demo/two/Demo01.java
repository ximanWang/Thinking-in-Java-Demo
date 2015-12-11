package com.thinkinginjava.demo.two;

public class Demo01 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println("i初始化为：" + foo.i);
		System.out.println("c初始化为：" + foo.c);

	}

}

class Foo {
	int i;
	char c;
}