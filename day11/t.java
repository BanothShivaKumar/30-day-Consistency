import javax.swing.*;
public class t {
    t()
    {JFrame  jf=new JFrame();    
    	String table_data[][]={ {"1001","Cherry"}, {"1002","Candy"}, {"1003","Coco"}};    
    	String table_column[]={"SID","SNAME"};         
    	JTable jt=new JTable(table_data,table_column);    
    	jt.setBounds(30,40,200,300);          
    	JScrollPane tsp=new JScrollPane(jt);    
    	jf.add(tsp);          
    	jf.setSize(300,400);    
    	jf.setVisible(true);    
	}
    public static void main(String args[])
    {
        t a=new t();
    }
}
