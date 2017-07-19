package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class Group extends Component {

    public Group(String str) {
        super(str);
    }

    public List<Component> getComponents() {
        List<Component> cl = new ArrayList<>();
        Enumeration<DefaultMutableTreeNode> de = getNode().children();
        while (de.hasMoreElements()) {
            cl.add((Component) de.nextElement().getUserObject());
        }
        return cl;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for (Component c : getComponents()) {
            c.accept(v);
        }
    }

    @Override
    public void update(Observable o) {
        for (Component c : getComponents()) {
            c.update(o);
        }
    }

}
