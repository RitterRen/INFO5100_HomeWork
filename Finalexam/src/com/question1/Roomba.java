package com.question1;

public class Roomba implements iRobot{
    private final int[][] room;
    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.DOWN;

    public Roomba(int[][] room){
        this.room = room;
    }


    @Override
    public final boolean move() {
        if (direction.equals(Direction.LEFT)){
            if (y > 0 && room[x][y - 1] != -1){
                y -= 1;
                return true;
            }else{
                return false;
            }
        }else if (direction.equals(Direction.RIGHT)){
            if (y < room[0].length - 1 && room[x][y + 1] != -1){
                y += 1;
                return true;
            }else{
                return false;
            }
        }else if (direction.equals(Direction.UP)){
            if (x > 0 && room[x - 1][y] != -1){
                x -= 1;
                return true;
            }else{
                return false;
            }
        }else if (direction.equals(Direction.DOWN)) {
            if (x < room.length - 1 && room[x + 1][y] != -1) {
                x += 1;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public final void turnLeft() {
        if ( direction.equals(Direction.LEFT)) {
            direction = Direction.DOWN;
        }else if( direction.equals(Direction.RIGHT)) {
            direction = Direction.UP;
        }else if( direction.equals(Direction.UP)) {
            direction = Direction.LEFT;
        }else if( direction.equals(Direction.DOWN)) {
            direction = Direction.RIGHT;
        }
    }

    @Override
    public final void turnRight() {
        if ( direction.equals(Direction.LEFT)) {
            direction = Direction.UP;
        }else if( direction.equals(Direction.RIGHT)) {
            direction = Direction.DOWN;
        }else if( direction.equals(Direction.UP)) {
            direction = Direction.RIGHT;
        }else if( direction.equals(Direction.DOWN)) {
            direction = Direction.LEFT;
        }

    }

    @Override
    public final void clean() {
        room[x][y] = 1;
    }
}
