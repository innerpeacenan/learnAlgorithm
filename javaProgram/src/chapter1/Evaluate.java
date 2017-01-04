package chapter1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
/**
 * 
 * @author root
 * <p>bug fixed history</p>
 * <p>
 * (1) made a mistick  to use <code> v / vals.pop() </code>, which lead to a divide incorrect result,
 * fixed on 2016-12-13
 * </p>
 */
public class Evaluate {
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			// the same to c, "" mean String, while '' means char;
			if (s.equals("("))
				;
			else if (s.equals("+"))
				ops.push(s);
			else if (s.equals("-"))
				ops.push(s);
			else if (s.equals("*"))
				ops.push(s);
			else if (s.equals("/"))
				ops.push(s);
			else if (s.equals("sqrt"))
				ops.push(s);
			// ops.push(s); here is an error ,when case in "(" ,nothing need to
			// do
			else if (s.equals(")")) {
				String op = ops.pop();
				double v = vals.pop();
				if (op.equals("+"))
					v = vals.pop() + v;// vals is Stack,so it has method pop
				else if (op.equals("-"))
					v = vals.pop() - v;
				else if (op.equals("*"))
					v = vals.pop() * v;
				else if (op.equals("/"))
					/*
					 * made a mistick  to use <code> v / vals.pop() </code>, which lead to a divide incorrect result
					 * fixed on 2016-12-13
					 */
					v = vals.pop() / v;
				
				else if (op.equals("sqrt"))
					v = Math.sqrt(v);
				vals.push(v);
			} else {
				vals.push(Double.parseDouble(s));// Double.parseDouble can parse
													// a string to double
			}

		}
		while (!vals.isEmpty()) {
			StdOut.println(vals.pop());
		}
	}

}
