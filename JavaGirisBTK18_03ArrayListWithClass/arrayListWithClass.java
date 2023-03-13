package JavaGirisBTK18_03ArrayListWithClass;

import java.util.ArrayList;

public class arrayListWithClass {
    public static void main(String[] args) {
        ArrayList<Customer> customers =new ArrayList<>();
        customers.add(new Customer(1,"Engin","Demirol"));
        customers.add(new Customer(2,"Mustafa","Demirol"));
        customers.add(new Customer(3,"Mahmure","Demirol"));
        Customer erdem= new Customer(4,"Erdem","Demirol");
        customers.add(erdem);
        //customers.remove(erdem); silerken böyle yada index ile kullanıyoruz
        customers.sort((firstName1, firstName2)
                -> firstName1.firstName.compareTo(firstName2.firstName));//class olarak sort ettim

        for(Customer customer:customers){
            System.out.println(customer.firstName+" "+customer.lastName+" "+customer.id);
        }

    }
}
