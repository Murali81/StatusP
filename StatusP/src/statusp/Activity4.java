/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statusp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JEditorPane;

/**
 *
 * @author Student
 */
public class Activity4 extends javax.swing.JFrame {

    /**
     * Creates new form Activity4
     */
    ArrayList<String> n1=new ArrayList<>();
    int n2[]=new int[10];float n3[]=new float[10];
    public Activity4() {
        initComponents();
    }
public Activity4(ArrayList m,int []gnt,int []downtt,float []ans)
    {
          initComponents();
          n1=m;n2=gnt;n3=ans;
                String combtext;
                int lena=m.size();
                String arr[]=new String[10];
          for(int j=0;j<m.size();j++)
        {    
            combtext=(String)m.get(j);
            arr=combtext.split(",");
            System.out.println(j);
            System.out.println(arr[0]+""+arr[1]+""+arr[2]);
             if(lena==2)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 { p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 jPanel5.setVisible(false);
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             }
             if(lena==3)
             {
                 if(j==0)
                 {p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 {p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2)
                 {p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
             
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             
                
             }
             if(lena==4)
             {
              
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1){p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                 if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                 
                 
                 
                 
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
               
                
             }
             if(lena==5)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                if(j==1){ p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                if(j==4){p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);}
                 
                 
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==6)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==7)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 
                 
                 
                 
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==8)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 
                  
                 
                 
                  jPanel10.setVisible(false);
                  jPanel11.setVisible(false);
                  jPanel12.setVisible(false);
                  jPanel13.setVisible(false);
                 
             }
             if(lena==9)
             {
                  p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 p9.setText(arr[0]);tt9.setText(arr[1]);wt9.setText(arr[2]);
                 
                 
                 
                jPanel11.setVisible(false);
                jPanel12.setVisible(false);
                jPanel13.setVisible(false);
                 
             }

         }
                       int arsize;String gntres="";
              arsize = gnt.length;
              for(int c=0;c<arsize;c++)
              {
                  if(gnt[c]==0)break;
                  System.out.print(gnt[c]);
                  System.out.println("Value of c is "+c);
                  gntres=gntres+"|  "+"P"+gnt[c]+"  ";
              }
              gntres=gntres+"  |";
              jLabel8.setText(gntres);
              String downres="";
              for(int c=0;c<downtt.length;c++)
              {
                  if(downtt[c]==0&&c>0)break;
                  downres=downres+"   "+downtt[c]+"   ";
              }
              jLabel9.setText(downres);
        String answer="";
            answer="Total Waiting Time is "+ans[0]+" msec";jLabel4.setText(answer);answer="Average Waiting Time is "+ans[1]+" msec";jLabel5.setText(answer);answer="Total TurnAround Time is "+ans[2]+" msec";
            jLabel6.setText(answer); answer="Average TurnAround Time is "+ans[3]+" msec";jLabel7.setText(answer); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        label1 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        p2 = new javax.swing.JEditorPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        wt2 = new javax.swing.JEditorPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        tt2 = new javax.swing.JEditorPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        p3 = new javax.swing.JEditorPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        tt3 = new javax.swing.JEditorPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        wt3 = new javax.swing.JEditorPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tt1 = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        wt1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tt4 = new javax.swing.JEditorPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        p4 = new javax.swing.JEditorPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        wt4 = new javax.swing.JEditorPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        p5 = new javax.swing.JEditorPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        tt5 = new javax.swing.JEditorPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        wt5 = new javax.swing.JEditorPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        p6 = new javax.swing.JEditorPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        tt6 = new javax.swing.JEditorPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        wt6 = new javax.swing.JEditorPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        p7 = new javax.swing.JEditorPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        tt7 = new javax.swing.JEditorPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        wt7 = new javax.swing.JEditorPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        p8 = new javax.swing.JEditorPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        tt8 = new javax.swing.JEditorPane();
        jScrollPane24 = new javax.swing.JScrollPane();
        wt8 = new javax.swing.JEditorPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        p9 = new javax.swing.JEditorPane();
        jScrollPane26 = new javax.swing.JScrollPane();
        tt9 = new javax.swing.JEditorPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        wt9 = new javax.swing.JEditorPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        p10 = new javax.swing.JEditorPane();
        jScrollPane29 = new javax.swing.JScrollPane();
        tt10 = new javax.swing.JEditorPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        wt10 = new javax.swing.JEditorPane();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        p11 = new javax.swing.JEditorPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        tt11 = new javax.swing.JEditorPane();
        wt11 = new javax.swing.JScrollPane();
        jEditorPane33 = new javax.swing.JEditorPane();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        p12 = new javax.swing.JEditorPane();
        jScrollPane35 = new javax.swing.JScrollPane();
        tt12 = new javax.swing.JEditorPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        wt12 = new javax.swing.JEditorPane();
        jPanel14 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportView(p2);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setViewportView(wt2);

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setViewportView(tt2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setViewportView(p3);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setViewportView(tt3);

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setViewportView(wt3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Process");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Turnaround time");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Waiting time");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        p1.setBorder(null);
        jScrollPane1.setViewportView(p1);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setViewportView(tt1);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setViewportView(wt1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane12.setViewportView(tt4);

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane13.setViewportView(p4);

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane14.setViewportView(wt4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(169, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportView(p5);

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane15.setViewportView(tt5);

        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setViewportView(wt5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane17.setViewportView(p6);

        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane18.setViewportView(tt6);

        jScrollPane19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane19.setViewportView(wt6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane9.setViewportView(p7);

        jScrollPane20.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane20.setViewportView(tt7);

        jScrollPane21.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane21.setViewportView(wt7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane22.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane22.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane22.setViewportView(p8);

        jScrollPane23.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane23.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane23.setViewportView(tt8);

        jScrollPane24.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane24.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane24.setViewportView(wt8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane25.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane25.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane25.setViewportView(p9);

        jScrollPane26.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane26.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane26.setViewportView(tt9);

        jScrollPane27.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane27.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane27.setViewportView(wt9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane28.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane28.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane28.setViewportView(p10);

        jScrollPane29.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane29.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane29.setViewportView(tt10);

        jScrollPane30.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane30.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane30.setViewportView(wt10);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane31.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane31.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane31.setViewportView(p11);

        jScrollPane32.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane32.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane32.setViewportView(tt11);

        wt11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        wt11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        wt11.setViewportView(jEditorPane33);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(wt11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane34.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane34.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane34.setViewportView(p12);

        jScrollPane35.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane35.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane35.setViewportView(tt12);

        jScrollPane36.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane36.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane36.setViewportView(wt12);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Turnaround Time");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Waiting Time");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Gantt Chart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Try again");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addContainerGap(273, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(50, 50, 50))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(15, 15, 15)))
                .addComponent(jButton3)
                .addGap(39, 39, 39)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(20, 20, 20))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel10, jPanel11, jPanel12, jPanel13, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7, jPanel8, jPanel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel10, jPanel11, jPanel12, jPanel13, jPanel2, jPanel3, jPanel4, jPanel5, jPanel7, jPanel8, jPanel9});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String combtext;
                int lena=n1.size();                      //Replace m with n1;Replace gnt with n2;Replace ans with n3; 
                String arr[]=new String[10];
          for(int j=0;j<n1.size();j++)
        {    
            combtext=(String)n1.get(j);
            arr=combtext.split(",");
            System.out.println(j);
            System.out.println(arr[0]+""+arr[1]+""+arr[2]);
            wt1.setVisible(false);
            wt2.setVisible(false);
            wt3.setVisible(false);
            wt4.setVisible(false);
            wt5.setVisible(false);
            wt6.setVisible(false);
            wt7.setVisible(false);
            wt8.setVisible(false);
            wt9.setVisible(false);
             tt1.setVisible(true);
            tt2.setVisible(true);
            tt3.setVisible(true);
            tt4.setVisible(true);
            tt5.setVisible(true);
            tt6.setVisible(true);
            tt7.setVisible(true);
            tt8.setVisible(true);
            tt9.setVisible(true);
            
            
             if(lena==2)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 { p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 jPanel5.setVisible(false);
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             }
             
             if(lena==3)
             {
                 if(j==0)
                 {p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 {p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2)
                 {p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
             
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             
                
             }
             if(lena==4)
             {
              
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1){p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                 if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                 
                 
                 
                 
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
               
                
             }
             if(lena==5)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                if(j==1){ p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                if(j==4){p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);}
                 
                 
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==6)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==7)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 
                 
                 
                 
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==8)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 
                  
                 
                 
                  jPanel10.setVisible(false);
                  jPanel11.setVisible(false);
                  jPanel12.setVisible(false);
                  jPanel13.setVisible(false);
                 
             }
             if(lena==9)
             {
                  p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 p9.setText(arr[0]);tt9.setText(arr[1]);wt9.setText(arr[2]);
                 
                 
                 
                jPanel11.setVisible(false);
                jPanel12.setVisible(false);
                jPanel13.setVisible(false);
                 
             }

         }
          jPanel15.setVisible(false);
jPanel16.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String combtext;
                int lena=n1.size();                      //Replace m with n1;Replace gnt with n2;Replace ans with n3; 
                String arr[]=new String[10];
          for(int j=0;j<n1.size();j++)
        {    
            combtext=(String)n1.get(j);
            arr=combtext.split(",");
            System.out.println(j);
            System.out.println(arr[0]+""+arr[1]+""+arr[2]);
            tt1.setVisible(false);
            tt2.setVisible(false);
            tt3.setVisible(false);
            tt4.setVisible(false);
            tt5.setVisible(false);
            tt6.setVisible(false);
            tt7.setVisible(false);
            tt8.setVisible(false);
            tt9.setVisible(false);
            wt1.setVisible(true);
            wt2.setVisible(true);
            wt3.setVisible(true);
            wt4.setVisible(true);
            wt5.setVisible(true);
            wt6.setVisible(true);
            wt7.setVisible(true);
            wt8.setVisible(true);
            wt9.setVisible(true);
            
            
             if(lena==2)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 { p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 jPanel5.setVisible(false);
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             }
             
             if(lena==3)
             {
                 if(j==0)
                 {p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 {p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2)
                 {p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
             
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             
                
             }
             if(lena==4)
             {
              
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1){p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                 if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                 
                 
                 
                 
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
               
                
             }
             if(lena==5)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                if(j==1){ p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                if(j==4){p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);}
                 
                 
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==6)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==7)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 
                 
                 
                 
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==8)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 
                  
                 
                 
                  jPanel10.setVisible(false);
                  jPanel11.setVisible(false);
                  jPanel12.setVisible(false);
                  jPanel13.setVisible(false);
                 
             }
             if(lena==9)
             {
                  p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 p9.setText(arr[0]);tt9.setText(arr[1]);wt9.setText(arr[2]);
                 
                 
                 
                jPanel11.setVisible(false);
                jPanel12.setVisible(false);
                jPanel13.setVisible(false);
                 
             }

         }
jPanel15.setVisible(false);
jPanel16.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 String combtext;
                int lena=n1.size();                         //m with n1;gnt with n2;ans with n3;
                String arr[]=new String[10];
            wt1.setVisible(true);
            wt2.setVisible(true);
            wt3.setVisible(true);
            wt4.setVisible(true);
            wt5.setVisible(true);
            wt6.setVisible(true);
            wt7.setVisible(true);
            wt8.setVisible(true);
            wt9.setVisible(true);
            tt1.setVisible(true);                     //Make false to TRUE
            tt2.setVisible(true);
            tt3.setVisible(true);
            tt4.setVisible(true);
            tt5.setVisible(true);
            tt6.setVisible(true);
            tt7.setVisible(true);
            tt8.setVisible(true);
            tt9.setVisible(true);
                
                
                
                
          for(int j=0;j<n1.size();j++)
        {    
            combtext=(String)n1.get(j);
            arr=combtext.split(",");
            System.out.println(j);
            System.out.println(arr[0]+""+arr[1]+""+arr[2]);
             if(lena==2)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 { p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 jPanel5.setVisible(false);
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             }
             if(lena==3)
             {
                 if(j==0)
                 {p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 {p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2)
                 {p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
             
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             
                
             }
             if(lena==4)
             {
              
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1){p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                 if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                 
                 
                 
                 
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
               
                
             }
             if(lena==5)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                if(j==1){ p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                if(j==4){p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);}
                 
                 
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==6)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==7)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 
                 
                 
                 
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==8)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 
                  
                 
                 
                  jPanel10.setVisible(false);
                  jPanel11.setVisible(false);
                  jPanel12.setVisible(false);
                  jPanel13.setVisible(false);
                 
             }
             if(lena==9)
             {
                  p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 p9.setText(arr[0]);tt9.setText(arr[1]);wt9.setText(arr[2]);
                 
                 
                 
                jPanel11.setVisible(false);
                jPanel12.setVisible(false);
                jPanel13.setVisible(false);
                 
             }

         }
                       int arsize;String gntres="";
              arsize = n2.length;
              for(int c=0;c<arsize;c++)
              {
                  if(n2[c]==0)break;
                  System.out.print(n2[c]);
                  System.out.println("Value of c is "+c);
                  gntres=gntres+"|  "+"P"+n2[c]+"  ";
              }
              gntres=gntres+"  |";
              jLabel8.setText(gntres);
        String answer="";
            answer="Total Waiting Time is "+n3[0]+" msec";jLabel4.setText(answer);answer="Average Waiting Time is "+n3[1]+" msec";jLabel5.setText(answer);answer="Total TurnAround Time is "+n3[2]+" msec";
            jLabel6.setText(answer); answer="Average TurnAround Time is "+n3[3]+" msec";jLabel7.setText(answer); 
        // TODO add your handling code here:
        jPanel15.setVisible(true);jPanel16.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String combtext;
                int lena=n1.size();                         //m with n1;gnt with n2;ans with n3;
                String arr[]=new String[10];
            wt1.setVisible(false);
            wt2.setVisible(false);
            wt3.setVisible(false);
            wt4.setVisible(false);
            wt5.setVisible(false);
            wt6.setVisible(false);
            wt7.setVisible(false);
            wt8.setVisible(false);
            wt9.setVisible(false);
            tt1.setVisible(false);                     
            tt2.setVisible(false);
            tt3.setVisible(false);
            tt4.setVisible(false);
            tt5.setVisible(false);
            tt6.setVisible(false);
            tt7.setVisible(false);
            tt8.setVisible(false);
            tt9.setVisible(false);
                
                
                
                
          for(int j=0;j<n1.size();j++)
        {    
            combtext=(String)n1.get(j);
            arr=combtext.split(",");
            System.out.println(j);
            System.out.println(arr[0]+""+arr[1]+""+arr[2]);
             if(lena==2)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 { p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 jPanel5.setVisible(false);
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             }
             if(lena==3)
             {
                 if(j==0)
                 {p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1)
                 {p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2)
                 {p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
             
                 jPanel2.setVisible(false);
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
             
                
             }
             if(lena==4)
             {
              
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                 if(j==1){p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                 if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                 if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                 
                 
                 
                 
                 jPanel6.setVisible(false);
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
               
                
             }
             if(lena==5)
             {
                 if(j==0)
                 { p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);}
                if(j==1){ p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);}
                if(j==2){p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);}
                if(j==3){p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);}
                if(j==4){p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);}
                 
                 
                 jPanel7.setVisible(false);
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==6)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 
                 jPanel8.setVisible(false);
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==7)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 
                 
                 
                 
                 jPanel9.setVisible(false);
                 jPanel10.setVisible(false);
                 jPanel11.setVisible(false);
                 jPanel12.setVisible(false);
                 jPanel13.setVisible(false);
                 
             }
             if(lena==8)
             {
                 p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 
                  
                 
                 
                  jPanel10.setVisible(false);
                  jPanel11.setVisible(false);
                  jPanel12.setVisible(false);
                  jPanel13.setVisible(false);
                 
             }
             if(lena==9)
             {
                  p1.setText(arr[0]);tt1.setText(arr[1]);wt1.setText(arr[2]);
                 p2.setText(arr[0]);tt2.setText(arr[1]);wt2.setText(arr[2]);
                 p3.setText(arr[0]);tt3.setText(arr[1]);wt3.setText(arr[2]);
                 p4.setText(arr[0]);tt4.setText(arr[1]);wt4.setText(arr[2]);
                 p5.setText(arr[0]);tt5.setText(arr[1]);wt5.setText(arr[2]);
                 p6.setText(arr[0]);tt6.setText(arr[1]);wt6.setText(arr[2]);
                 p7.setText(arr[0]);tt7.setText(arr[1]);wt7.setText(arr[2]);
                 p8.setText(arr[0]);tt8.setText(arr[1]);wt8.setText(arr[2]);
                 p9.setText(arr[0]);tt9.setText(arr[1]);wt9.setText(arr[2]);
                 
                 
                 
                jPanel11.setVisible(false);
                jPanel12.setVisible(false);
                jPanel13.setVisible(false);
                 
             }

         }
                       int arsize;String gntres="";
              arsize = n2.length;
              for(int c=0;c<arsize;c++)
              {
                  if(n2[c]==0)break;
                  System.out.print(n2[c]);
                  System.out.println("Value of c is "+c);
                  gntres=gntres+"|  "+"P"+n2[c]+"  ";
              }
              gntres=gntres+"  |";
              jLabel8.setText(gntres);
        String answer="";
            answer="Total Waiting Time is "+n3[0]+" msec";jLabel4.setText(answer);answer="Average Waiting Time is "+n3[1]+" msec";jLabel5.setText(answer);answer="Total TurnAround Time is "+n3[2]+" msec";
            jLabel6.setText(answer); answer="Average TurnAround Time is "+n3[3]+" msec";jLabel7.setText(answer); 
        // TODO add your handling code here:
        jPanel15.setVisible(true);jPanel16.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.dispose();

