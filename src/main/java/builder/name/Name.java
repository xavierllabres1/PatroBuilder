package builder.name;

public final class Name {

    private Name(Builder builder){
        this.firstName = builder.firstName;
        this.id = builder.id;

    }
    private final Long id;
    private final String firstName;

    public static class Builder{
        private Long id;
        private String firstName;

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
