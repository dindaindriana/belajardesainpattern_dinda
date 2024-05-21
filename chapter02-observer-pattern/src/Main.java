public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("Dinda Fitria Indriana");
        User user1 = new User("Adin");
        User user2 = new User("Indriana");
        User user3 = new User("Elvi");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");

        user3.subscribe(ch);
        ch.notifyUser("Video baru!");
    }
}
