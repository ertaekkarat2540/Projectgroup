/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgroup;



import com.sun.glass.events.KeyEvent;
import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
//import org.apache.poi.xwpf.usermodel.XWPFDocument;
//import org.apache.poi.xwpf.usermodel.XWPFParagraph;
//import org.apache.poi.xwpf.usermodel.XWPFRun;
//import org.apache.poi.xwpf.usermodel.XWPFTable;
//import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class Sell extends javax.swing.JFrame{
   private DefaultTableModel model;
   private int r = 0;
   private int number = 0;
   private int sum = 0;
   private int x;
   private int x1;
   int x2;
   String price1,price3,price2;
   private int T,ans;
   private int number1;
   Connection conn = null;
   Statement s = null;
   ResultSet set; 
   //XWPFTable tab ;
  // XWPFTableRow row;
   //XWPFDocument doc;
   String fileName ;
   String input,input1;
            public Sell() {     
                initComponents();
                setSize(550, 430);
                setResizable(false);
                setLocationRelativeTo(null);   
                setTitle("Sell");
                model = (DefaultTableModel)jTable1.getModel();
		model.addColumn("สินค้า");
                model.addColumn("ยี่ห้อ");
		model.addColumn("จำนวนห่อ");
		model.addColumn("ราคา");	                             
                fileName = "D:\\Sell.doc";               
	      
             }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "เลือก", "Smsแดง", "Smsเขียว", "Wonderแดง", "Wonderเขียว", "กรองทิพย์", "กรุงทอง", "สายฝน" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText("จำนวนห่อ");

        jButton1.setText("เพิ่ม");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ลบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ยกเลิก");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("แก้ไข");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel2.setText("ราคา");

        jLabel3.setText("0");

        jLabel4.setText("ราคา");

        jLabel5.setText("Tatol");

        jButton5.setText("พิมพ์");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                try{                                 
                 if(jComboBox1.getSelectedIndex() == 0 ){ 
                    JOptionPane.showMessageDialog(null,"กรุณาทำการเลือกบุหรี่", "เตือน",JOptionPane.WARNING_MESSAGE);
                  
                 }
                  if(jComboBox1.getSelectedIndex() != 0 )
                    {   
                        price1 =  jTextField1.getText();
                        price2 = jTextField2.getText();
                        x = Integer.valueOf(price1)*Integer.valueOf(price2);
                        model.addRow(new Object[0]);
                        model.setValueAt(r+1, r, 0);
                        model.setValueAt(jComboBox1.getSelectedItem().toString(), r, 1);
                        model.setValueAt(String.valueOf(jTextField1.getText()), r, 2);
                        model.setValueAt(String.valueOf(x), r,3);  
                        sum++;    
                        ans += x;
                        jLabel3.setText(String.valueOf(ans));
                    }                 
                    x1 += x;
                    number1 =  Integer.valueOf(price1);                  
                    r = r+ 1;     
                }catch(NumberFormatException e){                
                }
           
        		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         cigarette main = new cigarette();
         main.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
         char c = evt.getKeyChar();
         if(!(Character.isDigit(c)||c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE)){
         evt.consume();
         }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          try{
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();     
           if(jTable1.getSelectedRow() == -1){
         if(jTable1.getSelectedRow() == 0){
           JOptionPane.showMessageDialog(null, "ว่างจัด");
         }
        }else{                     
              model.removeRow(jTable1.getSelectedRow());                            
              x1 -= x;
              ans -= x;
              jLabel3.setText(String.valueOf(x1));
              r = 1;
              while(r != sum){ 
              model.setValueAt(r+1, r, 0);
              r++;                       
              model.setValueAt(1, 0, 0);
              }  
           
              }
            
           
          }catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();            
         if(jTable1.getSelectedRow() == -1){
         if(jTable1.getSelectedRow() == 0){
           JOptionPane.showMessageDialog(null, "กรุณาทำรายการ");
         }
        }else{                     
             price3 =  jTextField1.getText();
             price2 = jTextField2.getText();
             x2 = Integer.valueOf(price3)*Integer.valueOf(price2);    
             model.setValueAt(jComboBox1.getSelectedItem().toString(), jTable1.getSelectedRow(), 1);
             model.setValueAt(String.valueOf(jTextField1.getText()), jTable1.getSelectedRow(), 2);
             model.setValueAt(String.valueOf(x2), jTable1.getSelectedRow(),3);  
        int Total = Integer.parseInt((String) model.getValueAt(jTable1.getSelectedRow(), 3));
        if(Total > number1){
        int t = x2-x;
        x1 += t;
        jLabel3.setText(String.valueOf(x1));
        }
        if(Total < number1){
        int l = x2-x;
        x1 -= l;
        jLabel3.setText(String.valueOf(x1));
        }             
      }    
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
       
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
         if(!(Character.isDigit(c)||c== KeyEvent.VK_BACKSPACE || c == KeyEvent.VK_DELETE)){
         evt.consume();
         JOptionPane.showMessageDialog(null, "ใส่ตัวเลขเท่านั้น");
         }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              
               //doc = new XWPFDocument();	        			
		//XWPFParagraph para1 = doc.createParagraph();
		//para1.setAlignment(ParagraphAlignment.CENTER);
		//XWPFRun run = para1.createRun();
		//run.setBold(true);
	        //run.setFontSize(30);
		//run.setText("ร้านนายก้าว");			
	        //tab = doc.createTable();
	       // row = tab.getRow(0);
              //  row.getCell(0).setText("สินค้า");
	       // row.addNewTableCell().setText("ยี่ห้อ");
		//row.addNewTableCell().setText("จำนวนห่อ");
		//row.addNewTableCell().setText("ราคา");	
                //row.addNewTableCell().setText("ราคารวม"); 
        
        
        
        /*  r = 0;
                 while(r != sum){
			row = tab.createRow();
			row.getCell(0).setText(String.valueOf(r+1));
			row.getCell(1).setText((String) model.getValueAt(r, 1));
			row.getCell(2).setText((String) model.getValueAt(r, 2));
		row.getCell(3).setText(String.valueOf(x));	                       
			doc.createParagraph().createRun().addBreak();
                        r++;
                 }
                        row.getCell(4).setText(String.valueOf(x1));
			XWPFParagraph para2 = doc.createParagraph();
			XWPFRun run2 = para2.createRun();			
			run2.setTextPosition(100);

       try {
           doc.write(new FileOutputStream(fileName));
       } catch (IOException ex) {
           Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
       }*/
    
			
/*public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sell().setVisible(true);
            }
        });*/	
			
    }//GEN-LAST:event_jButton5ActionPerformed
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
