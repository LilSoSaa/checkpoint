public class Student extends AbstractPerson {
 public int courseYear;
    @Override
    public boolean canApplyAsTutor() {


        if (courseYear>=3){
            return true;
        }


    @Override
    public boolean canApplyAsHead() {
        return false;
    }


    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

}
