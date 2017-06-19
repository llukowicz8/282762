package pl.edu.agh.tkk17.sample;

/**
 * Created by lukasz on 19.06.17.
 */
public class NodeSub extends Node {

    public NodeSub(Node left, Node right)
    {
        super(left, right);
    }

    public void accept(NodeVisitor visitor)
    {
        visitor.visit(this);
    }
}
