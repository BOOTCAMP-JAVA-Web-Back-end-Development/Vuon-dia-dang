public class World {
    public static void main(String[] args) {
        Human Adam = new Human("Adam", true) {
        };

        Human Eva = new Human("Eva", false) {
        };

        Adam.born();
        Eva.born();
        Apple apple = new Apple() {

        };
        apple.deliciousapple();
        God.say("Không được ăn táo, nếu ăn sẽ chết");

        Snake.say("Ăn táo đi ngon lắm, không chết đâu");
        while (!apple.isEmpty()) {
            if(apple.weight >0){
                Adam.eat(apple);
                System.out.println("Quả táo còn " + apple.getWeight() + " miếng");
            }
            if( apple.weight>0){
                Eva.eat(apple);
                System.out.println("Quả táo còn " + apple.getWeight() + " miếng");
            }
            apple.getWeight();
            System.out.println("Quả táo còn " + apple.getWeight() + " miếng");
        }
        Adam.sleep();
        Eva.sleep();

        God.say("Eva! Bà sẽ phải vâng lời chồng và đau đớn khi sinh con.");
        God.say("Adam! ngươi sẽ phải cuốc đất trồng cấy mà ăn");
        Snake.say("Đấy, đã nói rồi, có chết đâu!!!");
    }
}
