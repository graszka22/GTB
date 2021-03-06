package gtb.model.operations;

import gtb.model.Graph;
import gtb.model.GraphElement;

/**
 * Created by angela on 5/4/16.
 */
public class AddElementAction implements Reverseable {
    private GraphElement e;

    public AddElementAction(GraphElement e) {
        this.e = e;
    }

    @Override
    public void reverse(Graph g) {
        e.removeYourself(g);
    }

    @Override
    public void doIt(Graph g) {
        e.addYourself(g);
    }
}
