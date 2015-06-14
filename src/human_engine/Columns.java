package human_engine;

import java.util.LinkedList;

public class Columns {

    private LinkedList<Cell> cell = new LinkedList<Cell>();

    public Cell getCell(int index) {
        return this.cell.get(index);
    }

    public int getColumnSize() {
        return this.cell.size();
    }

    public Columns(int size) {
        for (int i = 0; i < size; i++) {
            this.cell.add(new Cell());
        }
    }
}
