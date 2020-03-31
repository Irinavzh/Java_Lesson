package screeningHR;

public class HR {

    public void screening1 (Candidate[] candidates) {
        for (int i = 0; i < candidates.length; i++) {
            if ((candidates[i].getIsDiploma() == true) && (candidates[i].getExperience() >= 3) &&
                    (candidates[i].getAge() >= 25)) {
                System.out.println(candidates[i].getFirstName() + " " + candidates[i].getLastName() +
                        ", we would like to make an offer!");
            } else {
                System.out.println(candidates[i].getFirstName() + " " + candidates[i].getLastName() +
                        ", thank you for your time, we are sorry.");
            }
        }
    }
}
