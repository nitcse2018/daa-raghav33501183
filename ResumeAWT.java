
package abc;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.FileWriter;

public class ResumeAWT extends Frame implements ActionListener{
	private TextField Name;
	private TextField Date_Of_Birth;
	private TextField Phone_No;
	private TextField Email;
	private TextField Address;
	private TextField Educational_Qualification;
	private TextField Skills;
	private TextField Sex;
	
	public ResumeAWT() {
		
		setSize(900, 900);
		setLayout(new GridLayout(21, 0, 5, 5));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		Label Beg = new Label("Resume");
		add(Beg);
		
		Label name_L = new Label("Name: ");
		add(name_L);
		Name = new TextField();
		add(Name);
		
		Label Date_Of_Birth_L = new Label("Date_Of_Birth: ");
		add(Date_Of_Birth_L);
		Date_Of_Birth = new TextField();
		add(Date_Of_Birth);
		
		Label Phone_No_L = new Label("Phone_No: ");
		add(Phone_No_L);
		Phone_No = new TextField();
		add(Phone_No);
		
		Label Email_L = new Label("Email: ");
		add(Email_L);
		Email = new TextField();
		add(Email);
		
		Label Address_L = new Label("Address: ");
		add(Address_L);
		Address = new TextField();
		add(Address);
		
		Label Educational_Qualification_L = new Label("Educational_Qualification: ");
		add(Educational_Qualification_L);
		Educational_Qualification = new TextField();
		add(Educational_Qualification);
		
		Label Skills_L = new Label("Skills: ");
		add(Skills_L);
		Skills = new TextField();
		add(Skills);
		
		Label Sex_L = new Label("Sex: ");
		add(Sex_L);
		Sex = new TextField();
		add(Sex);
		Choice c = new Choice();
		c.add("Male");
		c.add("Female");
		c.add("Other");
		Button submit = new Button("SUBMIT");
		
		add(submit);
		submit.setActionCommand("Submit");
		submit.addActionListener(this);
		
		setVisible(true);
	}
		
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			System.out.print(cmd);
			if(cmd.equals("Submit"))
			{
				try {
					FileWriter f = new FileWriter("RB.txt", true);
					
					String s1 = "Name: "+Name.getText();
					String s2 = "Date_Of_Birth: " + Date_Of_Birth.getText();
					String s3 = "Phone_No: "+ Phone_No.getText();
					String s4 = "Email: " + Email.getText();
					String s5 = "Address: " + Address.getText();
					String s6 = "Educational_Qualification: " + Educational_Qualification.getText();
					String s7 = "Skills: " + Skills.getText();
					String s8 = "Sex: " + Sex.getText() + " " + c.getSelectedItem();
					f.write(s1+"\n");
					f.write(s2+"\n");
					f.write(s3+"\n");
					f.write(s4+"\n");
					f.write(s5+"\n");
					f.write(s6+"\n");
					f.write(s7+"\n");
					f.write(s8+"\n");
					
					f.close();
					System.out.println("\nData Successfully Added");
				}
				
				catch(Exception e1) {
					System.err.println(e1);
				}
			}
			
		}
	public static void main(String[] args) {
		
		new ResumeAWT();

	}

}
