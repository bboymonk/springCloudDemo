package game;

/**
 * Created by wjb on 2018/7/19.
 */
public class Strip extends Block {
    private final int w = 4, h = 1;

    Strip() {
        super();
        bk = new int[h][w];
        kb = new int[w][h];
        for (int i = 0; i < w; i++) {
            bk[h - 1][i] = 1;
            kb[i][h - 1] = 1;
        }
    }

    public void Turn()//重写父类旋转方法
    {
        if (type == 0)
            type = 1;
        else
            type = 0;
    }
}
