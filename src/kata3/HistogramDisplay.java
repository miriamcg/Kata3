package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }

    private ChartPanel createPanel() {
        ChartPanel cp = new ChartPanel (createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return cp;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart3D("Histograma JFreeChart", "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, true, true);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15,"","correo.ulpgc.es");
        dataSet.addValue(7,"","gmail.es");
        dataSet.addValue(3,"","yahoo.com");
        return dataSet;
    }
}
