package EnemyProblem;

public class App{
    public static void main(String[] args){
        Goblin gobOne = new Goblin("Gobby", 2, 10, 30, 10, 5);
      // Skeleton regSkelly = new Skeleton("skelly", 2, 10, 30, 10, 5);
        gobOne.setEnemyName("Gobster");
        String name = gobOne.getEnemyName();
        System.out.println(name);
       
    }
}
