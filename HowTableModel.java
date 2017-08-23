interface TM{
	public int getColumnCount();
	public String getColumnName(int col);
	public void notUse();
}
abstract class AbstractTM implements TM{
	public void notUse(){
		
	}
}
class MyModel extends AbstractTM{
	String columns []={"Id","Name"}; 
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return columns[col];
	}
	
}
class JTableTest {
	public void setModel(TM tm){
		for(int i = 0;i<tm.getColumnCount(); i++){
			String columnName = tm.getColumnName(i);
			System.out.println(columnName);
		}
	}
}
public class HowTableModel {

	public static void main(String[] args) {
		JTableTest obj= new JTableTest();
		obj.setModel(new MyModel());

	}

}