new Activity2().setVisible(true);
      // new Activity2().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
//-------------------------------------------------------Copy the Button3 method to Button4 method and replace all trues with false and jPanel16 to false
  // jPanel15 to true  
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Activity4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Activity4().setVisible(true);
            }
        });
    }
     
  private javax.swing.JEditorPane jEditorPane[]=new JEditorPane[10];
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane33;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Label label1;
    private javax.swing.JEditorPane p1;
    private javax.swing.JEditorPane p10;
    private javax.swing.JEditorPane p11;
    private javax.swing.JEditorPane p12;
    private javax.swing.JEditorPane p2;
    private javax.swing.JEditorPane p3;
    private javax.swing.JEditorPane p4;
    private javax.swing.JEditorPane p5;
    private javax.swing.JEditorPane p6;
    private javax.swing.JEditorPane p7;
    private javax.swing.JEditorPane p8;
    private javax.swing.JEditorPane p9;
    private javax.swing.JEditorPane tt1;
    private javax.swing.JEditorPane tt10;
    private javax.swing.JEditorPane tt11;
    private javax.swing.JEditorPane tt12;
    private javax.swing.JEditorPane tt2;
    private javax.swing.JEditorPane tt3;
    private javax.swing.JEditorPane tt4;
    private javax.swing.JEditorPane tt5;
    private javax.swing.JEditorPane tt6;
    private javax.swing.JEditorPane tt7;
    private javax.swing.JEditorPane tt8;
    private javax.swing.JEditorPane tt9;
    private javax.swing.JEditorPane wt1;
    private javax.swing.JEditorPane wt10;
    private javax.swing.JScrollPane wt11;
    private javax.swing.JEditorPane wt12;
    private javax.swing.JEditorPane wt2;
    private javax.swing.JEditorPane wt3;
    private javax.swing.JEditorPane wt4;
    private javax.swing.JEditorPane wt5;
    private javax.swing.JEditorPane wt6;
    private javax.swing.JEditorPane wt7;
    private javax.swing.JEditorPane wt8;
    private javax.swing.JEditorPane wt9;
    // End of variables declaration//GEN-END:variables
}
