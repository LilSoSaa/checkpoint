public class Professor extends AbstractPerson {

    

    @Override
    public boolean canApplyAsTutor() {
        return false;
    }

    @Override
    public boolean canApplyAsHead() {
        return false;
    }
}
