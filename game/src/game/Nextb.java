package game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wjb on 2018/7/19.
 */
public class Nextb extends JPanel {
    int Size;
    private static int[][] paint;//预览方块

    Nextb() {
        Size = 40;
        paint = null;
    }

    Nextb(int[][] p)//构造预览方块
    {
        Size = 40;
        paint = new int[p.length][p[0].length];

        for (int i = 0; i < p.length; i++)
            for (int j = 0; j < p[0].length; j++)
                paint[i][j] = p[i][j];

        repaint();

    }

    public void paintComponent(Graphics gg)//绘制面板
    {
        super.paintComponent(gg);//刷新面板，以免重叠

        if (paint != null) {
            for (int i = 0; i < paint.length; i++)
                for (int j = 0; j < paint[0].length; j++) {
                    gg.setColor(Color.GREEN);
                    if (paint[i][j] == 1)
                        gg.fillRect((Size + 1) * j + 15, (Size + 1) * i + 25, Size, Size);

                }
        }
    }
}
