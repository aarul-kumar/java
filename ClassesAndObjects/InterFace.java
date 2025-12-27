package ClassesAndObjects;

public class InterFace {
    interface ChessPlayer {
        void moves();
    }

    static class Queen implements ChessPlayer {
        public void moves() {
            System.out.println("up, down, left, right, diagonal");
        }
    }

    static class Rook implements ChessPlayer {
        public void moves() {
            System.out.println("up, down, left, right");
        }
    }

    public static void main(String[] args) {
        ChessPlayer q = new Queen();
        ChessPlayer r = new Rook();

        q.moves();
        r.moves();
    }
}
