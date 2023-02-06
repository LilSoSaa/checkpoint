public  abstract class AbstractPerson {

    public String firstName;
    public String lastName;

    public int age;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


     public abstract  boolean canApplyAsTutor();


    public abstract  boolean canApplyAsHead();




}
