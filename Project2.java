package project1;

import java.math.*;
import java.util.*;
import javax.swing.JFrame;
import static project1.Project2.inputmode;
import static project1.Project2.outputmode;

public class Project2 extends javax.swing.JFrame {

    static String string, inputmode = "Dec", outputmode = "Dec";
    public static javax.swing.JTextArea jtextarea3;
    public static javax.swing.JTextArea jtextarea4;
    public static Vector<String> exp = new Vector<String>();
    public static Vector<String> vec = new Vector<String>();
    public static Vector<String> postfix = new Vector<String>();

    public Project2() {
        initComponents();

        jtextarea3 = jtextarea1;
        jtextarea4 = jtextarea2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        equal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Dec1 = new javax.swing.JButton();
        Bin1 = new javax.swing.JButton();
        Oct1 = new javax.swing.JButton();
        Hex1 = new javax.swing.JButton();
        Dec2 = new javax.swing.JButton();
        Bin2 = new javax.swing.JButton();
        Oct2 = new javax.swing.JButton();
        Hex2 = new javax.swing.JButton();
        instruction = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtextarea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextarea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel1.setBackground(new java.awt.Color(102, 102, 255));
        jpanel1.setMaximumSize(new java.awt.Dimension(3276, 3276));
        jpanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Input :");
        jpanel1.add(jLabel2);
        jLabel2.setBounds(0, 90, 80, 30);

        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setText(" =");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jpanel1.add(equal);
        equal.setBounds(290, 290, 53, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Output :");
        jpanel1.add(jLabel3);
        jLabel3.setBounds(0, 320, 80, 22);

        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jpanel1.add(Back);
        Back.setBounds(510, 20, 61, 23);

        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jpanel1.add(Clear);
        Clear.setBounds(510, 50, 63, 23);

        Dec1.setText("Dec");
        Dec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dec1ActionPerformed(evt);
            }
        });
        jpanel1.add(Dec1);
        Dec1.setBounds(90, 10, 50, 23);

        Bin1.setText("Bin");
        Bin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bin1ActionPerformed(evt);
            }
        });
        jpanel1.add(Bin1);
        Bin1.setBounds(90, 40, 50, 23);

        Oct1.setText("Oct");
        Oct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Oct1ActionPerformed(evt);
            }
        });
        jpanel1.add(Oct1);
        Oct1.setBounds(150, 10, 49, 23);

        Hex1.setText("Hex");
        Hex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hex1ActionPerformed(evt);
            }
        });
        jpanel1.add(Hex1);
        Hex1.setBounds(150, 40, 51, 23);

        Dec2.setText("Dec");
        Dec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dec2ActionPerformed(evt);
            }
        });
        jpanel1.add(Dec2);
        Dec2.setBounds(90, 230, 50, 23);

        Bin2.setText("Bin");
        Bin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bin2ActionPerformed(evt);
            }
        });
        jpanel1.add(Bin2);
        Bin2.setBounds(150, 230, 50, 23);

        Oct2.setText("Oct");
        Oct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Oct2ActionPerformed(evt);
            }
        });
        jpanel1.add(Oct2);
        Oct2.setBounds(90, 260, 49, 23);

        Hex2.setText("Hex");
        Hex2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hex2ActionPerformed(evt);
            }
        });
        jpanel1.add(Hex2);
        Hex2.setBounds(150, 260, 51, 23);

        instruction.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        instruction.setText("+, -, *, /, ^, %, ! are applicable");
        jpanel1.add(instruction);
        instruction.setBounds(70, 100, 210, 20);

        jtextarea1.setColumns(20);
        jtextarea1.setRows(5);
        jScrollPane2.setViewportView(jtextarea1);

        jpanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 120, 600, 96);

        jtextarea2.setEditable(false);
        jtextarea2.setColumns(20);
        jtextarea2.setRows(5);
        jScrollPane1.setViewportView(jtextarea2);

        jpanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 350, 600, 96);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/blue_abstract_backgrounds_43.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jpanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed

        Operationclass ob = new Operationclass();
        string = jtextarea3.getText();
        String ans = "";
        Project2.vec.removeAllElements();
        Project2.exp.removeAllElements();
        Project2.postfix.removeAllElements();
        ans = Project2.Calculate();

        this.jtextarea2.setText(ans);
        // else if()    // Uncomplete
    }//GEN-LAST:event_equalActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
        Project1 ob = new Project1();
        ob.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        jtextarea1.setText(null);
        jtextarea2.setText(null);
    }//GEN-LAST:event_ClearActionPerformed

    private void Dec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dec1ActionPerformed
        // TODO add your handling code here:
        inputmode = "Dec";
    }//GEN-LAST:event_Dec1ActionPerformed

    private void Bin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bin1ActionPerformed
        // TODO add your handling code here:
        inputmode = "Bin";
    }//GEN-LAST:event_Bin1ActionPerformed

    private void Oct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Oct1ActionPerformed
        // TODO add your handling code here:
        inputmode = "Oct";
    }//GEN-LAST:event_Oct1ActionPerformed

    private void Hex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hex1ActionPerformed
        // TODO add your handling code here:
        inputmode = "Hex";
    }//GEN-LAST:event_Hex1ActionPerformed

    private void Dec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dec2ActionPerformed
        // TODO add your handling code here:
        outputmode = "Dec";
    }//GEN-LAST:event_Dec2ActionPerformed

    private void Bin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bin2ActionPerformed
        // TODO add your handling code here:
        outputmode = "Bin";
    }//GEN-LAST:event_Bin2ActionPerformed

    private void Oct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Oct2ActionPerformed
        // TODO add your handling code here:
        outputmode = "Oct";
    }//GEN-LAST:event_Oct2ActionPerformed

    private void Hex2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hex2ActionPerformed
        // TODO add your handling code here:
        outputmode = "Hex";
    }//GEN-LAST:event_Hex2ActionPerformed

    public static String Calculate() {

        String ans = "";
        Operationclass ob = new Operationclass();

        if (ob.Refresh()) {
         
            ob.Polish();
            ans = ob.postfix_to_infix();
            Project2.postfix.removeAllElements();
        }

        return ans;
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Bin1;
    private javax.swing.JButton Bin2;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Dec1;
    private javax.swing.JButton Dec2;
    private javax.swing.JButton Hex1;
    private javax.swing.JButton Hex2;
    private javax.swing.JButton Oct1;
    private javax.swing.JButton Oct2;
    private javax.swing.JButton equal;
    private javax.swing.JLabel instruction;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JTextArea jtextarea1;
    private javax.swing.JTextArea jtextarea2;
    // End of variables declaration//GEN-END:variables
}

