public class Main {

    public static void main(String[] args) {
        String[] levels = {"Фехтование","Плавание","Конкур","Бег","Стрельба из пистолета"};
        String[] players = {"Дмитрий", "Виктория", "Иван", "Екатерина"};
        Course c = new Course(levels);
        Team team = new Team("Чемпионы Java", players);
        c.showLevels();
        team.getPlayers();
        c.dolt(team);
        team.showResults();
    }
}
