package EnemyProblem;

public class Enemy{
   private String enemyName;
   private int level;
   private int damage;
   private float health;
   private float armor;
   private float stamina;

   public Enemy(String enemyName, int level, int damage, float health, float armor, float stamina){
   this.enemyName= enemyName;
   this.level = level;
   this.damage = damage;
   this.health = health;
   this.armor = armor;
   this.stamina = stamina;
   }
public String getEnemyName() {
    return enemyName;
}
public void setEnemyName(String enemyName) {
    this.enemyName = enemyName;
}
public int getLevel() {
    return level;
}
public void setLevel(int level) {
    this.level = level;
}
public int getDamage() {
    return damage;
}
public void setDamage(int damage) {
    this.damage = damage;
}
public float getHealth() {
    return health;
}
public void setHealth(float health) {
    this.health = health;
}
public float getArmor() {
    return armor;
}
public void setArmor(float armor) {
    this.armor = armor;
}
public float getStamina() {
    return stamina;
}
public void setStamina(float stamina) {
    this.stamina = stamina;
}
   
public void Move()
{
  if(stamina > 0)
  {
    System.out.println("move 1 space");
    stamina--;
  }

}
public void Attack()
{
  if(stamina > 0){
    System.out.println("move 1 space");
    stamina--;
  }
  else
  System.out.println(enemyName+ ": is out of stamina");
}
public void takeDamage()
{
 if(health>0)
 {
    System.out.println(enemyName+ " : took damage");
   health--;
 }
 else if (health<=0)
 {
    System.out.println(enemyName+ ": is dead");
 }
}

}
