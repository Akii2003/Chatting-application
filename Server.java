
package chatting.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Server extends JFrame implements ActionListener{
    
     JTextField text;
     JPanel a1;
     Box vertical=Box.createVerticalBox();
	
	Server(){
		
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setBackground(new Color(7,94,98));
		p1.setBounds(0,0,450,70);
		p1.setLayout(null);
		add(p1);
		 
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
		Image i2=i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel back=new JLabel(i3);
		back.setBounds(5, 25 ,25, 25);
		p1.add(back);// add is use to place one layer above other
                
                back.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent ae){
                        System.exit(0);
                    }
                });
                
                ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
		Image i5=i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel profile=new JLabel(i6);
		profile.setBounds(40, 10 ,50, 50);
		p1.add(profile);
                
                
                ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
		Image i8=i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i9=new ImageIcon(i8);
		JLabel video=new JLabel(i9);
		video.setBounds(300, 20 ,30, 30);
		p1.add(video);
                
                ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
		Image i11=i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
		ImageIcon i12=new ImageIcon(i11);
		JLabel phone=new JLabel(i12);
		phone.setBounds(360, 20 ,35, 30);
		p1.add(phone);
                
                
                ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
		Image i14=i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
		ImageIcon i15=new ImageIcon(i14);
		JLabel moreLabel=new JLabel(i15);
		moreLabel.setBounds(420, 20 ,10, 25);
		p1.add(moreLabel);
                
                //JLabel is used to write anything on the Frame
                JLabel name=new JLabel("Jordan");
                name.setForeground(Color.WHITE);
                name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
                name.setBounds(110,15,100,18);
                p1.add(name);
               
                JLabel status=new JLabel("Active now");
                status.setBounds(110,35,100,18);
                status.setForeground(Color.WHITE);
                status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
                p1.add(status);
		
                
                a1=new JPanel();
                a1.setBounds(5, 75, 440, 570);
                add(a1);
                
                text=new JTextField();
                text.setBounds(2,655,310,40);
                text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
                add(text);
                
                JButton send=new JButton("SEND");
                send.setBounds(320,655,123,40);
                send.setBackground(new Color(7,94,84));
                send.setForeground(Color.WHITE);
                send.addActionListener(this);
                send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
                add(send);
                
		
		
		setSize(450,700);
		setLocation(200,50);
                setUndecorated(true);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}

    
    public void actionPerformed(ActionEvent ae){
        String out=text.getText();
        
        JLabel output=new JLabel(out);
        JPanel p2=new JPanel();
        p2.add(output);
        
        
        
        a1.setLayout(new BorderLayout());
        
        JPanel right=new JPanel(new BorderLayout());
        right.add(p2,BorderLayout.LINE_END);
        vertical.add(right);
        vertical.add(Box.createVerticalStrut(15) );
        a1.add(vertical,BorderLayout.PAGE_START);
        
        repaint();
        invalidate();
        validate();
        
        
        
            
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server();

	}

}