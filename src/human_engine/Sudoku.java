/*
 * Aplicando a arquitetura de memÛrias ao jogo sudoku.
 * 
 * A idÈia central È tentar vizualizar o jogo da mesma
 * maneira que a CPU controla o acesso de R/W na mem√≥ria principal
 * 
 * a vari√°vel Node[] rows nos dar√° o controle de inserÁ„o e verificaÁ„o a nivel das Linhas
 * ela armazena o quantidade de "CÈlulas" que o nosso "MÛdulo de MemÛria" tem.
 * 
 * cada um desses N endereÁos est„o apontando para um array Node.rows[N].numbers[N']...
 * onde os endereÁos N' de numbers[] correspondem as colunas.
 * 
 * ent„o de temos um Sudoku.rows[] de tamanho 6
 * 
 * rows [0] 
 * rows [1]
 * rows [2]
 * rows [3]
 * rows [4]
 * rows [5]
 * 
 * e consequentemente teremos "cÈlulas" com o tamanho de palavra igual ao numero de endereÁos...
 * 
 * Sudoku.rows [0] - ([] [] [] [] [] []) >> Node.numbers[6];
 * 
 * Sudoku.rows [1] - ([] [] [] [] [] []) >> Node.numbers[6];
 * 
 * Sudoku.rows [2] - ([] [] [] [] [] []) >> Node.numbers[6];
 * 
 * Sudoku.rows [3] - ([] [] [] [] [] []) >> Node.numbers[6];
 * 
 * Sudoku.rows [4] - ([] [] [] [] [] []) >> Node.numbers[6];
 * 
 * Sudoku.rows [5] - ([] [] [] [] [] []) >> Node.numbers[6];
 * 
 * Isso possibilita a cria√ß√£o de um algoritimo todo baseado em arrays unidimensionais
 * ou seja, simplifica√ß√£o dos calculos e redu√ß√£o no corpo do algoritimo
 * 
 */

package human_engine;

import java.awt.Color;
import java.util.LinkedList;

public class Sudoku
{

	private LinkedList<Columns>	rows	= new LinkedList<Columns>();
	private GradeManager grademanager;
	private int size;
	private int cells;
	private int									remainingmoves;
	private int									totalmoves;

