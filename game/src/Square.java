/**
 * Created by wjb on 2018/7/19.
 */
public class Square extends Block {
    final private int w = 2, h = 2;

    Square() {
        super();
        bk = new int[h][w];
        kb = new int[w][h];
        for (int i = 0; i < w; i++)
            for (int j = 0; j < h; j++) {
                bk[i][j] = 1;
                kb[j][i] = 1;
            }
    }
}
