public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double blockAbility;
    
    public Fighter(String name , int damage, int health, int weight, double blockAbility){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.blockAbility = blockAbility;
        
    }
    
    public  int hit(Fighter fighter){ //
        
        System.out.println("-------------------------------------------");
        System.out.println(this.name + " = > " + fighter.name + this.damage + " hit. ");
        
        if (fighter.blockAbility()){
            System.out.println(fighter.name + " blocked the hit.");
            return fighter.health;
        }
        
        if (fighter.health - this.damage < 0){
            return  0;
        }
        
        return fighter.health - this.damage;
    }
    
    public boolean blockAbility(){
        double randomValue = Math.random() * 100;
        return  randomValue <= this.blockAbility;
    }
}
