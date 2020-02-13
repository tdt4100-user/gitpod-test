package stateandbehavior;

interface LocationInterface {
    public int getX();

    public int getY();

    public void move(int dx, int dy);

    public void left();

    public void right();

    public void up();

    public void down();
}