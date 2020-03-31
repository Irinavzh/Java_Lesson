package lesson9;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isRegister;

   public User(String firstName, String lastName, int age, boolean isRegister) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.age = age;
       this.isRegister = isRegister;
   }
   public User(String firstName) {
       this.firstName = firstName;
   }
   public User(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
   }
   public User(int age) {
       this.age = age;
   }
   public User(String firstName, int age) {
       this.firstName = firstName;
       this.age = age;
   }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegister() {
        return isRegister;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public static void print(User[] users) {
       for(int i = 0; i < users.length; i++) {
           System.out.println(users[i].getFirstName() + " " + users[i].getLastName() + " " + users[i].getAge() + " " +
                   users[i].isRegister());
       }
    }

}
