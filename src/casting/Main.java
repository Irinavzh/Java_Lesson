package casting;

public class Main {
    public static void main(String[] args) {
        Model model1 = new Model("Elena", "Ivanova", true, 178, 56);
        Model model2 = new Model("Kaia", "Gerber", true, 169, 57);
        Model model3 = new Model("Adriana", "Lima", true, 183, 50);
        Model model4 = new Model("Ivan", "Petrov", false, 190, 76);
        Model model5 = new Model("Alex", "Clark", false, 178, 77);
        Model model6 = new Model("Olga", "Grig", true, 189, 60);
        Model model7 = new Model("John", "Weaver", false, 199, 80);
        Model model8 = new Model("Cindy", "Crawford", true, 187, 57);
        Model model9 = new Model("Tom", "Brady", false, 192, 75);
        Model model10 = new Model("Tyson", "Ballou", false, 198, 76);

        Agency agency = new Agency();

        Model[] models = new Model[10];
        models[0] = model1;
        models[1] = model2;
        models[2] = model3;
        models[3] = model4;
        models[4] = model5;
        models[5] = model6;
        models[6] = model7;
        models[7] = model8;
        models[8] = model9;
        models[9] = model10;

        Agency.casting(models);
    }
}
