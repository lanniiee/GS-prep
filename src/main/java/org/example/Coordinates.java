package org.example;

public class Coordinates {

    private int x = 0;
    private int y = 0;

    public Coordinates () {
    }

    public int[] move(String commands) {

        for (int i = 0; i < commands.length(); i++) {

            switch (commands.toUpperCase().charAt(i)) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
            }
        }

        return new int[] {x,y};
    }


}
