package clinic;

public class VetAssistant {

public void check(boolean isIndoor, int catAge, String catName) {

    if((isIndoor == false) & (catAge > 2))  {
        System.out.println();
        System.out.println(catName + " is a homeless cat, AND " + catName + " is older then 2 years old.");
        System.out.println(catName + " needs to be vaccinated.");
    } else {
        if(isIndoor == false) {
            System.out.println();
            System.out.println(catName + " is a homeless cat.");
            System.out.println(catName +  " does not need to be vaccinated because he/she is too young.");
            System.out.println(catName + " can go through the animal adoption process.");
        } else {
            System.out.println();
            System.out.println(catName + " is an indoor cat.");
            System.out.println(catName + " can go home!");
        }
    }
}

    public void brakeLine () {
        String a = "__________________________";
        System.out.println(a);
    }

}
