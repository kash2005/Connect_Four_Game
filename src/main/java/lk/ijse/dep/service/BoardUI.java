package lk.ijse.dep.service;

public interface BoardUI {

    static void notifyWinner() {

    }

    public void update(int col, boolean isHuman);
    public void notifyWinner(Winner winner);

}
