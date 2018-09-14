package game;

import java.util.Random;

/**
 * Created by wjb on 2018/7/19.
 */
public class Block {

    private int x, y;//方块的坐标;
    protected int type;//方块的形态，横着是0，竖着是1
    protected int[][] bk;//横状方块
    protected int[][] kb;//竖状方块


    protected Block()//创建坐标，类型
    {
        Random random = new Random();
        x = random.nextInt(7);//随机方块出现的位置
        y = 0;
        type = random.nextInt(2);//随机方块类型（横，竖）
    }


    //获取方块坐标
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //获取方块类型
    public int getType() {
        return type;
    }

    //获取数组宽度和高度
    public int getwidth() {
        return getBlock(type)[0].length;
    }

    public int getheigth() {
        return getBlock(type).length;
    }

    //根据类型返回状态方块
    public int[][] getBlock(int type) {
        if (type == 0)
            return bk;
        else
            return kb;
    }

    public void Down()//下降方法
    {
        y++;
    }

    public void Left()//左移方法
    {
        x--;
    }

    public void Right()//右移方法
    {
        x++;
    }

    public void Turn()//旋转方法
    {

    }

}
