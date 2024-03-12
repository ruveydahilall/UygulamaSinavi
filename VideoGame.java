public class VideoGame {
    private String gameName;

    private int gamePrice;
    private int gameStock;
    private GameTypleList gameType;

    public VideoGame(String gameName, int gamePrice, int gameStock, GameTypleList gameType) {
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.gameStock = gameStock;
        this.gameType = gameType;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public void setGameType(GameTypleList gameType) {
        this.gameType = gameType;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameStock(int gameStock) {
        this.gameStock = gameStock;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public int getGameStock() {
        return gameStock;
    }

    public GameTypleList getGameType() {
        return gameType;
    }
}
