import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmployeeInterface {

	private JTextField jtxtEmployeeID;
	private JTable table;
	private JTextField jtxtSINumber;
	private JTextField jtxtFirstName;
	private JTextField jtxtSurname;
	private JTextField jtxtSalary;
	private JTextField jtxtDOB;
	private JTextField jtxtAge;
	private JTextField jtxtGender;  
	
	public EmployeeInterface( JPanel cardPanel, CardLayout cl) {
		JPanel employeeInterface = new JPanel();
		employeeInterface.setLayout(new BorderLayout());
		JPanel infoPanel = new JPanel();
		EmpObj emp = new EmpObj();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.PAGE_AXIS));

		//idpanel
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new BoxLayout(idPanel, BoxLayout.LINE_AXIS));
		JLabel lblempID = new JLabel("Employee ID");

		jtxtEmployeeID = new JTextField();

		idPanel.add(lblempID);
		idPanel.add(jtxtEmployeeID);
		infoPanel.add(idPanel);
		//idpanel

		//ni panel
		JPanel SIPanel = new JPanel();
		SIPanel.setLayout(new BoxLayout(SIPanel, BoxLayout.LINE_AXIS));
		JLabel lblSINum = new JLabel("SI Number");

		jtxtSINumber = new JTextField();

		SIPanel.add(lblSINum);
		SIPanel.add(jtxtSINumber);
		infoPanel.add(SIPanel);

		//ni panel

		//first name panel
		JPanel firstNamePanel = new JPanel();
		firstNamePanel.setLayout(new BoxLayout(firstNamePanel, BoxLayout.LINE_AXIS));
		JLabel lblFirstName= new JLabel("First Name");

		jtxtFirstName = new JTextField();

		firstNamePanel.add(lblFirstName);
		firstNamePanel.add(jtxtFirstName);
		infoPanel.add(firstNamePanel);
		//first name panel
		
		//surname

		JPanel surnamePanel = new JPanel();
		surnamePanel.setLayout(new BoxLayout(surnamePanel, BoxLayout.LINE_AXIS));
		JLabel lblSurname= new JLabel("Surname");

		jtxtSurname = new JTextField();

		surnamePanel.add(lblSurname);
		surnamePanel.add(jtxtSurname);
		infoPanel.add(surnamePanel);

		//surname

		//salary

		JPanel salaryPanel = new JPanel();
		salaryPanel.setLayout(new BoxLayout(salaryPanel, BoxLayout.LINE_AXIS));
		JLabel lblSalary = new JLabel("Salary");

		jtxtSalary = new JTextField();

		salaryPanel.add(lblSalary);
		salaryPanel.add(jtxtSalary);
		infoPanel.add(salaryPanel);

		//salary

		//date of birth

		JPanel DOBPanel = new JPanel();
		DOBPanel.setLayout(new BoxLayout(DOBPanel, BoxLayout.LINE_AXIS));
		JLabel lblDOB = new JLabel("DOB");

		jtxtDOB = new JTextField();

		DOBPanel.add(lblDOB);
		DOBPanel.add(jtxtDOB);
		infoPanel.add(DOBPanel);

		//date of birth

		//age

		JPanel agePanel = new JPanel();
		agePanel.setLayout(new BoxLayout(agePanel, BoxLayout.LINE_AXIS));
		JLabel lblAge = new JLabel("Age");

		jtxtAge = new JTextField();

		agePanel.add(lblAge);
		agePanel.add(jtxtAge);
		infoPanel.add(agePanel);

		//age

		//gender

		JPanel genderPanel = new JPanel();
		genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.LINE_AXIS));
		JLabel lblGender = new JLabel("Gender");

		jtxtGender = new JTextField();

		genderPanel.add(lblGender);
		genderPanel.add(jtxtGender);
		infoPanel.add(genderPanel);

		//gender

		//position

		JPanel positionPanel = new JPanel();
		positionPanel.setLayout(new BoxLayout(positionPanel, BoxLayout.LINE_AXIS));
		JLabel lblPosition = new JLabel("Position");

		JComboBox comboBoxPosition = new JComboBox(emp.getPositions());

		positionPanel.add(lblPosition);
		positionPanel.add(comboBoxPosition);
		infoPanel.add(positionPanel);
		//position

		employeeInterface.add(infoPanel, BorderLayout.WEST);

		//table
		JScrollPane empScrollPane = new JScrollPane();

		table = new JTable();
		table.setModel(new DefaultTableModel(//table to display all employees
				new Object[][] {
					{null, null, null, null, null, null, null, null, null},
				},
				new String[] {
						"EmpID", "SINumber", "FirstName", "Surname", "Gender", "Age", "DOB", "Salary", "Position"
				}
				));
		empScrollPane.setViewportView(table);

		//table

		employeeInterface.add(empScrollPane, BorderLayout.CENTER);

		//buttons

		JPanel empButPanel = new JPanel();

		JButton addEmp = new JButton("Add New");
		addEmp.addActionListener(new ActionListener() {
			//button for adding new employee
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();

				String pos = (String) comboBoxPosition.getItemAt(comboBoxPosition.getSelectedIndex());

				emp.getEmps().add(new EmpObj(jtxtEmployeeID.getText(), jtxtSINumber.getText(), jtxtFirstName.getText(), jtxtSurname.getText(), jtxtGender.getText() , jtxtDOB.getText(), jtxtAge.getText(), jtxtSalary.getText(), pos));

				model.addRow(new Object[] {
						jtxtEmployeeID.getText(),
						jtxtSINumber.getText(),
						jtxtFirstName.getText(),
						jtxtSurname.getText(),
						jtxtGender.getText(),
						jtxtDOB.getText(),
						jtxtAge.getText(),
						jtxtSalary.getText(),
						pos
				});
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Employee Database System", JOptionPane.OK_OPTION);
					}
				}
			}
		});

		empButPanel.add(addEmp);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			//button to print the table out
			public void actionPerformed(ActionEvent e) {

				try {
					table.print();
				}
				catch(java.awt.print.PrinterException ev) {
					System.err.format("No Printer found", ev.getMessage());
				}
			}
		});
		empButPanel.add(btnPrint);
		
		JButton back = new JButton("Main Menu");
		back.addActionListener(new ActionListener() {//go to management interface
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cardPanel, "1");
			}
		});
		empButPanel.add(back);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			//clear all text fields
			public void actionPerformed(ActionEvent e) {

				jtxtEmployeeID.setText(null);
				jtxtSINumber.setText(null);
				jtxtFirstName.setText(null);
				jtxtSurname.setText(null);
				jtxtGender.setText(null);
				jtxtDOB.setText(null);
				jtxtAge.setText(null);
				jtxtSalary.setText(null);
				comboBoxPosition.setSelectedIndex(0);
			}
		});
		empButPanel.add(btnReset);



		
		employeeInterface.add(empButPanel, BorderLayout.SOUTH);

		cardPanel.add(employeeInterface, "4");
	}

}