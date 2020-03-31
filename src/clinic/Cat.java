package clinic;

public class Cat {

    private String catName;
    private int catAge;
    private boolean isIndoor;

    public Cat(String catName, int catAge, boolean isIndoor) {

        this.catName = catName;
        this.catAge = catAge;
        this.isIndoor = isIndoor;

    }

    public String getCatName() {
        return catName;
    }

    public int getCatAge() {

        return catAge;
    }

    public boolean getIsIndoor() {

        return isIndoor;
    }

}
