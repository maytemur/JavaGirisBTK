package JavaGirisBTK18_03ArrayListWithClass;

public class Customer {
    int id;
    String firstName;
    String lastName;
    //get ve set eklemiyoruz tamamen arraylist'e odaklanıyoruz bu noktada
    public Customer(){

    }
    public Customer (int id,String firstName,String lastName){
        this.id= id; //this bu class demek ,yukarıdaki id eşittir parametreyle gelen id şeklinde gidiyoruz
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
