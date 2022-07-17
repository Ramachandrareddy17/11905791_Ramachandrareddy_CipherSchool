package encapsulation;

public class Player {
    static private int maxHealth;
    private String name;
    int currentHealth;
    static {
        maxHealth = 100;
    }

    public Player(String name) {
        this.name = name;
        this.currentHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
}
