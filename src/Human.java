public class Human {
    private String  name = "";
    private boolean gender = true;
    private int age = 1;

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void say(String words) {
        System.out.println(words);
    }

    public void eat(Apple apple) {
        apple.setWeight();
        System.out.println(this.name+" ăn 1 miếng");
    }

    public void sleep(){
        System.out.println(this.name+" đi ngủ");
    }

    public void born(){
        System.out.println(this.name+" đã sinh ra");
    }
}
