public enum Winter {
    DECEMBER("The beginning of winter"),
    JANUARY("The coldest month "),
    FEBRUARY("A short month");

    private String description;

    Winter(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Season: winter " +"\n"+
                "Description: " + description;
    }
}
