import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUIMiniCalculator extends JFrame implements ActionListener
{
 private JLabel lblFNum;
 private JLabel lblSNum;
 private JLabel lblResult;
 private JTextField txtFNum;
 private JTextField txtSNum;
 private JTextField txtResult;
 private JButton btnAdd;
 private JButton btnSub;
 private JButton btnMul;
 private JButton btnDiv;
 private JButton btnExit;
 private JButton btnClear;
 public GUIMiniCalculator()
 {
  setTitle("Mini Calculator Program");
  setLayout(null);
  //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  lblFNum = new JLabel("Enter 1st Number :");
  lblFNum.setBounds(10,10,140,20);
  txtFNum = new JTextField(20);
  txtFNum.setBounds(150,10,100,20);

  lblSNum = new JLabel("Enter 2st Number :");
  lblSNum.setBounds(10,40,140,20);
  txtSNum = new JTextField(20);
  txtSNum.setBounds(150,40,100,20);

  lblResult = new JLabel("Result :");
  lblResult.setBounds(10,70,140,20);
  txtResult = new JTextField(20);
  txtResult.setEditable(false);
  txtResult.setBounds(150,70,100,20);

  btnAdd = new JButton("+");
  btnAdd.setBounds(10,100,50,20);
  btnAdd.addActionListener(this);

  btnSub = new JButton("-");
  btnSub.setBounds(80,100,50,20);
  btnSub.addActionListener(this); 

  btnMul = new JButton("*");
  btnMul.setBounds(150,100,50,20);
  btnMul.addActionListener(this);

  btnDiv = new JButton("/");
  btnDiv.setBounds(220,100,50,20);
  btnDiv.addActionListener(this);

  btnExit = new JButton("EXIT");
  btnExit.setBounds(20,150,100,20);
  btnExit.addActionListener(this);

  btnClear = new JButton("CLEAR");
  btnClear.setBounds(160,150,100,20);
  btnClear.addActionListener(this);

  add(lblFNum);add(txtFNum);
  add(lblSNum);add(txtSNum);
  add(lblResult);add(txtResult);
  add(btnAdd);add(btnSub);
  add(btnMul);add(btnDiv);
  add(btnExit);add(btnClear);
 }
 public void actionPerformed(ActionEvent ae)
 {
  int fnum,snum,add,sub,mul,div;
  if(ae.getActionCommand()=="+")
  {
   fnum = Integer.parseInt(txtFNum.getText());
   snum = Integer.parseInt(txtSNum.getText());
   add=fnum+snum;
   txtResult.setText(" "+add);
  }
  if(ae.getActionCommand()=="-")
  {
   fnum = Integer.parseInt(txtFNum.getText());
   snum = Integer.parseInt(txtSNum.getText());
   sub=fnum-snum;
   txtResult.setText(" "+sub);
  }

  if(ae.getSource()==btnMul)
  {
   fnum = Integer.parseInt(txtFNum.getText());
   snum = Integer.parseInt(txtSNum.getText());
   mul=fnum*snum;
   txtResult.setText(" "+mul);
  }
  if(ae.getSource()==btnDiv)
  {
   fnum = Integer.parseInt(txtFNum.getText());
   snum = Integer.parseInt(txtSNum.getText());
   div=fnum/snum;
   txtResult.setText(" "+div);
  }
  if(ae.getSource()==btnExit)
  {
   System.exit(0);
  }
  if(ae.getSource()==btnClear)
  {
    txtFNum.setText("");
    txtSNum.setText("");
    txtResult.setText("");
  }
 }
 public static void main(String args[])
 {
  GUIMiniCalculator gs = new GUIMiniCalculator();
  gs.setSize(300,300);
  gs.setVisible(true);
  gs.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}