	public String fill(int value, int row, int column)
	{

		String quadrant = "";

		if (row == 0 || row == 1)
		{
			if (column < 3) quadrant = "#1";
			else if (column > 3) quadrant = "#2";
		}
		else if (row == 2 || row == 3)
		{
			if (column < 3) quadrant = "#3";
			else if (column > 3) quadrant = "#4";
		}
		else if (row == 4 || row == 5)
		{
			if (column < 3) quadrant = "#5";
			else if (column > 3) quadrant = "#6";
		}

		print("~> trying fill [" + value + "] at row[" + row + "] x column[" + column + "]\n");

		if (this.rows.get(row).getCell(column).getChangeable() == false)
		{
			print("~~> The position cant be modified\n\n");

			return "A posiÁ„o escolhida n„o pode ser modificada";
		}

		/*
		 * redundancias necess·rias para uma seleÁ„o mais precisa das saidas
		 */

		else if (this.RowDopells(value, row, column) == false && this.ColumnDopells(value, row, column) == false
				&& this.QuadrantDopells(value, row, column) == false)
		{
			this.print("\n~~> Rows dopells [false]\n~~> Columns dopells [false]\n~~> Quadrant dopells [false]");

			this.remainingmoves--;
			this.print("\n~~> Remaining moves " + this.remainingmoves);

			this.rows.get(row).getCell(column).setValue(value);
			
			this.print("\n~~> Number was inserted\n\n");

			return "Excelente escolha!\n O n˙mero foi inserido com sucesso!";
		}

		// Row dopells
		else if (this.RowDopells(value, row, column) == true && this.ColumnDopells(value, row, column) == false && QuadrantDopells(value, row, column) == false)
		{
			this.print("\n~~> Rows dopells [true]\n~~> Column dopells [false]\n~~> Quadrant dopells [false]\n");
			this.rows.get(row).getCell(column).setValue(value);
			this.print("\n~~> Number was inserted\n\n");
			return "O lugar escolhida mostra um conflito!\nO numero inserido esta se\n repetindo na linha [" + row + "]";
		}
		else if (this.RowDopells(value, row, column) == true && this.ColumnDopells(value, row, column) == true && QuadrantDopells(value, row, column) == false)
		{
			this.print("\n~~> Rows dopells [true]\n~~> Column dopells [true]\n~~> Quadrant dopells [false]\n");
			this.rows.get(row).getCell(column).setValue(value);
			this.print("\n~~> Number was inserted\n\n");
			return "O lugar escolhida mostra um conflito!\nO numero inserido esta se\n repetindo na linha [" + row + "} e coluna [" + column + "]";
		}
		else if (this.ColumnDopells(value, row, column) == true && this.ColumnDopells(value, row, column) == false && QuadrantDopells(value, row, column) == true)
		{
			this.print("\n~~> Rows dopells [true]\n~~> Column dopells [false]\n~~> Quadrant dopells [true]\n");
			this.rows.get(row).getCell(column).setValue(value);
			this.print("\n~~> Number was inserted\n\n");
			return "O lugar escolhida mostra um conflito!\nO numero inserido esta se\n repetindo na linha [" + row + "] e no Quadrante " + quadrant + "]";
		}

		// Column dopells
		else if (this.ColumnDopells(value, row, column) == false && this.ColumnDopells(value, row, column) == true && QuadrantDopells(value, row, column) == false)
		{
			this.print("\n~~> Rows dopells [false]\n~~> Column dopells [true]\n~~> Quadrant dopells [false]\n");
			this.rows.get(row).getCell(column).setValue(value);
			this.print("\n~~> Number was inserted\n\n");
			return "O lugar escolhida mostra um conflito!\nO numero inserido esta se\nrepetindo na coluna [" + column + "]";
		}
		else if (this.ColumnDopells(value, row, column) == false && this.ColumnDopells(value, row, column) == true && QuadrantDopells(value, row, column) == true)
		{
			this.print("\n~~> Rows dopells [false]\n~~> Column dopells [true]\n~~> Quadrant dopells [true]\n");
			this.rows.get(row).getCell(column).setValue(value);
			this.print("\n~~> Number was inserted\n\n");
			return "O lugar escolhida mostra um conflito!\nO numero inserido esta se\nrepetindo na coluna [" + column + "] no quadrante [" + quadrant + "]";
		}

		// Quadrant
		else if (this.ColumnDopells(value, row, column) == false && this.ColumnDopells(value, row, column) == false && QuadrantDopells(value, row, column) == true)
		{
			this.print("\n~~> Rows dopells [false]\n~~> Column dopells [false]\n~~> Quadrant dopells [true]\n");
			this.rows.get(row).getCell(column).setValue(value);
			this.print("\n~~> Number was inserted\n\n");
			return "O lugar escolhida mostra um conflito!\nO numero inserido esta se\nrepetindo no quadrante [" + quadrant + "]";
		}

		else
		{
			return "O lugar escolhida mostra um conflito!\nO numero inserido esta se\nrepetindo no:\n quadrante [" + quadrant + "] na linha [" + row + "] e coluna ["
					+ column + "]";
		}

	}

