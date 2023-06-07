import java.awt.*;
import java.awt.event.*;
class awt11 extends Frame implements ActionListener
{
	int bill=0,amount=0,discount=0;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	Label DATE_OF_CHECKIN,DATE_OF_CHECKOUT,NO_OF_MEMBERS,ROOM_TYPE,FACILITY,lb1,lb2,lb3,DISCOUNT,MEMBERSHIP,TOTAL;
	Button NO_OF_DAYS,GENERATE_BILL,NO_OF_ROOMS,RESTART,PAY;
	Checkbox NORMAL,DELUX,AC,LUNCH,DINNER,BREAKFAST,SPA,MASSAGE,SWIMMING_POOL,YES,NO;
	
	awt11()
	{
		DATE_OF_CHECKIN=new Label("DATE_OF_CHECKIN");
		DATE_OF_CHECKIN.setBounds(50,50,150,30);
		tf1=new TextField("");
		tf1.setBounds(200,50,100,30);
		
		DATE_OF_CHECKOUT=new Label("DATE_OF_CHECKOUT");
		DATE_OF_CHECKOUT.setBounds(400,50,150,30);
		tf2=new TextField("");
		tf2.setBounds(600,50,100,30);
		
		NO_OF_DAYS=new Button("NO OF DAYS");
		NO_OF_DAYS.setBounds(50,100,100,30);
		NO_OF_DAYS.addActionListener(this); 
		tf3=new TextField("");
		tf3.setBounds(200,100,100,30);
		
		NO_OF_MEMBERS=new Label("NO_OF_MEMBERS");
		NO_OF_MEMBERS.setBounds(50,150,100,30);
		tf4=new TextField("");
		tf4.setBounds(200,150,100,30);
		
		NO_OF_ROOMS=new Button("NO OF ROOMS ");
		NO_OF_ROOMS.setBounds(50,200,100,30);
		NO_OF_ROOMS.addActionListener(this);
		tf5=new TextField("");
		tf5.setBounds(200,200,100,30);
		
		ROOM_TYPE=new Label("ROOM TYPE");
		ROOM_TYPE.setBounds(50,250,100,30);
		CheckboxGroup obj=new CheckboxGroup();
		NORMAL=new Checkbox("NORMAL",false,obj);
		NORMAL.setBounds(200,250,100,30);
		lb1=new Label("1000-INR");
		lb1.setBounds(200,290,100,30);
		
		DELUX=new Checkbox("DELUX",false,obj);
		DELUX.setBounds(400,250,100,30);
		lb2=new Label("1500-INR");
		lb2.setBounds(400,290,100,30);
		
		AC=new Checkbox("AC",false,obj);
		AC.setBounds(600,250,100,30);
		lb3=new Label("2000-INR");
		lb3.setBounds(600,290,100,30);
		
		FACILITY=new Label("FACILITY");
		FACILITY.setBounds(50,350,100,30);
		LUNCH=new Checkbox("LUNCH",false);
		LUNCH.setBounds(200,350,100,30);
		DINNER=new Checkbox("DINNER",false);
		DINNER.setBounds(400,350,100,30);
		BREAKFAST=new Checkbox("BREAKFAST",false);
		BREAKFAST.setBounds(600,350,100,30);
		SPA=new Checkbox("SPA",false);
		SPA.setBounds(200,400,100,30);
		MASSAGE=new Checkbox("MASSAGE",false);
		MASSAGE.setBounds(400,400,100,30);
		SWIMMING_POOL=new Checkbox("SWIMMING POOL",false);
		SWIMMING_POOL.setBounds(600,400,200,30);
		
		
		MEMBERSHIP=new Label("MEMBERSHIP");
		MEMBERSHIP.setBounds(50,450,100,30);
		YES=new Checkbox("YES",false,obj);
		YES.setBounds(200,450,100,30);
		NO=new Checkbox("NO",false,obj);
		NO.setBounds(400,450,100,30);
		
		DISCOUNT=new Label("DISCOUNT");
		DISCOUNT.setBounds(50,500,150,30); 
		tf6=new TextField("");
		tf6.setBounds(200,500,150,30);
		
		TOTAL=new Label("TOTAL");
		TOTAL.setBounds(50,550,100,30);
		tf7=new TextField("");
		tf7.setBounds(200,550,150,30);
		
		PAY=new Button("PAY");
		PAY.setBounds(50,600,100,30);
		PAY.addActionListener(this);
		tf8=new TextField("");
		tf8.setBounds(200,600,150,30);
		
		GENERATE_BILL=new Button("GENERATE BILL");
		GENERATE_BILL.addActionListener(this);
		GENERATE_BILL.setBounds(50,700,100,30);
		
		RESTART=new Button("RESTART");
		RESTART.setBounds(200,700,100,30);
		RESTART.addActionListener(this);
		
		
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		add(tf6);
		add(tf7);
		add(tf8);
		add(DATE_OF_CHECKIN);
		add(DATE_OF_CHECKOUT);
		add(NO_OF_MEMBERS);
		add(NO_OF_DAYS);
		add(NO_OF_ROOMS);
		add(ROOM_TYPE);
		add(NORMAL);
		add(lb1);
		add(DELUX);
		add(lb2);
		add(AC);
		add(lb3);
		add(FACILITY);
		add(LUNCH);
		add(DINNER);
		add(BREAKFAST);
		add(MASSAGE);
		add(SPA);
		add(SWIMMING_POOL);
		add(MEMBERSHIP);
		add(YES);
		add(NO);
		add(TOTAL);
		add(DISCOUNT);
		add(PAY);
		add(GENERATE_BILL);
		add(RESTART);
		
		setSize(800,800);
		setLayout(null);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c=0,n,x;
		if(ae.getSource()==NO_OF_DAYS)
		{
			a=Integer.parseInt(tf1.getText());
			b=Integer.parseInt(tf2.getText());
			c=b-a;	
			tf3.setText(String.valueOf(c));
		}
		if(ae.getSource()==NO_OF_ROOMS)
		{
			n=Integer.parseInt(tf4.getText());
			x=n/2;
				tf5.setText(String.valueOf(x));
				
		}
		if(ae.getSource()==GENERATE_BILL)
		{
			if(NORMAL.getState()==true)
			{
				bill=1000;
				tf7.setText(String.valueOf(bill));
			}
			else if(DELUX.getState()==true)
			{
				bill=1500;
				tf6.setText(String.valueOf(bill));
			}
			else if(AC.getState()==true)
			{
				bill=2000;
				tf7.setText(String.valueOf(bill));
			}
			if(LUNCH.getState()==true)
			{
				bill=500;
				tf6.setText(String.valueOf(bill));
			}
			if(DINNER.getState()==true)
			{
				bill=500;
				tf7.setText(String.valueOf(bill));
			}
			if(BREAKFAST.getState()==true)
			{
				bill=bill+500;
				tf6.setText(String.valueOf(bill));
			}
			if(SPA.getState()==true)
			{
				bill=bill+500;
				tf7.setText(String.valueOf(bill));
			}
			if(MASSAGE.getState()==true)
			{
				bill=bill+500;
				tf7.setText(String.valueOf(bill));
			}
			if(SWIMMING_POOL.getState()==true)
			{
				bill=bill+500;
				tf7.setText(String.valueOf(bill));
			}
			if(YES.getState()==true)
			{
				discount=bill-(bill*15)/100;
				tf6.setText(String.valueOf(discount));
			}
			else if(NO.getState()==true)
			{
				discount=bill-(bill*5)/100;
				tf6.setText(String.valueOf(discount));
			}
		}
		
			if(ae.getSource()==PAY)
			{
				amount=bill-discount;
				tf8.setText(String.valueOf(amount));
			}
		
		if(ae.getSource()==RESTART)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");
			tf5.setText("");
			tf6.setText("");
			tf7.setText("");
			tf8.setText("");
			tf1.setText("");
			tf1.setText("");
			tf1.setText("");
			LUNCH.setState(false);
			DINNER.setState(false);
			BREAKFAST.setState(false);
			SPA.setState(false);
			MASSAGE.setState(false);
			SWIMMING_POOL.setState(false);
		}
	}
	
	public static void main(String[] args)
	{
		new awt11();
				
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
	
	