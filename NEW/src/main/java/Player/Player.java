package Player;

import jakarta.persistence.*;

@Entity
@Table(name = "player_stats")
public class Player {

    @Id
    @Column(name = "name", unique = true)
    private String name;

    private String nation;
    private String pos;
    private Integer age;
    private Integer mp;      // Matches played
    private Double gls;      // Goals
    private Double ast;      // Assists
    private String team;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String nation, String pos, int age, int mp, double gls, double ast, String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.gls = gls;
        this.ast = ast;
        this.team = team;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public double getGls() {
        return gls;
    }

    public void setGls(double gls) {
        this.gls = gls;
    }

    public double getAst() {
        return ast;
    }

    public void setAst(double ast) {
        this.ast = ast;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", pos='" + pos + '\'' +
                ", age=" + age +
                ", mp=" + mp +
                ", gls=" + gls +
                ", ast=" + ast +
                ", team='" + team + '\'' +
                '}';
    }
}
