public class Main {
    public static void main(String[] args) {

        ShoppingSite site = new ShoppingSite("Game Center");
        VideoGame videoGame1 = new VideoGame("Last Of Us",100,150, GameTypleList.Adventure);
        VideoGame VideoGame2 = new VideoGame("Tabu",75,225, GameTypleList.Puzzle);
        site.addVideoGame(videoGame1);
        site.addVideoGame(VideoGame2);

        System.out.println("Name of the store: "+ site.getStoreName());
        System.out.println("Name of the videoGame1: " + videoGame1.getGameName());
        System.out.println("Price of the videoGame1: $" + videoGame1.getGamePrice());
        System.out.println("Type of the videoGame1: "+ videoGame1.getGameType());
        System.out.println("Total videoGame1 Stock of the shopping site:" + site.totalGameStock);


        System.out.println("--------------");

        System.out.println("Name of the store: " + site.getStoreName());
        System.out.println("Name of the videoGame1: " + VideoGame2.getGameName());
        System.out.println("Price of the videoGame1: $" + VideoGame2.getGamePrice());
        System.out.println("Type of the videoGame1: " + VideoGame2.getGameType());
        System.out.println("Total Game Stock of the shopping site:" + site.totalGameStock);


    }

}