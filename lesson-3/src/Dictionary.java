import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary{
    private ArrayList<String> dict;

    public Dictionary(){
        this.dict = new ArrayList<String>();
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for(String s : this.dict){
            str.append(s).append(" ");
        }
        return str.toString();
    }

    public String getElement(int index){
        return this.dict.get(index);
    }

    public void addElement(String str){
        this.dict.add(str);
    }

    public void getCounts(boolean flag){
        int cnt;
        Map<String, Integer> map = new HashMap<>();
        if(flag){ // без учета регистра
            for(String str : this.dict){
                map.putIfAbsent(str.toLowerCase(), 1);
                map.put(str.toLowerCase(), map.get(str.toLowerCase())+1);
            }
        }
        else{ // с учетом регистра
            for(String str : this.dict){
                map.putIfAbsent(str, 1);
                map.put(str, map.get(str)+1);
            }
        }

        printMap(map);
    }


    private void printMap(Map<String, Integer> map){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
