package ExamPrep.Third.Guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private String name;
    private int capacity;
    private List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean removePlayer(String name){
        return roster.removeIf(p->p.getName().equals(name));
    }

    public void addPlayer(Player player) {
        if(this.roster.size()<this.capacity){
            this.roster.add(player);
        }
        
    }

    public void promotePlayer(String name) {
        for (Player player : roster) {
            if(player.getName().equals(name)){
                player.setRank("Member");
                break;
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : roster) {
            if(player.getName().equals(name)){
                player.setRank("Trail");
                break;
            }
        }
    }
    public Player[] kickPlayersByClass(String clazz) {
        Player[] players = this.roster.stream()
                .filter(p -> p.getClazz().equals(clazz))
                .toArray(Player[]::new);

        for (Player player : players) {
            this.roster.removeIf(p->p.getName().equals(player.getName()));
            
        }

        return players;


    }

    public int count() {
        return  this.roster.size();
    }

    public String report() {
        StringBuilder out = new StringBuilder();

        out.append("Players in the guild: ")
                .append(this.getName())
                .append(":")
                .append(System.lineSeparator());

        for (Player player : roster) {
            out.append(player.toString())
                    .append(System.lineSeparator());
        }

        return out.toString().trim();
    }
    }

