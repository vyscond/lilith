/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package human_engine;

public class TerminalTest
{

	public static void main(String[] args)
	{

		Sudoku s = new Sudoku(6, 2);

		s.show();

		print(s.fill(6, 0, 0));

		s.show();
	}

	public static void print(String x)
	{
		System.out.printf(x);
	}

}
