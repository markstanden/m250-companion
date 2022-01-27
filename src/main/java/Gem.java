public class Gem
{
    private String kind;     // The kind of gem.
    private String colour;   // The colour of the stone.
    private double weight;   // The weight in carats.

    public Gem(String aKind, String aColour, double aWeight)
    {
        kind = aKind;
        colour = aColour;
        weight = aWeight;
    }

    public String getKind()
    {
        return kind;
    }

    public String getColour()
    {
        return colour;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String toString()
    {
        return kind
                + ", colour = " + colour
                + ", weight = " + weight;
    }
}