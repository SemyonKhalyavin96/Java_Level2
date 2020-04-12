import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook{
    private Map<Long, String> map;

    public PhoneBook(){
        this.map = new HashMap<>();
    }

    public void add(String name, long phone){
        this.map.put(phone, name);
    }

    public void get(String lastName){
        ArrayList<Long> arr = new ArrayList<>();
        for(Map.Entry<Long, String> entry : this.map.entrySet()){
            if(entry.getValue().equals(lastName)){
                arr.add(entry.getKey());
            }
        }
        if(arr.size() == 0) System.out.println(lastName + " отсутствует в справочнике!");
        else{
            System.out.println(lastName + ":");
            printList(arr);
        }
    }

    private void printList(ArrayList<Long> arr){
        for(long i : arr){
            System.out.println(i);
        }
    }

    public void printPhoneBook(){
        System.out.println("-----------------------------");
        for(Map.Entry<Long, String> entry : this.map.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
        System.out.println("-----------------------------");
    }
}
