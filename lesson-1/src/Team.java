import java.util.HashMap;
import java.util.Map;

public class Team {
    static String name;
    static Map<String, Boolean> players = new HashMap<>();

    public Team(String name, String[] players){
        Team.name = name;
        Map<String, Boolean> participants = new HashMap<>();
        for(String s : players){
            participants.put(s, false);
        }
        Team.players = participants;
    }

    public void getPlayers(){
        System.out.println("Участники команды "+ "\"" + name + "\"" + ":");
        for(Map.Entry<String, Boolean> entry : players.entrySet()){
            System.out.println(entry.getKey());
        }
    }

    public void showResults(){
        System.out.println("Результаты прохождения испытания командой " + "\"" + name + "\"" + ":");
        for(Map.Entry<String, Boolean> entry : players.entrySet()){
            if(entry.getValue()) System.out.println(entry.getKey() + " прошёл(-ла) полосу препятствий!");
            else System.out.println(entry.getKey() + " не прошёл(-ла) полосу препятствий :(");
        }
    }

    public void setPlayerStatus(String player, boolean b){
        players.put(player,b);
    }
}
