import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.TreeMap;

public class GUIFrame extends JFrame {
    private JButton okButton;
    private JPanel rootPanel;

    public GUIFrame() {
        setContentPane(rootPanel);
        setVisible(true);
        setSize(1000,500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector n = new Vector(0,0);
                Istok is = new Istok(n.x,n.y, false);
                Okr ok = new Okr(0, 4, 2);
                TreeMap<Double, Double> map = is.getlight(ok);
                Graphics2D g = (Graphics2D) getGraphics();

                g.setBackground(Color.GREEN);
                g.setColor(Color.RED);
                Iterator<Double> it = map.keySet().iterator();
                for (double o : map.keySet()) {
                    //System.out.println(100*o+"   "+100*map.get(o));
                    g.drawOval(300 + (int) (100 * o), 200 + (int) (100 * (double) map.get(o)), 1, 1);
                }
                g.setColor(Color.GRAY);
                g.drawLine(100,200,500,200);
                g.drawLine(300,0,300,400);
                g.setColor(Color.BLACK);
                g.drawLine(400,100,400 + (int)(n.x*100),100+(int)(n.y*100));
                g.drawOval(400 + (int)(n.x*100), 100+(int)(n.y*100),10,10);
                g.drawString("0",300,200);
                g.drawString("x",500,200);
                g.drawString("y",300,400);
                for(Object o: ok.pov.keySet())
                {
                    g.drawOval(300+(int)(100*(double)o) ,200+(int)(100*(double)ok.pov.get(o)),1,1);
                }
            }
        });


    }
    public static void main(String[] args) {
//        Istok is = new Istok(0,1,true);
//        Okr ok = new Okr(0,4,2);
//        TreeMap<Double,Double> map =  is.getlight(ok);
//        for(Object i: ok.pov.keySet())
//            System.out.println(ok.normal((double)i).x + "  " + ok.normal((double)i).y);

//

       new GUIFrame();
    }

}