package view;

import model.Customer;

import javax.sound.midi.MidiDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService  implements IService<Customer>{
    static Map<Integer, Customer> list;
    static {
        list= new HashMap<>();
        list.put(1,new Customer(1,"Tuấn Anh","Hung Yen",22,"chuot@gmail.com" ));
        list.put(2,new Customer(2," Anh","Ha Noi",18,"chuot2@gmail.com" ));
        list.put(3,new Customer(3,"Tuấn ","Thai Binh",26,"chuot3@gmail.com" ));
        list.put(4,new Customer(4," An","Hung Yen",24,"chuot4@gmail.com" ));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void save(Customer customer) {
        if (!checkId(customer.getId())){
            list.put(customer.getId(),customer);
        }
    }

    @Override
    public Customer findById(int id) {
        if(checkId(id)){
           return list.get(id);
        }else return null;
    }

    @Override
    public void update(int id, Customer customer) {
        if (checkId(id)){
            list.put(id, customer);
        }
    }


    @Override
    public void remove(int id) {
        if (checkId(id)){
            list.remove(id);
        }
    }

    @Override
    public boolean checkId(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId()== id){
                return true;
            }
        }return false;
    }
}
