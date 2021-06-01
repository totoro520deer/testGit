package com.xw;

import com.sun.glass.ui.Size;

import java.util.*;

/**
 * @Description:
 * @author: XiongWei
 * @date 2021/4/25
 */
public class Test1 {
    //我的思路之聚合分页
    public void page (int pageSize,int pageNo){
        //每个节点和节点患者数量
        HashMap<String,Integer> map = new HashMap<>();
        map.put("30001",10);
        map.put("30002",2);
        map.put("30003",50);
        map.put("30004",1000);
        map.put("30005",10002);
        map.put("30003",10201);
        map.put("30007",45032);
        //需要的最后一条在哪个位置
        int num = pageNo* pageSize;
        //每个节点集合
        Set<String> strings = map.keySet();
        //满足分页查询的这个节点和之前节点的患者总数
        int count = 0;
        //满足分页查询的这个节点的上面所有节点的患者总数
        int lastCount =0;
        //满足分页查询的这个节点的上面所有节点集合
        List<String> lastNodeList = new ArrayList<>();
        for (String string : strings) {
            //每个节点患者数目
            Integer nodeCount = map.get(string);
            //当前患者总数
            count+=nodeCount;
            //未满足查询位置继续取下个节点
            if(count<num){
                lastCount =count;
                lastNodeList.add(string);
                continue;
            }
            //已找到需要节点，再定位需要患者节点位置

            //找到的需要的最后节点患者数
            int thisNodeNum =num-lastCount;
            //最后节点患者不足一页还需要反查
            //最后节点需要条数查询数据库截取
            int pageLeft = pageSize-thisNodeNum;
            if (pageLeft<=0){
                //全部数据在该节点
            }else{
                Collections.reverse(lastNodeList);
                for (String s : lastNodeList) {
                    Integer integer = map.get(s);
                    if (pageLeft<=integer){
                        //全部数据在该节点查数据库截取
                        break;
                    }else {
                        //本节点全部数据都要
                        pageLeft = pageLeft-integer;
                        continue;
                    }


                }
            }


        }


    }
}
