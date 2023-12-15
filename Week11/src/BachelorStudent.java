public class BachelorStudent extends Student implements ProjectScoreBehavior {

    public BachelorStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    float computeTotalScore() {
        return super.computeBaseScore() + getProjectScore();
    }

    @Override
    public float getProjectScore() {
        return 20.0f;
    }
}
