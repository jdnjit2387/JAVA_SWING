import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.text.DateFormat;

public class Main extends JApplet {	
	public void init(){
		this.setFont(new Font("Tahoma",1,20));
		setSize(400, 400);
		
	}

  public void paint(Graphics page){
	  
	  //header
	  page.drawString("My rendition of a person", 10, 25);
	  
	  //display the current date
	  Font f =new Font("Serif", Font.BOLD, 20);
	  page.setFont(f);
	  Date today=new Date();
	  DateFormat df= DateFormat.getDateInstance();
	  String s = df.format(today);
	  page.setColor(Color.black);
	  page.drawString(s,10,50);
	  
	  //Face
	  page.setColor(Color.YELLOW);
	  page.fillOval(100, 50, 100, 100);
	  
	  //Eyebrows
	  Color c = new Color(0, 0, 0);
	  page.setColor(c);
	  for(int i = 1; i < 5; i++)
		  page.drawArc(115, 70+i, 20, 5, 0, 180);
	  for(int i = 1; i < 5; i++)
		  page.drawArc(165, 70+i, 20, 5, 0, 180);
	  
	  //Eyes
	  page.setColor(Color.BLUE);
	  page.fillOval(120, 80, 10, 10);
	  page.fillOval(170, 80, 10, 10);
	  
	  //Nose
	  page.setColor(Color.BLACK);
	  page.fillOval(140, 100, 20, 20);
	  
	  //Happy smile
	  Color c1 = new Color(204, 36, 205);
	  page.setColor(c1);
	  for(int i = 1; i < 10; i++)
		  page.drawArc(120, 110+i, 60, 20, 180, 180);
	 
	  //body
	  page.setColor(Color.yellow);
	  for(int i=1; i<10;i++)
	   page.fillArc(100, 150+i, 100, 100, 0, 180);
	  page.fillRect(100, 200, 100, 50);
	  
	  //Legs
	  Color c3=new Color(153,76,0);
	  page.setColor(c3);
	  int[] xLegs1= {100,100,130,150};
	  int[] yLegs1= {250,350,350,250};
	  page.fillPolygon(xLegs1, yLegs1, 4);
      int[] xLegs2= {150,200,200,170};
	  int[] yLegs2= {250,250,350,350};
	  page.fillPolygon(xLegs2, yLegs2, 4);
	  
	  //Hands
	  page.setColor(Color.yellow);
	  page.fillRect(50, 200, 50, 20);
	  page.fillRect(200, 200, 50, 20); 
	    
  }
}