class Operationclass {

    /**
     * ********** Start Refresh Method **************
     */
    public boolean Refresh() {

        String s = "";
        int len = Project2.string.length();

        for (int i = 0; i < len; ++i) {
            char ch = Project2.string.charAt(i);

            if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || ch == '.') {
                s += (ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '(' || ch == ')' || ch == ' ' || ch == '%' || ch == '!') {
                if (s.length() >= 1) {
                    Project2.vec.addElement(s);
                    s = "";
                }

                if (ch != ' ') {
                    s += ch;
                    Project2.vec.addElement(s);
                    s = "";
                }
            }
           // else
            //   return false ;                   // Uncomplete . 5 +       -5
        }

        if (s.length() >= 1) {
            Project2.vec.addElement(s);
        }

        for (int i = 0; i < Project2.vec.size(); ++i) {
            String sx2 = Project2.vec.elementAt(i);
            String sx1 = " ";
            String sx3 = " ";

            if (i < Project2.vec.size() - 1) {
                sx3 = Project2.vec.elementAt(i + 1);
            }

            if (i > 0) {
                sx1 = Project2.vec.elementAt(i - 1);
            }

            if (sx2.equals("-")) {
                
                 if ( ((sx1.equals("!") || (sx1.charAt(0) >= '0' && sx1.charAt(0) <= '9')) && (sx3.charAt(0) >= '0' && sx3.charAt(0) <= '9')) || sx1.equals(")")) {
                    Project2.exp.add(sx2);
                } else if ((sx3.charAt(0) >= '0' && sx3.charAt(0) <= '9')) {
                    String str = "-" + sx3;
                    Project2.exp.add(str);
                    i = i + 1;
                } else {
                    Project2.exp.addElement(sx2);
                }
            } else if (sx2.equals("!") && (Project2.exp.elementAt(Project2.exp.size() - 1).charAt(0) >= '0' && Project2.exp.elementAt(Project2.exp.size() - 1).charAt(0) <= '9')) {
                Operationclass ob = new Operationclass();
                String st = ob.Factorial(Project2.exp.elementAt(Project2.exp.size() - 1));
                Project2.exp.setElementAt(st, Project2.exp.size() - 1);
            } else {
                Project2.exp.add(sx2);
            }
        }

        return true;
    }

