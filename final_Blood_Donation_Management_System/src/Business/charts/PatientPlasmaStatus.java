/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.charts;

import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author sreshtha
 */
public class PatientPlasmaStatus extends ApplicationFrame{
      public PatientPlasmaStatus(String title,List<DonorStatistics> donorStatisticses) {
        super(title);
              setContentPane(createDemoPanel(donorStatisticses,title));

    }
    
    private static PieDataset createDataset(List<DonorStatistics> donorDetails) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      for(int i= 0;i < donorDetails.size();i++)
      {
         dataset.setValue(donorDetails.get(i).getBloodGroup(), donorDetails.get(i).getNoOfDonors());
      }
      
      
      return dataset;         
   }
   
   private  JFreeChart createChart( PieDataset dataset,String title ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         title,  
         dataset,           
         true,              
         true, 
         false);

      return chart;
   }
   
   public JPanel createDemoPanel(List<DonorStatistics> donorStatisticses,String title) {
      JFreeChart chart = createChart(createDataset(donorStatisticses),title );  
      return new ChartPanel( chart ); 
   }


}
