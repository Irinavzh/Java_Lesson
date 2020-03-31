package clinic;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya", 3, true);
        Cat cat2 = new Cat("Murka", 4, false);
        Cat cat3 = new Cat("Tiger", 1, false);

        VetAssistant vetAssistant = new VetAssistant();

        String catName1 = cat1.getCatName();
        int catAge1 = cat1.getCatAge();
        boolean isIndoor1 = cat1.getIsIndoor();

        vetAssistant.check(isIndoor1, catAge1, catName1);
        vetAssistant.brakeLine();

        String catName2 = cat2.getCatName();
        int catAge2 = cat2.getCatAge();
        boolean isIndoor2 = cat2.getIsIndoor();

        vetAssistant.check(isIndoor2, catAge2, catName2);
        vetAssistant.brakeLine();

        String catName3 = cat3.getCatName();
        int catAge3 = cat3.getCatAge();
        boolean isIndoor3 = cat3.getIsIndoor();

       vetAssistant.check(isIndoor3, catAge3, catName3);
       vetAssistant.brakeLine();
    }
}
