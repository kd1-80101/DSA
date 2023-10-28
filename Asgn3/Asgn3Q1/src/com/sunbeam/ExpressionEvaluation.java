package com.sunbeam;

import java.util.Scanner;

public class ExpressionEvaluation {
	public static int calculate(int op1, String opr, int op2) {
		switch (opr) {
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		case "%":
			return op1 % op2;
		}
		return 0;
	}

	public static int prefixEvaluation(String prefix) {
		String[] arr = prefix.split(" ");
		Stack stk = new Stack(10);
		for (int i = arr.length - 1; i >= 0; i--) {
			if (!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/")
					&& !arr[i].equals("%")) {
				int ele = Integer.parseInt(arr[i]);
				stk.push(ele);
			} else {
				int op1 = stk.pop();
				int op2 = stk.pop();

				int res = calculate(op1, arr[i], op2);
				stk.push(res);
			}
		}
		if (!stk.isEmpty())
			return stk.pop();
		return 0;
	}

	public static int postfixEvaluation(String postfix) {
		String[] arr = postfix.split(" ");
		Stack stk = new Stack(10);
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/")
					&& !arr[i].equals("%")) {
				int ele = Integer.parseInt(arr[i]);
				stk.push(ele);
			} else {
				int op2 = stk.pop();
				int op1 = stk.pop();

				int res = calculate(op1, arr[i], op2);
				stk.push(res);
			}
		}
		if (!stk.isEmpty())
			return stk.pop();
		return 0;
	}

	public static void main(String[] args) {
		String prefix = "+ * 20 - 10 5 3";
		int res = prefixEvaluation(prefix);
		System.out.println("prefix evaluation result : " + res);
		System.out.println("-----------------------");
		String postfix = "23 5 3 * +";
		res = postfixEvaluation(postfix);
		System.out.println("postfix evaluation result : " + res);
	}

}
