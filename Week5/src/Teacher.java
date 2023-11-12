public class Teacher {
    int id;
    Branch branch;

    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", branch=" + branch +
                '}';
    }
}
