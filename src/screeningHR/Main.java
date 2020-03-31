package screeningHR;

public class Main {
    public static void main(String[] args) {

        Candidate candidate1 = new Candidate("John", "Smith", 45, true, 30);
        Candidate candidate2 = new Candidate("Katherine", "Payne", 40, false, 12);
        Candidate candidate3 = new Candidate("Austin", "Jackson", 24, true, 3);
        Candidate candidate4 = new Candidate("Diana", "McKenzie", 38, true, 2);
        Candidate candidate5 = new Candidate("Ben", "Jones", 35, true, 8);

        HR hr1 = new HR();

        Candidate[] candidates = {candidate1, candidate2, candidate3, candidate4, candidate5};

        hr1.screening1(candidates);
    }
}
