
package projectrecap;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Eleni
 */
public class Team {
    
    private String sport;
    private List<Person> players;

    public Team() {
    }

    public Team(String sport) {
        this.sport = sport;
    }
    
    

    public Team(String sport, List<Person> players) {
        this.sport = sport;
        this.players = players;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<Person> getPlayers() {
        return players;
    }

    public void setPlayers(List<Person> players) {
        this.players = players;
    }
    
    public void addPlayer(Person p){
    players.add(p);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.sport);
        hash = 67 * hash + Objects.hashCode(this.players);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Team other = (Team) obj;
        if (!Objects.equals(this.sport, other.sport)) {
            return false;
        }
        if (!Objects.equals(this.players, other.players)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Team{" + "sport=" + sport + ", players=" + players + '}';
    }
    
    
    
}
