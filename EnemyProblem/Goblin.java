package EnemyProblem;
public class Goblin extends Enemy{
    
    

    public Goblin(String enemyName, int level, int damage, float health, float armor, float stamina){
        super(enemyName, level, damage, health, armor, stamina);
    }
    public void Attack(){
        if(getStamina() > 0){
            System.out.println("move 1 space");
            //setStamina(getStamina())-2;
          }
          else
          System.out.println(getEnemyName()+ ": is out of stamina");
    }
}