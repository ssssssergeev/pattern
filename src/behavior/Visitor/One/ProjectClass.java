package behavior.Visitor.One;

//ConcreteElementC
public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
