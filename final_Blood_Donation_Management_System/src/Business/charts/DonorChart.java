/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.charts;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import java.util.List;

/**
 * This class is used to create a pie chart of the number of donors in the system.
 */
public class DonorChart extends ApplicationFrame {
  public DonorChart(String title, List<DonorStatistics> donorStatisticses, int id) {
    super(title);
    setContentPane(createPanel(donorStatisticses, title));

  }

  private static PieDataset intializeData(List<DonorStatistics> donorStatisticses) {
    DefaultPieDataset dataset = new DefaultPieDataset();
    for (int i = 0; i < donorStatisticses.size(); i++) {
      dataset.setValue(donorStatisticses.get(i).getBloodGroup(), donorStatisticses.get(i).getNoOfDonors());
    }


    return dataset;
  }


  private static JFreeChart createChart(PieDataset dataset, String title) {
    JFreeChart chart = ChartFactory.createPieChart(title, dataset, true, true, false);
    return chart;
  }

  private static ChartPanel createPanel(List<DonorStatistics> donorStatisticses, String title) {
    JFreeChart chart = createChart(intializeData(donorStatisticses), title);
    ChartPanel panel = new ChartPanel(chart);
    panel.setPreferredSize(new java.awt.Dimension(500, 270));
    return panel;
  }


  private static void createAndShowGui(List<DonorStatistics> donorStatisticses, String title) {
    DonorChart demo = new DonorChart(title, donorStatisticses, 0);
    demo.pack();
    demo.setVisible(true);
  }



}
