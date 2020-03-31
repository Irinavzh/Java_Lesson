package casting;

public class Agency {
    public static void casting(Model[] models) {
        for (int i = 0; i < models.length; i++) {
            if ((models[i].getIsFemale() == false &&  models[i].getHeight() > 185 && models[i].getWeight() < 78) ||
                    (models[i].getIsFemale() == true && models[i].getHeight() > 175 && models[i].getWeight() < 58)) {
                System.out.println("Dear " + models[i].getFirstName() + " " + models[i].getLastName() +
                        ", we are happy to inform you that you have been selected.");
                System.out.println("Welcome to our show!");
                System.out.println("______________________");
                System.out.println();
            } else {
                System.out.println("Dear " + models[i].getFirstName() + " " + models[i].getLastName() +
                        ", thank you for your interest in the runway position in our show." );
                System.out.println("We regret to inform you that you have not been selected on this occasion.");
                System.out.println("We wish you every success in your future career.");
                System.out.println("______________________");
                System.out.println();
            }
        }
    }
}
