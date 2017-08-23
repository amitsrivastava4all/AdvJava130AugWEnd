import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
	
	private String columns[]={"Id","Name"}; 

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return CRUDApp.getQuestions().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	public String getColumnName(int col) {
		System.out.println("Column Count "+col+" "+columns[col]);
	      return columns[col];
	    }
	
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object object  = null;
		System.out.println("RowIndex  "+rowIndex+" Column "+columnIndex);
		ArrayList<Question> questionList = CRUDApp.getQuestions();
		Question question = questionList.get(rowIndex);
	      switch (columnIndex) {
	      case 0:
	    	  object=  question.getId();
	        break;
	      case 1:
	    	  object= question.getQuestion();
	        break;
	      
	      }
	      return object;
	}

}
