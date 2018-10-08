public class Apple {
    public int weight = 5;
    public boolean isEmpty() {
        if (this.weight < 1) {
            return true;
        }
        return false;
    }
    public void deliciousapple(){
        System.out.println("Quả táo quá ngon");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = this.weight - 1;
    }
}
