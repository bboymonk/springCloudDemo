import java.util.Random;

/**
 * Created by wjb on 2018/7/19.
 */
public class triangle extends Block {
    final private int w = 3, h = 2;

    triangle() {
        super();
        bk = new int[h][w];
        kb = new int[w][h];
        triangle(type);
    }

    //随机创建四种三角形状的一种
    private void triangle(int type) {
        Random r = new Random();
        if (type == 0) {
            if (r.nextInt(2) == 0) {
                bk[0][1] = bk[1][0] = bk[1][1] = bk[1][2] = 1;
            } else {
                bk[1][1] = bk[0][0] = bk[0][1] = bk[0][2] = 1;
            }
        } else {
            if (r.nextInt(2) == 0) {
                kb[1][0] = kb[0][1] = kb[1][1] = kb[2][1] = 1;
            } else {
                kb[1][1] = kb[0][0] = kb[1][0] = kb[2][0] = 1;
            }
        }

    }

    //旋转方法利用数组的特性赋值
    public void Turn() {
        if (type == 0) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    kb[j][h - i - 1] = bk[i][j];
                }
            }
            type = 1;
        } else {
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    bk[j][w - i - 1] = kb[i][j];
                }
            }
            type = 0;
        }
    }
}
