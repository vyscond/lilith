package human_engine;

import java.util.LinkedList;

public class Rows
{
	protected LinkedList<Columns> column = new LinkedList<Columns>();
	
	protected Columns getColumns(int index)
	{
		return this.column.get(index);
	}
	
	protected int getRowSize()
	{
		return this.column.size();
	}
	
	public Rows(int size) 
	{
    for (int i = 0; i < size; i++) 
    {
        this.column.add(new Columns(size));
    }
	}
}
