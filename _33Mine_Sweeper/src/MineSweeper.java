import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mineCount;

    String[][] gameMap = new String[row][col];
    String[][] gameBoard = new String[row][col];

    int rowSelect;
    int colSelect;
    int mineCounter;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineCount = (row * col) / 4;

        gameMap = new String[row][col];
        gameBoard = new String[row][col];

    }

    // We randomly place mines on the map.
    public void createMap() {
        // randomly select mine position
        for (int i = 0; i < mineCount; i++) {
            while (true) {

                int r = (int) (Math.random() * row); // random row
                int c = (int) (Math.random() * col); // random column

                if (gameMap[r][c] != "*") { // if there is no mine in this position
                    gameMap[r][c] = "*";
                }
                break;
            }
        }
        System.out.println("==============================");
        // then fill the other positions and write the map
        for (int i = 0; i < gameMap.length; i++) {
            // we write  "gameMap[0]" in here because  we want see which row's column we are
            for (int j = 0; j < gameMap[0].length; j++) {
                if (gameMap[i][j] != "*") { // if there is no mine in this position
                    gameMap[i][j] = "-";
                }
                System.out.print(gameMap[i][j] + " | "); // print the map
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

    // Player selects a position.
    public void playerSelection() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Select your row  : ");
        rowSelect = (scn.nextInt() - 1);
        System.out.print("Select your column  : ");
        colSelect = (scn.nextInt() - 1);
    }

    //We get the answers of gamer
    public void getAnswers(){
        playerSelection();
        boolean isTrue = false;
        while (!isTrue){ // if the player enters a wrong position, we ask again.
            if (rowSelect<0 || rowSelect > gameBoard.length - 1 || colSelect <0 || colSelect > gameBoard[0].length - 1){
                // if the player enters a wrong position, we ask again.
                System.out.println("Wrong entrance, Try again");
                playerSelection();
            }else{
                isTrue =true; // if the player enters a correct position, we continue.
            }
        }

    }

    //We create invisible game board.
    public void createGameBoard(){
        for (int i = 0; i < gameBoard.length ; i++){
            for (int j = 0; j < gameBoard[0].length ; j++){
                gameBoard[i][j] = "-";
            }
        }
    }

    // We print the game board.
    public void printGameBoard(){
        for (int i = 0; i < gameBoard.length ; i++){
            for (int j = 0; j < gameBoard[0].length ; j++){
                System.out.print(gameBoard[i][j] + " | ");
            }
            System.out.println();
        }
    }

    //Mine detector
    public void mineDetector() {
        mineCounter = 0;
        if (colSelect + 1 < gameMap[0].length ) {
            if (gameMap[rowSelect][colSelect + 1] == "*")
                mineCounter++;
        }

        if (colSelect - 1 >= 0) {
            if (gameMap[rowSelect][colSelect - 1] == "*")
                mineCounter++;
        }

        if (rowSelect + 1 < gameMap.length ) {
            if (gameMap[rowSelect + 1][colSelect] == "*")
                mineCounter++;
        }

        if (rowSelect - 1 >= 0) {
            if (gameMap[rowSelect - 1][colSelect] == "*")
                mineCounter++;
        }

        if (rowSelect - 1 >= 1 && colSelect - 1 >= 1) {
            if (gameMap[rowSelect - 1][colSelect - 1] == "*")
                mineCounter++;
        }

        if (rowSelect - 1 >= 0 && colSelect + 1 < gameMap[0].length ) {
            if (gameMap[rowSelect - 1][colSelect + 1] == "*")
                mineCounter++;
        }

        if (rowSelect + 1 < gameMap.length  && colSelect - 1 >= 1) {
            if (gameMap[rowSelect + 1][colSelect - 1] == "*")
                mineCounter++;
        }
        if (rowSelect + 1 < gameMap.length  && colSelect + 1 < gameMap[0].length ) {
            if (gameMap[rowSelect + 1][colSelect + 1] == "*")
                mineCounter++;
        }


        for (int i = 0 ; i <= mineCounter ; i++){
            gameBoard[rowSelect][colSelect] = ""+i;
            gameMap[rowSelect][colSelect] = ""+i;
        }

    }

    boolean checkContinue() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[0].length; j++) {
                if (gameMap[i][j] == "-")
                    return false;
            }
        }
        return true;
    }


    public void run(){
        System.out.println("WELCOME TO THE GAME");
        createMap();
        createGameBoard();
        printGameBoard();


        while (true){

            this.getAnswers();

            if (gameMap[rowSelect][colSelect] == "*"){
                System.out.println("Game Over !!!");
                break;

            }else{
                mineDetector();
                printGameBoard();
                if ((checkContinue())) {
                    System.out.println("Congratulations... WIN GAME !");
                    break;
                }
            }
        }
    }
}
