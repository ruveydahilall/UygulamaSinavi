public class ShoppingSite{
    public int totalGameStock;
    private String storeName;
    private int videoGameCount;
    private VideoGame[] videoGameList = new VideoGame[100];

    public ShoppingSite(String name){
        this.storeName = name;
    }

    public String getStoreName() {
        return storeName;
    }
    public void addVideoGame(VideoGame videoGame){
        videoGameList[videoGameCount] = videoGame;
        videoGameCount++;
        totalGameStock += videoGame.getGameStock() ;
    }
}