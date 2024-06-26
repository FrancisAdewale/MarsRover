package InputLayer;

public class Position {
    private int x;
    private int y;
    private Direction facing;


    public Position(int x, int y, Direction facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getFacing() {
        return facing;
    }

    public void setFacing(Direction facing) {
        this.facing = facing;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", facing=" + facing +
                '}';
    }

    public void rotateLeft() {
        switch (facing) {
            case N:
                facing = Direction.W;
                break;
            case E:
                facing = Direction.N;
                break;
            case S:
                facing = Direction.E;
                break;
            case W:
                facing = Direction.S;
                break;
        }


    }

    public void rotateRight() {
        switch (facing) {
            case N:
                facing = Direction.E;
                break;
            case E:
                facing = Direction.S;
                break;
            case S:
                facing = Direction.W;
                break;
            case W:
                facing = Direction.N;
                break;
        }
    }
}
