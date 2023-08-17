package assignment05;

public class App {
    public static void main(String[] args) throws Exception {
        StudyPlan studyPlan = new StudyPlan();
        studyPlan.buildStudyPlan();
        studyPlan.closeScanner();
    }
}
