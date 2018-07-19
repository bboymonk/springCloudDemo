/**
 * Created by wjb on 2018/7/19.
 */
public class Z1 extends Block {
    final private int w = 3, h = 2;

    Z1() {
        super();
        bk = new int[h][w];
        kb = new int[w][h];
        bk[0][0] = bk[0][1] = bk[1][1] = bk[1][2] = 1;
        kb[2][0] = kb[1][0] = kb[1][1] = kb[0][1] = 1;
    }

    public void Turn() {
        if (type == 0)
            type = 1;
        else
            type = 0;
    }
}
