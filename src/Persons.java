public class Persons {
    private String name;
    private Integer age;

    public Persons(){

    }

    public Persons(String name, Integer age) {
        this.name =name;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" + " Name" + name + ", Age" + age + "}";
    }
}
