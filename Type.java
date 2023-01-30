package part3;

public enum Type {
    DOG("dog"), CAT("cat"), BIRD("bird");

    private String petType;

    Type(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }
}
