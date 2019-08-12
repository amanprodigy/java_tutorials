package player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health = 100;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.health);

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.health);

        // Enhanced player
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Aman", 100, "Bazooka");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());

    }
}
