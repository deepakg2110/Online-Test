 
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0;  
    int m[]=new int[10];      
    OnlineTest(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Result");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  

      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)
		{
			l.setText("Que1: Varanasi is famous for?");
			jb[0].setText("Ganga aarti");jb[1].setText("Paan");jb[2].setText("Saree");jb[3].setText("Laasi");
		}
		if(current==1)
		{
			l.setText("Que2: Awanish college name?");
			jb[0].setText("NIT");jb[1].setText("IIT");jb[2].setText("MIT");jb[3].setText("ABESIT");
		}
		if(current==2)
		{
			l.setText("Que3: Deepak college name?");
			jb[0].setText("NIT");jb[1].setText("IIT");jb[2].setText("MIT");jb[3].setText("ABESIT");
		}
		if(current==3)
		{
			l.setText("Que4: Your highest education Qualification?");
			jb[0].setText("B.Sc");jb[1].setText("B.tech");jb[2].setText("M.Tech");jb[3].setText("P.hd");
		}
		if(current==4)
		{
			l.setText("What is capital of INDIA?");
			jb[0].setText("Rajasthan");jb[1].setText("Mumbai");jb[2].setText("Chennai");jb[3].setText("Delhi");
		}
		if(current==5)
		{
			l.setText("Mahatma Gandhi DOB is?");
			jb[0].setText("5 September");jb[1].setText("2 October");jb[2].setText("26 January");jb[3].setText("15 August");
		}
		if(current==6)  
	     {  
	     l.setText("Que7: Founder of java?");  
	     jb[0].setText("Guido van Rossum");jb[1].setText("James Gosling");jb[2].setText("Dennis Ritchie");jb[3].setText("Rasmus Lerdorf");  
	     }  
	        	if(current==7)  
	        	{  
	            	l.setText("Que8: World Richest Person?");  
	            	jb[0].setText("Bill Gates");jb[1].setText("Bernard Arnault Family");jb[2].setText("Warren Buffett");jb[3].setText("Jeff Bezos");         
	        	}  
	        	if(current==8)  
	        	{  
	            	l.setText("Que9: Wikipedia back-end(server-side) is written in?");  
	            	jb[0].setText("PHP");jb[1].setText("Java");jb[2].setText("C");jb[3].setText("Python");  
	        	}  
	        	if(current==9)  
	        	{  
	        	l.setText("Que10: Who invented Computer?");  
	         	jb[0].setText("Philo Taylor Farnsworth");jb[1].setText("Adam Osborne");jb[2].setText("Charles Babbage");jb[3].setText("Seymour Cray");  
	        	} 
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
    	if(current==0)
    	    return(jb[0].isSelected());
    	if(current==1)  
                return(jb[0].isSelected());  
            if(current==2)  
                return(jb[3].isSelected());  
            if(current==3)  
                return(jb[1].isSelected());  
            if(current==4)  
                return(jb[3].isSelected());  
            if(current==5)  
                return(jb[1].isSelected());  
            if(current==6)  
                return(jb[1].isSelected());  
            if(current==7)  
                return(jb[3].isSelected());  
            if(current==8)  
                return(jb[0].isSelected());  
            if(current==9)  
                return(jb[2].isSelected()); 
        return false;  
    }  
    public static void main(String s[])  
    {  
        new OnlineTest("Online Test");  
    }  
}  