    /**
     * *********** End Of Refresh Method   ******************
     */


    //****** Start Polish Algorithm *********//
    public void Polish() {

        Project2.exp.addElement(")");
        int len = Project2.exp.size();
        Vector<String> stack = new Vector<String>();
        stack.ensureCapacity(100000);
        stack.addElement("(");

        for (int i = 0; i < len; ++i) {
            String s = Project2.exp.elementAt(i);

            if (s.equals("(")) {
                stack.addElement("(");
            } else if (s.equals(")")) {
                for (int j = stack.size() - 1; (j >= 0); --j) {
                    String x = stack.elementAt(j);
                    stack.removeElementAt(j);

                    if (x.equals("(") == true) {
                        break;
                    } else {
                        Project2.postfix.addElement(x);
                    }
                }
            } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^") || s.equals("%") || s.equals("!")) {
                int x = Operationclass.getValue(s);

                for (int j = stack.size() - 1; j >= 0; --j) {
                    String st = stack.elementAt(j);
                    int y = Operationclass.getValue(st);

                    if (y >= x) {
                        Project2.postfix.addElement(st);
                        stack.removeElementAt(j);
                    } else {
                        break;
                    }
                }

                stack.addElement(s);
            } else {
                Project2.postfix.addElement(s);
            }

        }

        stack.removeAllElements();

