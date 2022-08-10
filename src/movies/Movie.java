package movies;

public class Movie {
    // Private string fields
    private String name;
    private String category;

    // Constructors
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " -- " + category;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
