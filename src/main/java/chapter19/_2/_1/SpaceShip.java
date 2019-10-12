package chapter19._2._1;

public enum SpaceShip {

    SCOUT, GARGO, TRANSPORT, CRUISER, BATTLESHIP;

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip spaceShip : values()) {
            System.out.println(spaceShip);
        }
    }
}