        for (int i = 0; i < Project2.postfix.size(); ++i) {
            System.out.println(" " + Project2.postfix.elementAt(i));
        }

    }

    /**
     * ************ End Polish Algorithm  ******************
     */


    /**
     * ******** Start Of getValue Method *************
     */
    public static int getValue(String s) {
        if (s.equals("-") || s.equals("+")) {
            return 1;
        } else if (s.equals("/") || s.equals("*") || s.equals("%")) {
            return 2;
        } else if (s.equals("^") || s.equals("!")) {
            return 3;
        } else {
            return 0;
        }
    }

    /**
     * **** End Of getValue ******************
     */


 //************* Start Of Addition   ************************//   
    public String postfix_to_infix() {

        Operationclass ob = new Operationclass();
        String s, x, y, sign = "";

        for (int i = 0; i < Project2.postfix.size(); ++i) {
            s = Project2.postfix.elementAt(i);
            String st = s;

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^") || s.equals("%") || s.equals("!")) {

                if (s.equals("!")) {
                    x = Project2.postfix.elementAt(i - 1);
                    y = "00.00";
                } else {
                    if(i - 2 >= 0)
                    x = Project2.postfix.elementAt(i - 2);
                    else x = "0.0";
                    
                    y = Project2.postfix.elementAt(i - 1);
                }

                if (inputmode.equals("Dec") == false) {
                    x = ob.Setup(x);
                    y = ob.Setup(y);
                }

                if (inputmode.equals("Bin")) {
                    x = ob.BintoDec(x);
                    y = ob.BintoDec(y);
                } else if (inputmode.equals("Oct")) {
                    x = ob.OcttoDec(x);
                    y = OcttoDec(y);
                } else if (inputmode.equals("Hex")) {
                    x = HextoDec(x);
                    y = HextoDec(y);
                }

                if (s.equals("+")) {
                    s = ob.Addition(x, y);
                } else if (s.equals("-")) {
                    s = ob.Subtraction(x, y);
                } else if (s.equals("*")) {
                    s = ob.Multiplication(x, y);
                } else if (s.equals("/")) {
                    s = ob.Divide(x, y);
                } else if (s.equals("%")) {
                    s = ob.Modulus(x, y);
                } else if (s.equals("^")) {
                    s = ob.Power(x, y);
                } else if (s.equals("!")) {
                    s = ob.Factorial(x);
                }

                if (st.equals("!") == true) {
                    Project2.postfix.setElementAt(s, i);
                    Project2.postfix.removeElementAt(i - 1);
                    i = i - 1;
                } else {
                    Project2.postfix.setElementAt(s, i);
                    
                    int k = 0;
                    
                    if(i - 1 >= 0){
                    Project2.postfix.removeElementAt(i - 1); ++k ;}
                    
                    if(i - 2 >= 0){
                    Project2.postfix.removeElementAt(i - 2);  ++k; }
                
                    if(k == 2)
                    i = i - 2;
                    else i = i - 1;
                    
                }
            }
        }

        if (Project2.postfix.elementAt(0).charAt(0) == '-'  && inputmode.equals("Dec") == false) {
            sign = "-";
            Project2.postfix.add(0, Project2.postfix.elementAt(0).replace('-', '0'));
        }

        if (outputmode.equals("Bin")) {
            return sign + (ob.DectoBin(ob.Setup(Project2.postfix.elementAt(0))));
        } else if (outputmode.equals("Oct")) {
            return (sign + (ob.DectoOct(ob.Setup(Project2.postfix.elementAt(0)))));
        }else if(outputmode.equals("Hex"))
        {
            return (sign + (ob.DectoHex((Project2.postfix.elementAt(0)))));
        }

        return sign + Project2.postfix.elementAt(0);

       // System.out.println("Res " + Project2.postfix.elementAt(0));
    }//*********  End Of postfix Algorithm *************/ 

    public String Addition(String x, String y) {
        BigDecimal sum1 = new BigDecimal(x);
        BigDecimal sum2 = new BigDecimal(y);
        sum1 = sum1.add(sum2);

        return sum1.toString();

    }  // ***************** End Of Addition ***************  //

    public String Subtraction(String x, String y) {

        BigDecimal sum1 = new BigDecimal(x);
        BigDecimal sum2 = new BigDecimal(y);
        sum1 = sum1.subtract(sum2);

        return sum1.toString();
    }

    public String Multiplication(String x, String y) {

        BigDecimal sum1 = new BigDecimal(x);
        BigDecimal sum2 = new BigDecimal(y);
        sum1 = sum1.multiply(sum2);

        return sum1.toString();

    }

    public String Divide(String x, String y) {

        BigDecimal sum1 = new BigDecimal(x);
        BigDecimal sum2 = new BigDecimal(y);
        BigDecimal sum = new BigDecimal("0");
        sum = sum1.remainder(sum2);
        double d1 = sum.doubleValue();
        double d2 = sum2.doubleValue();
        sum1 = sum1.divideToIntegralValue(sum2);

        String st = Double.toString(d1 / d2);
        st = st.substring(1);

        return (sum1.toString() + st);
    }

    public String Power(String x, String y) {

        BigDecimal sum1 = new BigDecimal(x);
        BigDecimal sum3 = new BigDecimal("1");
        double d = Double.parseDouble(y);
        int sum2 = (int) d;
        
        if(sum2 < 0)
        {
            sum2 = sum2 * (-1);
            BigDecimal sum = new BigDecimal("1");
            sum3 = sum1.pow(sum2);
            Operationclass ob = new Operationclass();
            
            return ob.Divide("1", sum3.toString());
        }
        
        sum1 = sum1.pow(sum2);

        return sum1.toString();
    }

    public String Factorial(String s) {

        int n = Integer.parseInt(s);
        BigDecimal x = new BigDecimal("1");

        for (int i = 1; i <= n; ++i) {

            BigDecimal y = new BigDecimal(Integer.toString(i));
            x = x.multiply(y);

        }

        return x.toString();

    }

    public String Modulus(String x1, String y1) {

        //   Operationclass ob1 = new Operationclass();
        BigDecimal x = new BigDecimal(x1);
        BigDecimal y = new BigDecimal(y1);
        x = x.remainder(y);

        return x.toString();
    }

    public String Sqrt() {

        BigDecimal x = new BigDecimal(Project2.string);

       // BigInteger.
        // x.pow( 0.5);
        return x.toString();

    }

    public String Setup(String x) {

        boolean s = false;

        for (int i = 0; i < x.length(); ++i) {
            if (x.charAt(i) == '.') {
                s = true;
            }
        }

        if (s == false) {
            x += ".00";
        }

        return x;
    }

    public String BintoDec(String x) {

        double d = 0.0;
        String x1 = x.substring(0, x.indexOf('.'));
        String x2 = x.substring(x.indexOf('.') + 1);

        for (int i = 0, b = 0; i < x2.length(); ++i, b = 0) {
            if (x2.charAt(i) == '1') {
                b = 1;
            }

            d += b / Math.pow(2, i + 1);
        }

        double z = d + Integer.parseInt(x1, 2);

        System.out.println(z);
        return Double.toString(z);
    }

    public String OcttoDec(String x) {

        double d = 0.0;
        String s = "";
        String x1 = x.substring(0, x.indexOf('.'));
        String x2 = x.substring(x.indexOf('.') + 1);

        for (int i = 0, b = 0; i < x2.length(); ++i, b = 0) {
            s += x2.charAt(i);
            d += Integer.parseInt(s) / Math.pow(8, i + 1);
        }

        double z = d + Integer.parseInt(x1, 8);

        System.out.println(z);
        return Double.toString(z);

    }

    public String HextoDec(String x) {

        double d = 0.0;
        String s = "";
        Operationclass ob= new Operationclass();
        x = ob.Setup(x);
        String x1 = x.substring(0, x.indexOf('.'));
        String x2 = x.substring(x.indexOf('.') + 1);

        for (int i = 0; i < x2.length(); ++i) {
            s = "";

            if ((x2.charAt(i)) == 'A') {
                s = "10";
            } else if (x2.charAt(i) == 'B') {
                s = "11";
            } else if (x2.charAt(i) == 'C') {
                s = "12";
            } else if (x2.charAt(i) == 'D') {
                s = "13";
            } else if (x2.charAt(i) == 'E') {
                s = "14";
            } else if (x2.charAt(i) == 'F') {
                s = "15";
            } else {
                s += x2.charAt(i);
            }

            d += Integer.parseInt(s) / Math.pow(16, i + 1);

        }
        
        int res = 0;
        
        for(int i = x1.length() - 1, k= 0;i >= 0;--i){
            
            char ch;
            
            if(x1.charAt(i) == 'A')
               k = 10; 
            else if(x1.charAt(i) == 'B')
               k = 11;
            else if(x1.charAt(i) == 'C')
               k = 12;
            else if(x1.charAt(i) == 'D')
               k = 13;
            else if(x1.charAt(i) == 'E')
               k = 14;
            else if(x1.charAt(i) == 'F')
               k = 15;
            else 
                k = x1.charAt(i) - '0';
            
            res += k *Math.pow(16, i);
            
        }

        double z = d + res;

        System.out.println(z);
        return Double.toString(z);
    }

    public String DectoBin(String x) {

        double number = Double.parseDouble(x);

        int n = 10;  // constant?
        BigDecimal bd = new BigDecimal(number);
        BigDecimal mult = new BigDecimal(2).pow(n);
        bd = bd.multiply(mult);
        BigInteger bi = bd.toBigInteger();
        StringBuilder str = new StringBuilder(bi.toString(2));
        while (str.length() < n + 1) {  // +1 for leading zero
            str.insert(0, "0");
        }
        str.insert(str.length() - n, ".");
        return str.toString();
    }

    public String DectoOct(String x) {

        String x1 = x.substring(0, x.indexOf('.'));
        String x2 = x.substring(x.indexOf('.'));

        int a = Integer.parseInt(x1);
        String part1 = "";
        if (a == 0) {
            return "0";
        }
        String oct = "";
        while (a != 0) {
            oct += (int) a % 8;
            a = (a / 8);
        }
        for (int i = oct.length() - 1; i >= 0; --i) {
            part1 += oct.charAt(i);
        }

        oct = ".";
        int count = 0;
        double of = Double.parseDouble(x2);
        while (count < 10) {
            of = of * 8;
            oct += (int) of;
            of = of - (int) of;
            if (of == 0.0) {
                break;
            }
            ++count;
        }

        return (part1 + oct);
    }

    public String DectoHex(String x) {

     //   String x1 = x.substring(0, x.indexOf('.'));
       // String x2 = x.substring(x.indexOf('.'));
        //x2 = x2.substring(0);
         x = x.substring(x.indexOf('.'));
        int hw = Integer.parseInt(x);
        if (hw == 0) {
            return "0";
        }
        String hex = " ";
        String rev = new String();
        while (hw != 0) {
            if (hw % 16 > 9) {
                switch (hw % 16) {
                    case 10:
                        hex += "A";
                        break;
                    case 11:
                        hex += "B";
                        break;
                    case 12:
                        hex += "C";
                        break;
                    case 13:
                        hex += "D";
                        break;
                    case 14:
                        hex += "E";
                        break;
                    case 15:
                        hex += "F";
                        break;
                }
            } else {
                hex += (int) (hw % 16);
            }
            hw /= 16;
        }
        for (int i = hex.length() - 1; i >= 0; i--) {
            rev += hex.charAt(i);
        }
        
        
        System.out.println(" " + rev);
        return rev;

    }

}
