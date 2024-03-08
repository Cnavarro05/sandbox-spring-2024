package orgexamplesandbox.inheritance.aggregation;

public class Salad {
    private String lettuce;
    private String tomato;
    private String pepper;
    private String crutons;

    public Salad() {
        this.lettuce = "tons";
        this.tomato = "lots";
        this.pepper = "a few";
        this.crutons = "lots";
    }

    public Salad(String lettuce, String tomato, String pepper, String crutons) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pepper = pepper;
        this.crutons = crutons;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salad{");
        sb.append("lettuce='").append(lettuce).append('\'');
        sb.append(", tomato='").append(tomato).append('\'');
        sb.append(", pepper='").append(pepper).append('\'');
        sb.append(", crutons='").append(crutons).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
