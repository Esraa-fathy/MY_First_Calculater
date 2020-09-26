
package my_first_calculater;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _Calculater extends JFrame {
 double X=0,Y=0,result=0;
int op=0,op1=0,op2=0;
boolean flag=false;
boolean h=false;
String S="",Z="",d="";
int A=0;
inn n=new inn();   
JPanel P;
JTextField T;
Font f= new Font("Arial", Font.BOLD, 14);
JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31;
public _Calculater(){
this.setTitle("Calculater");
this.setSize(400,540);
this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.setLocation(500,350);
P=new JPanel();
T=new JTextField();
b0=new JButton(" 0 ");  b1=new JButton(" 1 ");  b2=new JButton(" 2 ");  b3=new JButton(" 3 ");  b4=new JButton(" 4 ");  b5=new JButton(" 5 ");  b6=new JButton(" 6 ");  b7=new JButton(" 7 ");
b8=new JButton(" 8 ");  b9=new JButton(" 9 ");  b10=new JButton(" * ");  b11=new JButton(" / ");  b12=new JButton(" + ");  b13=new JButton(" - ");  b14=new JButton(" % ");  b15=new JButton(" . ");
b16=new JButton(" x^y ");  b17=new JButton(" = ");  b18=new JButton(" π ");  b19=new JButton(" !N "); b20=new JButton(" sin() "); b21=new JButton(" cos() "); b22=new JButton(" tan() ");  b23=new JButton(" log10 "); 
b24=new JButton(" DEL ");  b25=new JButton(" AC "); b26=new JButton(" sqrt ");   b27=new JButton(" +/- "); b28=new JButton(" |x| "); b29=new JButton(" 1/x ");  b30=new JButton(" x^2 "); b31=new JButton(" floor ");
P.setLayout(null);
P.setBackground(Color.white);
this.add(P);
T.setBounds(30, 20, 330, 40);
T.setBackground(Color.WHITE);   P.add(T);     T.setFont(f);  T.setForeground(new Color(181,101,29));
b20.setBackground(new Color(245,222,179));  b20.setForeground(new Color(210,105,30));
b20.setBounds(10,90,85,38);            P.add(b20);  b20.setFont(f);
b21.setBackground(new Color(245,222,179));  b21.setForeground(new Color(210,105,30));
b21.setBounds(105,90,85,38);      P.add(b21);     b21.setFont(f);
b22.setBackground(new Color(245,222,179));  b22.setForeground(new Color(210,105,30));
b22.setBounds(200,90,85,38);      P.add(b22);      b22.setFont(f);
b23.setBackground(new Color(245,222,179));  b23.setForeground(new Color(210,105,30));
b23.setBounds(295,90,85,38);      P.add(b23);    b23.setFont(f);

b26.setBackground(new Color(245,222,179));  b26.setForeground(new Color(210,105,30));
b26.setBounds(10,140,85,38);      P.add(b26);     b26.setFont(f);
b14.setBackground(new Color(245,222,179));  b14.setForeground(new Color(210,105,30));
b14.setBounds(105,140,85,38);      P.add(b14);    b14.setFont(f);
b18.setBackground(new Color(245,222,179));  b18.setForeground(new Color(210,105,30));
b18.setBounds(200,140,85,38);      P.add(b18);   b18.setFont(f);
b19.setBackground(new Color(245,222,179));  b19.setForeground(new Color(210,105,30));
b19.setBounds(295,140,85,38);      P.add(b19);    b19.setFont(f);

b1.setBackground (new Color(210,105,30));  b1.setForeground(new Color(245,222,179));
b1.setBounds(10,190,85,38);      P.add(b1);    b1.setFont(f);
b2.setBackground(new Color(210,105,30));  b2.setForeground(new Color(245,222,179));
b2.setBounds(105,190,85,38);      P.add(b2);    b2.setFont(f);
b3.setBackground(new Color(210,105,30));  b3.setForeground(new Color(245,222,179));
b3.setBounds(200,190,85,38);      P.add(b3);     b3.setFont(f);
b10.setBackground(new Color(245,222,179));  b10.setForeground(new Color(210,105,30));
b10.setBounds(295,190,85,38);      P.add(b10);    b10.setFont(f);

b4.setBackground(new Color(210,105,30));  b4.setForeground(new Color(245,222,179));
b4.setBounds(10,240,85,38);      P.add(b4);     b4.setFont(f);
b5.setBackground(new Color(210,105,30));  b5.setForeground(new Color(245,222,179));
b5.setBounds(105,240,85,38);      P.add(b5);     b5.setFont(f);
b6.setBackground(new Color(210,105,30));  b6.setForeground(new Color(245,222,179));
b6.setBounds(200,240,85,38);      P.add(b6);      b6.setFont(f);
b11.setBackground(new Color(245,222,179));  b11.setForeground(new Color(210,105,30));
b11.setBounds(295,240,85,38);      P.add(b11);     b11.setFont(f);

b7.setBackground(new Color(210,105,30));  b7.setForeground(new Color(245,222,179));
b7.setBounds(10,290,85,38);      P.add(b7);    b7.setFont(f);
b8.setBackground(new Color(210,105,30));  b8.setForeground(new Color(245,222,179));
b8.setBounds(105,290,85,38);      P.add(b8);     b8.setFont(f);
b9.setBackground(new Color(210,105,30));  b9.setForeground(new Color(245,222,179));
b9.setBounds(200,290,85,38);      P.add(b9);      b9.setFont(f);
b13.setBackground(new Color(245,222,179));  b13.setForeground(new Color(210,105,30));
b13.setBounds(295,290,85,38);      P.add(b13);     b13.setFont(f);

b15.setBackground(new Color(245,222,179));  b15.setForeground(new Color(210,105,30));
b15.setBounds(10,340,85,38);      P.add(b15);    b15.setFont(f);
b0.setBackground(new Color(210,105,30));  b0.setForeground(new Color(245,222,179));
b0.setBounds(105,340,85,38);      P.add(b0);    b0.setFont(f);
b16.setBackground(new Color(245,222,179));  b16.setForeground(new Color(210,105,30));
b16.setBounds(200,340,85,38);      P.add(b16);     b16.setFont(f);
b12.setBackground(new Color(245,222,179));  b12.setForeground(new Color(210,105,30));
b12.setBounds(295,340,85,38);      P.add(b12);    b12.setFont(f);

b28.setBackground(new Color(245,222,179));  b28.setForeground(new Color(210,105,30));
b28.setBounds(10,390,85,38);      P.add(b28);    b28.setFont(f);
b29.setBackground(new Color(245,222,179));  b29.setForeground(new Color(210,105,30));
b29.setBounds(105,390,85,38);      P.add(b29);    b29.setFont(f);
b30.setBackground(new Color(245,222,179));  b30.setForeground(new Color(210,105,30));
b30.setBounds(200,390,85,38);      P.add(b30);     b30.setFont(f);
b31.setBackground(new Color(245,222,179));  b31.setForeground(new Color(210,105,30));
b31.setBounds(295,390,85,38);      P.add(b31);     b31.setFont(f);

b27.setBackground(new Color(245,222,179));  b27.setForeground(new Color(210,105,30));
b27.setBounds(10,440,85,38);      P.add(b27);    b27.setFont(f);  
b25.setBackground(new Color(245,222,179));  b25.setForeground(new Color(210,105,30));
b25.setBounds(105,440,85,38);      P.add(b25);     b25.setFont(f);
b24.setBackground(new Color(245,222,179));  b24.setForeground(new Color(210,105,30));
b24.setBounds(200,440,85,38);      P.add(b24);      b24.setFont(f);
b17.setBackground(new Color(245,222,179));  b17.setForeground(new Color(210,105,30));
b17.setBounds(295,440,85,38);      P.add(b17);      b17.setFont(f);

//contact buttons with ActionListener
b0.addActionListener(n);
b1.addActionListener(n);
b2.addActionListener(n);
b3.addActionListener(n);
b4.addActionListener(n);
b5.addActionListener(n);
b6.addActionListener(n);
b7.addActionListener(n);
b8.addActionListener(n);
b9.addActionListener(n);
b10.addActionListener(n);
b11.addActionListener(n);
b12.addActionListener(n);
b13.addActionListener(n);
b14.addActionListener(n);
b15.addActionListener(n);
b16.addActionListener(n);
b17.addActionListener(n);
b18.addActionListener(n);
b19.addActionListener(n);
b20.addActionListener(n);
b21.addActionListener(n);
b22.addActionListener(n);
b23.addActionListener(n);
b24.addActionListener(n);
b25.addActionListener(n);
b26.addActionListener(n);
b27.addActionListener(n);
b28.addActionListener(n);
b29.addActionListener(n);
b30.addActionListener(n);
b31.addActionListener(n);
}  


public class inn implements ActionListener{    
 @Override
public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==b1){
T.setText(T.getText().concat("1"));
}
if(ae.getSource()==b2){
T.setText(T.getText().concat("2"));
}
if(ae.getSource()==b3){
T.setText(T.getText().concat("3"));
}
if(ae.getSource()==b4){
T.setText(T.getText().concat("4"));
}
if(ae.getSource()==b5){
T.setText(T.getText().concat("5"));
}
if(ae.getSource()==b6){
T.setText(T.getText().concat("6"));
}
if(ae.getSource()==b7){
T.setText(T.getText().concat("7"));
}
if(ae.getSource()==b8){
T.setText(T.getText().concat("8"));
}
if(ae.getSource()==b9){
T.setText(T.getText().concat("9"));
}
if(ae.getSource()==b0){
T.setText(T.getText().concat("0"));
}
if(ae.getSource()==b15){
if(T.getText().contains(".")){
return;
}
else{
T.setText(T.getText()+".");
}}
if(ae.getSource()==b18){
T.setText(T.getText().concat("3.141592654"));
}
if(ae.getSource()==b27){
T.setText(T.getText().concat("-"));
}
if(ae.getSource()==b10){
X=Double.parseDouble(T.getText());
op=1;
T.setText(" ");
        }
if(ae.getSource()==b11){
X=Double.parseDouble(T.getText());
op=2;
T.setText(" ");
        }
if(ae.getSource()==b12){
X=Double.parseDouble(T.getText());
op=3;
T.setText(" ");
        }
if(ae.getSource()==b13){
X=Double.parseDouble(T.getText());
op=4;
T.setText(" ");
        }
if(ae.getSource()==b14){
X=Double.parseDouble(T.getText());
T.setText(" ");
op=5;
}
if(ae.getSource()==b16){
X=Double.parseDouble(T.getText());
T.setText(" ");
op=6;
}


if(ae.getSource()==b25){
T.setText("");
}
if(ae.getSource()==b24){
String G=T.getText();
T.setText("");
for(int i=0;i<G.length()-1;i++){
T.setText(T.getText()+G.charAt(i));
}}



if(ae.getSource()==b20){
op1=1; 
flag=true;
 }
if(ae.getSource()==b21){
op1=2; 
flag = true;
}
if(ae.getSource()==b22){
op1=3;
flag = true;
}
if(ae.getSource()==b23){
op2=1;
h = true;
}
if(ae.getSource()==b26){
 op2=2; 
 h= true;
 }
if(ae.getSource()==b31){
op2=3;
h=true;
}
if(ae.getSource()==b30){
op2=4;
h=true;
}
if(ae.getSource()==b28){
op2=5;
h=true;
}
if(ae.getSource()==b29){
op2=6;    
h=true;
}
if(ae.getSource()==b19){
op2=7;
h=true;
}

if(ae.getSource()==b17&&flag == true){
 X=Double.parseDouble(T.getText());
switch(op1){
case 1: 
double radians = Math.toRadians(X); 
result=Math.sin(radians); flag=false;
 break;
 case 2:
 double Radians = Math.toRadians(X); 
result=Math.cos(Radians); flag=false;
break;
case 3:
double radian = Math.toRadians(X);
if(X==90||X==270){
d="Math Error";
}
else {
result=Math.tan(radian);flag=false;
break;
} 
}
if(d==""){
T.setText(" "+result);
}else
T.setText(" "+d);   d="";

}

else if(ae.getSource()==b17&&h == true){  
switch(op2){
case 1: 
A=Integer.parseInt(T.getText()); 
if(A<0){
S="Math Error";
} 
else{
result=Math.log10(A);  h=false;
break;
}
case 2:
X=Double.parseDouble(T.getText());
if(X<0){
S="Math Error";
}
else{
result=Math.sqrt(X);  h=false;
break;
}
case 3: 
X=Double.parseDouble(T.getText());
result=Math.floor(X);  h=false;
break;
case 4:
X=Double.parseDouble(T.getText());
result=Math.pow(X,2);  h=false;
break; 
case 5:  
X=Double.parseDouble(T.getText());
result=Math.abs(X);   h=false;
break;    
case 6:
X=Double.parseDouble(T.getText());
if(X==0.0){
  S="Math Error"; 
}
else{
result=1/X;   h=false;  
break;
}
case 7:
X=Double.parseDouble(T.getText());
int fac=1;
for(int i=1;i<=X;i++){
fac*=i;
}
result=fac;  h=false;
break;
}
if(S==""){
T.setText(" "+result);
}else
T.setText(" "+S);  S="";
}

else if(ae.getSource()==b17){
Y=Double.parseDouble(T.getText());
switch(op)
{
    case 1: result=X*Y; 
    break;
    case 2: 
    if(Y==0){
    Z="Math Error";
    }
    else{
     result=X/Y;    
    break;
    }
    case 3: result=X+Y;  
    break;
    case 4: result=X-Y; 
    break;
    case 5: result=X%Y;
    break; 
    case 6: result=Math.pow(X,Y);
    break;
    default: result=0;
}
if(Z==""){
T.setText(" "+result);
}else
 T.setText(" "+Z);   Z="";
}


}}} 

