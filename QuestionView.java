import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

class CustomRenderer extends DefaultTableCellRenderer 
{
private static final long serialVersionUID = 6703872492730589499L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if(row%2==0){
        	cellComponent.setBackground(Color.YELLOW);
        }
        else{
        	cellComponent.setBackground(Color.CYAN);
        }
//        if(row == 0){
//            cellComponent.setBackground(Color.YELLOW);
//        } else if ( row == 1){
//            cellComponent.setBackground(Color.GRAY);
//        } else {
//            cellComponent.setBackground(Color.CYAN);
//        }
        return cellComponent;
    }
}

public class QuestionView extends JFrame {
	JTextArea qname = new JTextArea();
	private JPanel contentPane;
	JLabel qid = new JLabel("");
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionView frame = new QuestionView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuestionView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(32, 32, 61, 16);
		contentPane.add(lblId);
		
		
		qid.setBounds(72, 32, 118, 16);
		qid.setText(String.valueOf(Question.getCounter()));
		contentPane.add(qid);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(32, 76, 61, 16);
		contentPane.add(lblName);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(105, 76, 280, 121);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(qname);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addQuestion();
			}
		});
		btnAdd.setBounds(6, 254, 117, 29);
		contentPane.add(btnAdd);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(16, 295, 473, 142);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
	}
	private void addQuestion(){
		String question = qname.getText();
		if(CRUDApp.addQuestion(question)){
			JOptionPane.showMessageDialog(this, "Question Added....");
		}
		System.out.println(CRUDApp.getQuestions());
		qid.setText(String.valueOf(Question.getCounter()));
		clearFields();
		table.setModel(new TableModel());
		table.getColumnModel().getColumn(0).setCellRenderer(new CustomRenderer());
        table.getColumnModel().getColumn(1).setCellRenderer(new CustomRenderer());
	}
	
	private void clearFields(){
		qname.setText("");
		qname.requestFocus();
	}
}
