import java.util.Map;

public class Course {
    static String[] levels = new String[5];

    public Course(String[] levels){
        Course.levels = levels;
    }

    public void showLevels(){
        System.out.println("В полосе препятствий следующие испытания:");
        for(String s : levels){
            System.out.println(s);
        }
    }

    public void dolt(Team team){
        for(Map.Entry<String, Boolean> entry : Team.players.entrySet()){
            int a = (int) ( Math.random() * 2 );
            if(a == 0) team.setPlayerStatus(entry.getKey(),true);
            else team.setPlayerStatus(entry.getKey(),false);
        }
    }

}
