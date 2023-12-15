public class MasterStudent extends Student implements ConferenceScoreBehavior {
    int numberOfConf;

    public MasterStudent(int id, float mid, float fin, int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }


    @Override
    public float computeTotalScore() {
        return super.computeBaseScore() + conferenceScore();
    }

    @Override
    public float conferenceScore() {
        return numberOfConf * 5;
    }
}
