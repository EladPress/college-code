// 2-10-2021 MS

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ClientEnd {
	
	private Socket socket;

	private JFrame frame;
	private JTextField textField;
    private JTextArea textArea;
    private JButton button;
    private JScrollPane scrollPane;
    
    public ClientEnd()
    {
		initializeGUI();
	}
    
    public void initializeGUI() 
	{
    	
		frame = new JFrame();
		frame.setTitle("Client Chat");
		frame.setBackground(UIManager.getColor("MenuBar.highlight"));
		frame.setBounds(100, 100, 605, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lato Medium", Font.PLAIN, 22));
		textField.setForeground(Color.ORANGE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(12, 45, 344, 38);
		frame.add(textField);
		textField.setColumns(10);
		
		button = new JButton("Send");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please write some text !");
				}else  {
					textArea.setText(textArea.getText() + "\n" + "Client : " + textField.getText());
					try {
						DataOutputStream output = new DataOutputStream(socket.getOutputStream());
						output.writeUTF(textField.getText());
					} catch (IOException e1) {
						textArea.setText(textArea.getText() + "\n " + " Network issues");
						try {
							Thread.sleep(2000);
							System.exit(0);
						} catch (InterruptedException e2) {
							e2.printStackTrace();
						}

					}
					textField.setText("");
				}
			}
					
		});
		
		button.setFont(new Font("Georgia", Font.BOLD, 22));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.RED);
		button.setBounds(398, 45, 164, 38);
		frame.add(button);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 149, 557, 157);
		frame.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 128, 128));
		
		frame.setVisible(true);
	}
    
    public  void clientConnection() throws IOException
	{
    	socket = new Socket("127.0.0.1", ServerEnd.port);// MS 127.0.0.1 is IP of local host
		//socket = new Socket("localhost", 8080); // MS  als0 works
    	 while (true) 
		 {
			try {
				
				DataInputStream input = new DataInputStream(socket.getInputStream());
				String string = input.readUTF();
				textArea.setText(textArea.getText() + "\n" + "Server: " + string);
			} catch (Exception ev) {
				 textArea.setText(textArea.getText()+" \n" +"Network Problem ");

				 try {
					 socket.close();
						Thread.sleep(5000);
						System.exit(0);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
			
		}
		
	}
  
	public static void main(String[] args) throws IOException 
	{
		ClientEnd c = new ClientEnd();
		c.clientConnection();  
	}
}
