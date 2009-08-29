package experimentalcode.remigius.Visualizers;

import java.util.Comparator;

/**
 * Compares Visualizers by level. <br>
 * Note: this comparator imposes orderings that are inconsistent with equals.
 * 
 * @author Remigius Wojdanowski
 * 
 */
public class VisualizerComparator implements Comparator<Visualizer> {

  @Override
  public int compare(Visualizer o1, Visualizer o2) {
    if(o1.getLevel() < o2.getLevel())
      return -1;
    if(o1.getLevel() > o2.getLevel())
      return 1;
    return 0;
  }
}