	public boolean ScanZeros()
	{// Ele È um dos mÈtodos de avaliÁ„o sobre o final do jogo
		for (int i = 0; i < this.rows.size(); i++)
		{
			for (int j = 0; j < this.rows.get(i).getColumnSize(); j++)
			{
				if (this.rows.get(i).getCell(j).getValue() == 0)
				{
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * @deprecated public boolean Scan(int value, int row, int column) {
	 * 
	 * this.print("\n>> (Row) Comparing this value [" + value +
	 * "] at ("+row+", "+column+") with \n");
	 * 
	 * if (this.RowDopells(value, row, column) == true) { return true; }
	 * 
	 * this.print("\n>> (Column) Comparing this value [" + value +
	 * "] at ("+row+", "+column+")  with \n");
	 * 
	 * if (this.ColumnDopells(value, row, column) == true) { return true; } return
	 * false; }
	 */

	public boolean QuadrantDopells(int value, int row, int column)
	{

		/*
		 * possibilidades: 1∫ quadrante row [0, 1] column [0, 1, 2]
		 * 
		 * 2∫ quadrante row [0, 1] column [3, 4, 5]
		 * 
		 * 3∫ quadrante row [2, 3] column [0, 1, 2]
		 * 
		 * 4∫ quadrante row [2, 3] column [3, 4, 5]
		 * 
		 * 5∫ quadrante row [4, 5] column [0, 1, 2]
		 * 
		 * 6∫ quadrante row [4, 5] column [3, 4, 5]
		 * 
		 * 
		 * 3 for com 2 for internos;
		 */

		// Primeiro e Segundo Quadrante
		if (row >= 0 && row < 2)
		{
			for (int r = 0; r < 2; r++)
			{
				this.print("\n>> (Quadrant) Comparing this value [" + value + "] at (" + row + ", " + column + ") with \n");
				for (int c = 0; c < 3 && column < 3; c++)
				{
					this.print("#01 quadrant - [" + this.rows.get(r).getCell(c).getValue() + "] at (" + r + ", " + c + ")\n");
					if (this.rows.get(r).getCell(c).getValue() == value) return true;
				}

				for (int c = 3; c < 6 && column >= 3; c++)
				{
					this.print("#02 quadrant - [" + this.rows.get(r).getCell(c).getValue() + "] at (" + r + ", " + c + ")\n");
					if (this.rows.get(r).getCell(c).getValue() == value) return true;
				}
			}
		}

		// Terceiro e Quarto quadrante
		if (row >= 2 && row < 4)
		{
			for (int r = 2; r < 4 && row > 1 && row < 4; r++)
			{
				this.print("\n>> (Quadrant) Comparing this value [" + value + "] at (" + row + ", " + column + ") with \n");
				for (int c = 0; c < 3 && column < 3; c++)
				{
					this.print("#03 quadrant - [" + this.rows.get(r).getCell(c).getValue() + "] at (" + r + ", " + c + ")\n");
					if (this.rows.get(r).getCell(c).getValue() == value) return true;
				}

				for (int c = 3; c < 6 && column >= 3; c++)
				{
					this.print("#04 quadrant - [" + this.rows.get(r).getCell(c).getValue() + "] at (" + r + ", " + c + ")\n");
					if (this.rows.get(r).getCell(c).getValue() == value) return true;
				}
			}
		}

		// Quinto e Sexto quadrante
		if (row >= 4 && row < 6)
		{
			for (int r = 4; r < 6; r++)
			{
				this.print("\n>> (Quadrant) Comparing this value [" + value + "] at (" + row + ", " + column + ") with \n");
				for (int c = 0; c < 3 && column < 3; c++)
				{
					this.print("#05 quadrant - [" + this.rows.get(r).getCell(c).getValue() + "] at (" + r + ", " + c + ")\n");
					if (this.rows.get(r).getCell(c).getValue() == value) return true;
				}

				for (int c = 3; c < 6 && column >= 3; c++)
				{
					this.print("#06 quadrant - [" + this.rows.get(r).getCell(c).getValue() + "] at (" + r + ", " + c + ")\n");
					if (this.rows.get(r).getCell(c).getValue() == value) return true;
				}
			}
		}

		return false;
	}

	public boolean ColumnDopells(int value, int row, int column)
	{
		this.print("\n>> (Column) Comparing this value [" + value + "] at (" + row + ", " + column + ")  with \n");
		for (int i = 0; i < this.rows.size(); i++)
		{
			this.print(" - [" + this.rows.get(i).getCell(column).getValue() + "] at (" + i + ", " + column + ")\n");
			if (i == row || this.rows.get(i).getCell(column).getValue() == 0)
			{
				continue;
			}
			else if (this.rows.get(i).getCell(column).getValue() == value)
			{
				return true;
			}
		}
		return false;
	}

	public boolean RowDopells(int value, int row, int column)
	{
		this.print("\n>> (Row) Comparing this value [" + value + "] at (" + row + ", " + column + ") with \n");
		for (int i = 0; i < this.rows.size(); i++)
		{
			this.print(" - [" + this.rows.get(row).getCell(i).getValue() + "] at (" + row + ", " + i + ")\n");
			if (i == column)
			{
				continue;
			}
			else
			{
				if (this.rows.get(row).getCell(i).getValue() == 0)
				{
					continue;
				}
				else if (this.rows.get(row).getCell(i).getValue() == value)
				{
					return true;
				}
			}
		}

		return false;
	}

	public String getValue(int row, int column)
	{

		this.print(Integer.toString(this.rows.get(row).getCell(column).getValue()));

		if (this.rows.get(row).getCell(column).getValue() == 0)
		{
			return "";
		}
		else
		{
			return Integer.toString(this.rows.get(row).getCell(column).getValue());
		}

	}

	public Color getColor(int row, int column)
	{
		return this.rows.get(row).getCell(column).getColor();
	}

	public int getRemainingMoves()
	{
		return this.remainingmoves;
	}

	public Sudoku(int size, int model)
	{

		this.print("\t~~~~~~ Building Lilith ~~~~~~\n\n");
		
		for (int i = 0; i < size; i++)
		{
			this.rows.add(new Columns(size));
		}

		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				this.rows.get(i).getCell(j).setChangeable(true);
				this.rows.get(i).getCell(j).setValue(0);
			}
		}

		this.remainingmoves = (size * size);
		this.totalmoves = this.remainingmoves;

		this.ApplyModel(model);

		this.print("\n\n\t~~~~~~ Lilith was Builded ~~~~~~\n\n");
	}

	public void ApplyModel(int model)
	{
		switch (model)
		{
			case 1:
				this.Model_a();
				break;
			case 2:
				this.Model_b();
				break;
		}
	}

	private void Model_a()
	{

		this.fill(2, 0, 1);
		this.fill(1, 0, 4);
		this.fill(3, 1, 0);
		this.fill(1, 1, 1);
		this.fill(6, 1, 2);
		this.fill(5, 1, 5);
		this.fill(5, 2, 1);
		this.fill(3, 3, 4);
		this.fill(5, 4, 0);
		this.fill(4, 4, 3);
		this.fill(6, 4, 4);
		this.fill(1, 4, 5);
		this.fill(6, 5, 1);
		this.fill(5, 5, 4);

		this.rows.get(0).getCell(1).setColor(Color.white);
		this.rows.get(0).getCell(4).setColor(Color.white);
		this.rows.get(1).getCell(0).setColor(Color.white);
		this.rows.get(1).getCell(1).setColor(Color.white);
		this.rows.get(1).getCell(2).setColor(Color.white);
		this.rows.get(1).getCell(5).setColor(Color.white);
		this.rows.get(2).getCell(1).setColor(Color.white);
		this.rows.get(3).getCell(4).setColor(Color.white);
		this.rows.get(4).getCell(0).setColor(Color.white);
		this.rows.get(4).getCell(3).setColor(Color.white);
		this.rows.get(4).getCell(4).setColor(Color.white);
		this.rows.get(4).getCell(5).setColor(Color.white);
		this.rows.get(5).getCell(1).setColor(Color.white);
		this.rows.get(5).getCell(4).setColor(Color.white);

		this.rows.get(0).getCell(1).setChangeable(false);
		this.rows.get(0).getCell(4).setChangeable(false);
		this.rows.get(1).getCell(0).setChangeable(false);
		this.rows.get(1).getCell(1).setChangeable(false);
		this.rows.get(1).getCell(2).setChangeable(false);
		this.rows.get(1).getCell(5).setChangeable(false);
		this.rows.get(2).getCell(1).setChangeable(false);
		this.rows.get(3).getCell(4).setChangeable(false);
		this.rows.get(4).getCell(0).setChangeable(false);
		this.rows.get(4).getCell(3).setChangeable(false);
		this.rows.get(4).getCell(4).setChangeable(false);
		this.rows.get(4).getCell(5).setChangeable(false);
		this.rows.get(5).getCell(1).setChangeable(false);
		this.rows.get(5).getCell(4).setChangeable(false);
	}

	private void Model_b()
	{

		this.fill(3, 0, 2);
		this.fill(5, 0, 3);

		this.fill(6, 1, 1);
		this.fill(3, 1, 4);

		this.fill(5, 2, 1);
		this.fill(2, 2, 2);
		this.fill(3, 2, 3);
		this.fill(6, 2, 4);

		this.fill(1, 3, 1);
		this.fill(6, 3, 2);
		this.fill(4, 3, 3);
		this.fill(5, 3, 4);

		this.fill(3, 4, 1);
		this.fill(2, 4, 4);

		this.fill(5, 5, 2);
		this.fill(6, 5, 3);

		this.rows.get(0).getCell(2).setColor(Color.white);
		this.rows.get(0).getCell(3).setColor(Color.white);

		this.rows.get(1).getCell(1).setColor(Color.white);
		this.rows.get(1).getCell(4).setColor(Color.white);

		this.rows.get(2).getCell(1).setColor(Color.white);
		this.rows.get(2).getCell(2).setColor(Color.white);
		this.rows.get(2).getCell(3).setColor(Color.white);
		this.rows.get(2).getCell(4).setColor(Color.white);

		this.rows.get(3).getCell(1).setColor(Color.white);
		this.rows.get(3).getCell(2).setColor(Color.white);
		this.rows.get(3).getCell(3).setColor(Color.white);
		this.rows.get(3).getCell(4).setColor(Color.white);

		this.rows.get(4).getCell(1).setColor(Color.white);
		this.rows.get(4).getCell(4).setColor(Color.white);

		this.rows.get(5).getCell(2).setColor(Color.white);
		this.rows.get(5).getCell(3).setColor(Color.white);

		this.rows.get(0).getCell(2).setChangeable(false);
		this.rows.get(0).getCell(3).setChangeable(false);

		this.rows.get(1).getCell(1).setChangeable(false);
		this.rows.get(1).getCell(2).setChangeable(false);

		this.rows.get(2).getCell(1).setChangeable(false);
		this.rows.get(2).getCell(2).setChangeable(false);
		this.rows.get(2).getCell(3).setChangeable(false);
		this.rows.get(2).getCell(4).setChangeable(false);

		this.rows.get(3).getCell(1).setChangeable(false);
		this.rows.get(3).getCell(2).setChangeable(false);
		this.rows.get(3).getCell(3).setChangeable(false);
		this.rows.get(3).getCell(4).setChangeable(false);

		this.rows.get(4).getCell(1).setChangeable(false);
		this.rows.get(4).getCell(4).setChangeable(false);

		this.rows.get(5).getCell(2).setChangeable(false);
		this.rows.get(5).getCell(3).setChangeable(false);

	}

	public void show()
	{
		this.print("\n\n");
		for (int i = 0; i < this.rows.size(); i++)
		{
			if (i == 2 || i == 4)
			{
				this.print("\n");
			}
			this.print("row [" + (i + 1) + "] ");
			for (int j = 0; j < this.rows.get(i).getColumnSize(); j++)
			{
				if (j == 3)
				{
					this.print("\t");
				}
				this.print(" [" + this.rows.get(i).getCell(j).getValue() + "]");
			}
			this.print("\n\n");
		}
	}

	public void print(String x)
	{
		System.out.printf(x);
	}
}
