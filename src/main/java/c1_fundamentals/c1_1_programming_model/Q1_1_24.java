package c1_fundamentals.c1_1_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.1.24
 * 给出使用欧几里德算法计算105和24的最大公约数的过程中得到的一系列p和q的值。
 * 扩展该算法中的代码得到一个程序Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
 * 使用你的程序计算1111111和1234567的最大公约数。
 */
public class Q1_1_24 {

	public static void main(String[] args){
		StdOut.println("请输入p:");
		int p = StdIn.readInt();
		StdOut.println("请输入q:");
		int q = StdIn.readInt();
		StdOut.printf("最大公约数：%s", gcd(p, q));
	}

	private static int gcd(int p, int q){
		return gcd(p, q, 1);
	}

	private static int gcd(int p, int q, int stack){
		StdOut.printf("第%s次计算，p：%s，q：%s%n", stack, p, q);
		stack++;
		if (q == 0){
			return p;
		}
		int r = p % q;
		return gcd(q, r, stack);
	}
	
}
