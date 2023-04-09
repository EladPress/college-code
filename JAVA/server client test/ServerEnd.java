// 2-10-2021 MS
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ServerEnd 
{
	static int port =8080;
	
	private ServerSocket server ;
	private Socket socket;

	private JFrame frmServerChat;
	private JTextField textField;
	private JTextArea textArea;
	private JButton button;
	private JScrollPane scrollPane;
	private JLabel label1;
	private JLabel label2;
	
	
	public ServerEnd() throws IOException 
	{
		initializeGUI();
	}

	public  void serverConnection() throws IOException
	{
		 server = new ServerSocket(port);
		 socket = server.accept();
		 label2.setText("Client found !");
		 label2.setForeground(new Color(0, 0, 128));
		 
		 while (true) {
			try {
				
				DataInputStream input = new DataInputStream(socket.getInputStream());
				String string = input.readUTF();
				textArea.setText(textArea.getText() + "\n " + "Client: " + string);
			} catch (Exception ev) {
				 textArea.setText(textArea.getText()+" \n" +"Network Problem");
				 
					try {
						socket.close();
						Thread.sleep(5000);
						System.exit(0);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

		}
	}

	

	private void initializeGUI() throws IOException 
	{
		frmServerChat = new JFrame();
		frmServerChat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmServerChat.setBackground(UIManager.getColor("MenuBar.highlight"));
		frmServerChat.setForeground(Color.WHITE);
		frmServerChat.setBackground(Color.WHITE);
		frmServerChat.setTitle("Example MS: Server Chat");
		frmServerChat.setForeground(Color.WHITE);
		frmServerChat.setBounds(100, 100, 605, 403);
		frmServerChat.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lato Semibold", Font.PLAIN, 24));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(12, 67, 344, 38);
		frmServerChat.add(textField);
		textField.setColumns(10);
		
		button = new JButton("Send");
		
		button.addActionListener(new ActionListener() {
			 
			public void actionPerformed(ActionEvent e) {
				
				if (textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Please write some text !");
			 
				}
				else if(textField.isFocusable()){
					button.setEnabled(true);
					textArea.setText(textArea.getText() + "\n" + "Server : " + textField.getText());
					try {
						DataOutputStream output = new DataOutputStream(socket.getOutputStream());
						output.writeUTF(textField.getText());
					} catch (IOException e1) {
						textArea.setText(textArea.getText() + "\n " + " Network Problem");
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
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLUE);
		button.setBounds(390, 66, 164, 38);
		frmServerChat.add(button);
		 
		 scrollPane = new JScrollPane();
		 scrollPane.setBounds(12, 134, 557, 157);
		 frmServerChat.add(scrollPane);
		
		 textArea = new JTextArea();
		 scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		textArea.setForeground(Color.ORANGE);
		textArea.setBackground(Color.DARK_GRAY);
		
		label1 = new JLabel();
		label1.setFont(new Font("Dialog", Font.BOLD, 16));
		
		label1.setBounds(154, 13, 242, 33);
		frmServerChat.add(label1);
		
		label1.setText("Waiting for connection");
		label1.setForeground(Color.GREEN);
	

		 label2 = new JLabel();
		label2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		label2.setBounds(22, 303, 128, 30);
		frmServerChat.add(label2);
		
		frmServerChat.setVisible(true);
	
	}
	
	public static void main(String[] args) throws IOException 
	{
		ServerEnd s = new ServerEnd();
		s.serverConnection();
	}
}
