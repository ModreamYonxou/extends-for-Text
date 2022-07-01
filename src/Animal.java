public class Animal {
    private String name;
    private int age;
    private String sex;
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public boolean ageEquals(Animal obj) {
        return this.getAge()==obj.getAge();
    }
    public void setAge(int age) {
        this.age=age;
    }
    public int getAge() {
        return age;
    }
}
