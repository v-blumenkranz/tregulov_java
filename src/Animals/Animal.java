package Animals;

public enum Animal {
    cat("кошка"), frog("лягушка"), dog("собака");

    private String translation;

    private Animal (String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }
}