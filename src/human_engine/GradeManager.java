package human_engine;

import java.util.LinkedList;

public class GradeManager
{ 
	private LinkedList<Rows> grade	= new LinkedList<Rows>();
	
	public Rows getRow(int index)
	{
		return this.grade.get(index);
	}
}
