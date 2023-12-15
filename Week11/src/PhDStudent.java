public class PhDStudent extends MasterStudent implements ArticleScoreBehavior {
    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int numberOfConf) {
        super(id, mid, fin, numberOfConf);
    }

    @Override
    public float computeTotalScore() {
        return super.computeBaseScore() + articleScore();
    }

    @Override
    public float articleScore() {
        return numberOfArticles * 8;
    }
}
